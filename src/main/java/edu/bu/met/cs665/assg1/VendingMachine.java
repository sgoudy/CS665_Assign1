/*
    Shelby Goudy
    CS665 O2
    Wk 1 Assignment
    13 Jul 21
*/

package edu.bu.met.cs665.assg1;

import edu.bu.met.cs665.Main;

public class VendingMachine{

    private int espressoStock, lattemacchiatoStock, americanoStock, greenTeaStock,
            yellowTeaStock, blackTeaStock;
    private static HotBev bev;


    /**
     * Set initial stock quantities
     */
    public void stockMachine(){

        // set stock quantities
        this.espressoStock = 30;
        this.lattemacchiatoStock = 50;
        this.americanoStock = 40;
        this.greenTeaStock = 0;
        this.yellowTeaStock = 20;
        this.blackTeaStock = 30;
    }


    /**
     * User chooses to view description and price before selecting 'Brew'.
     * @param drink String: drink of choice
     */
    public static void viewInfo(String drink){

        HotBev b;
        String i = "";
        String p = "";

        // based on drink selection, instantiates a new drink Object
        // and prints description and price

        if (drink.equals("espresso")){
            b = new Espresso();
            i += b.getDescription();
            p += b.getPrice();

        } else if (drink.equals("latte macchiato")) {
            b = new LatteMacchiato();
            i += b.getDescription();
            p += b.getPrice();

        } else if (drink.equals("americano")){
            b = new Americano();
            i += b.getDescription();
            p += b.getPrice();

        } else if (drink.equals("green tea")){
            b = new GreenTea();
            i += b.getDescription();
            p += b.getPrice();

        } else if (drink.equals("yellow tea")){
            b = new YellowTea();
            i += b.getDescription();
            p += b.getPrice();

        } else if (drink.equals("black tea")){
            b = new BlackTea();
            i += b.getDescription();
            p += b.getPrice();

        }
        System.out.println("A(n) " + drink + " has " + i + "\nPrice: " + p);
    }


    /**
     * Users selects drink for brewing and if in stock,
     * the drink is brewed.
     * @param drink
     * @return
     */
    public HotBev makeRequest(String drink) {

        System.out.println(System.lineSeparator() + "\nDispensing " + drink + ".");

        // for each type of drink, this if/else block instantiates
        // and returns the appropriate drink object

        if (drink.toLowerCase().equals("espresso") && getEspressoStock() > 0) {
            bev = new Espresso();
            setEspressoStock(--this.espressoStock);

        } else if (drink.toLowerCase().equals("latte macchiato") && getLattemacchiatoStock() > 0) {
            bev = new LatteMacchiato();
            setLattemacchiatoStock(--this.lattemacchiatoStock);

        } else if (drink.toLowerCase().equals("americano") && getAmericanoStock() > 0) {
            bev = new Americano();
            setAmericanoStock(--this.americanoStock);

        } else if (drink.toLowerCase().equals("green tea") && getGreenTeaStock() > 0) {
            bev = new GreenTea();
            setGreenTeaStock(--this.greenTeaStock);

        } else if (drink.toLowerCase().equals("yellow tea") && getYellowTeaStock() > 0) {
            bev = new YellowTea();
            setYellowTeaStock(--this.yellowTeaStock);

        } else if (drink.toLowerCase().equals("black tea") && getBlackTeaStock() > 0) {
            bev = new BlackTea();
            setBlackTeaStock(--this.blackTeaStock);

        } else {
            bev = null;
            System.out.println("Sorry, " + drink + " out of stock.");
        }
        return bev;
    }


    public int getEspressoStock() {
        return espressoStock;
    }


    public void setEspressoStock(int espressoStock) {
        this.espressoStock = espressoStock;
    }


    public int getLattemacchiatoStock() {
        return lattemacchiatoStock;
    }


    public void setLattemacchiatoStock(int lattemacchiatoStock) {
        this.lattemacchiatoStock = lattemacchiatoStock;
    }


    public int getAmericanoStock() {
        return americanoStock;
    }


    public void setAmericanoStock(int americanoStock) {
        this.americanoStock = americanoStock;
    }


    public int getGreenTeaStock() {
        return greenTeaStock;
    }


    public void setGreenTeaStock(int greenTeaStock) {
        this.greenTeaStock = greenTeaStock;
    }


    public int getYellowTeaStock() {
        return yellowTeaStock;
    }


    public void setYellowTeaStock(int yellowTeaStock) {
        this.yellowTeaStock = yellowTeaStock;
    }


    public int getBlackTeaStock() {
        return blackTeaStock;
    }


    public void setBlackTeaStock(int blackTeaStock) {
        this.blackTeaStock = blackTeaStock;
    }
}
