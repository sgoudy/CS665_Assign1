package edu.bu.met.cs665;

import edu.bu.met.cs665.assg1.*;
import org.junit.Assert;
import org.junit.Test;


public class TestVendingMachine {

  public TestVendingMachine() {}

  @Test
  public void testEspresso() {
    HotBev esp = new Espresso();
    Assert.assertEquals("3.00", esp.getPrice());
  }

  @Test
  public void testBlackTea() {
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
  public void testTotalStock(){
    VendingMachine vm = Main.stockMachine();

    Assert.assertEquals(180, vm.getTotalStock());
    vm.checkAvailability("americano");

    vm.getTotalStock();
    Assert.assertEquals(179, vm.getTotalStock());

  }

}
