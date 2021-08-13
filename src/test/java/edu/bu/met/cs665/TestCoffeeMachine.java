/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665;

import edu.bu.met.cs665.drinks.HotBeverages;
import edu.bu.met.cs665.machine.CoffeeMachine;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCoffeeMachine {

  HotBeverages bev;
  CoffeeMachine cm;

  public TestCoffeeMachine() {
  }


  /**
   * Instantiates new Coffee Machine and stocks it full.
   *
   * @throws Exception
   */
  @Before
  public void setUp() throws Exception {
    cm = CoffeeMachine.getInstance();
    cm.cardInserted();
  }

  /**
   * Clean up bev so it is null after each method
   *
   * @throws Exception
   */
  @After
  public void tearDown() throws Exception {
    bev = null;
  }

  /**
   * Tests card acceptance and getSelection method after a card is accepted
   */
  @Test
  public void testGetSelection() {
    cm.cardAccepted();
    bev = cm.selectionMade("americano");
    assertEquals("Americano", bev.getName());
  }


  /**
   * Tests getPrice of beverage
   */
  @Test
  public void testGetPriceAccepted() {
    cm.cardAccepted();
    HotBeverages bev1 = cm.selectionMade("espresso");
    assertEquals(2.5, bev.getPrice(), 0);
  }


  /**
   * Tests addMilk function
   */
  @Test
  public void testAddMilk() {
    cm.cardAccepted();
    bev = cm.selectionMade("americano");
    cm.addMilk(bev);
    assertEquals(2.15, bev.getPrice(), 0);
  }


  /**
   * Tests addSugar
   */
  @Test
  public void testAddSugar() {
    cm.cardAccepted();
    bev = cm.selectionMade("green tea");
    cm.addSugar(bev);
    assertEquals(1.85, bev.getPrice(), 0);
  }


  /**
   * Tests limit of 3 Sugars
   */
  @Test
  public void testSugarLimit() {
    cm.cardAccepted();
    bev = cm.selectionMade("yellow tea");
    cm.addSugar(bev); // 2.1
    cm.addSugar(bev); // 2.2
    cm.addSugar(bev); // 2.3
    cm.addSugar(bev); // Fourth sugar won't be added
    assertEquals(1.80, bev.getPrice(), 0.01);
  }

  /**
   * Tests limit of 3 Milks
   */
  @Test
  public void testMilkLimit() {
    cm.cardAccepted();
    bev = cm.selectionMade("americano");
    cm.addMilk(bev); // 2.15
    cm.addMilk(bev); // 2.3
    cm.addMilk(bev); // 2.45
    cm.addMilk(bev); // 2.6 // Fourth sugar won't be added
    assertEquals(2.45, bev.getPrice(), 0.01);
  }

  /**
   * Tests Sold Out
   */
  @Test
  public void testSoldOut() {
    cm.soldOut();
    assertEquals("Sold out", cm.soldOut());
  }
}
