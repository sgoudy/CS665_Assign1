/*
    Shelby Goudy
    CS665 O2
    Wk 1 Assignment
    13 Jul 21
*/

package edu.bu.met.cs665;

import edu.bu.met.cs665.assg1.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestVendingMachine {

  HotBev bev;
  VendingMachine vm;

  public TestVendingMachine() {}

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testMakeRequest(){
    vm = new VendingMachine();
    vm.makeRequest("black tea");
      bev = new BlackTea();
      bev.addMilk(2);
      bev.addSugar(2);
      bev.addMilk(3);
      bev.addSugar(2);
      Assert.assertEquals(3, bev.getMilk());
  }


  @Test
  public void testStock(){

    vm = new VendingMachine();
    vm.stockMachine();
    Assert.assertEquals(40, vm.getAmericanoStock());

    vm.makeRequest("americano");
    Assert.assertEquals(39, vm.getAmericanoStock());
  }


  @Test
  public void testGetPriceEspresso() {

    HotBev esp = new Espresso();
    Assert.assertEquals("3.00", esp.getPrice());
  }


  @Test
  public void testGetTypeBlackTea() {

    HotBev bt = new BlackTea();
    Assert.assertEquals("Black Tea", bt.getType());
  }


  @Test
  public void testSetPriceEspresso() {
    HotBev esp = new Espresso();
    esp.setPrice("12.00");
    Assert.assertEquals("12.00", esp.getPrice());
  }


  @Test
  public void testGetDescriptionGreenTea() {

    HotBev gt = new GreenTea();
    Assert.assertEquals("green coloring, healthy flavor",
            gt.getDescription());
  }

}
