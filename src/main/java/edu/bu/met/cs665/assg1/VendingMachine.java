/*
    Shelby Goudy
    CS665 O2
    Wk 1 Assignment
    13 Jul 21
*/

package edu.bu.met.cs665.assg1;

import edu.bu.met.cs665.Main;

public class VendingMachine{

    int espressoStock, lattemacchiatoStock, americanoStock, greenTeaStock, yellowTeaStock, blackTeaStock;
    int totalStock;

    public void stockMachine(){
        int i = 0;

        // restock hot drinks on machine start
        while (i < 30){
            new Espresso();
            espressoStock++;
            new Americano();
            americanoStock++;
            new LatteMacchiato();
            lattemacchiatoStock++;

            new BlackTea();
            blackTeaStock++;
            new YellowTea();
            yellowTeaStock++;
            new GreenTea();
            greenTeaStock++;
            i++;
        }
        System.out.println("Total stock: \n" +
                "Espresso: " + espressoStock +
                "\nAmericano: " + americanoStock +
                "\nLatte Macchiato: " + lattemacchiatoStock +
                "\nGreen Tea: " +greenTeaStock +
                "\nBlack Tea: " + blackTeaStock +
                "\nYellow Tea: " + yellowTeaStock);
        setTotalStock();
    }


    public boolean checkAvailability(String type) {

        boolean available = true;

        switch (type.toLowerCase()) {
            case "espresso":
                if (this.espressoStock > 0){
                    Main.makeDrink(type);
                    this.espressoStock--;
                    break;
                } else {
                    available = false;
                }
            case "americano":
                if (this.americanoStock > 0) {
                    Main.makeDrink(type);
                    this.americanoStock--;
                    break;
                } else {
                    available = false;
                }
            case "latte macchiato":
                if (this.lattemacchiatoStock > 0){
                    Main.makeDrink(type);
                    this.lattemacchiatoStock--;
                    break;
                } else {
                    available = false;
                }
            case "green tea":
                if (this.greenTeaStock > 0) {
                    Main.makeDrink(type);
                    this.greenTeaStock--;
                    break;
                } else {
                    available = false;
                }
            case "black tea":
                if (this.blackTeaStock > 0){
                    Main.makeDrink(type);
                    this.blackTeaStock--;
                    break;
                } else {
                    available = false;
                }
            case "yellow tea":
                if (this.yellowTeaStock > 0){
                    Main.makeDrink(type);
                    this.yellowTeaStock--;
                    break;
                } else {
                    available = false;
                }
            default:
                Main.makeDrink("americano");
        }
        setTotalStock();
        return available;
    }


    public void setTotalStock() {
        this.totalStock = espressoStock + americanoStock + lattemacchiatoStock + blackTeaStock + yellowTeaStock +
                greenTeaStock;;
    }

    public int getTotalStock() {
        return totalStock;
    }
}
