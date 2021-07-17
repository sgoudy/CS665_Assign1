/*
    Shelby Goudy
    CS665 O2
    Wk 1 Assignment
    13 Jul 21
*/

package edu.bu.met.cs665.beverages;

/**
 * Abstract parent class for all beverages
 */
public abstract class HotBev implements ICondiments {

    int sugar = 0;
    int milk = 0;

    String type;
    String description;
    String price;


    /**
     * Adds sugars to drink if drink contains 3 or less sugars. If request is for more
     * than 3, limits drink to 3 sugars.
     * @param qty
     */
    @Override
    public void addSugar(int qty) {

        // checks for requested qty
        int totalSugars = qty + this.sugar;

        if (totalSugars < 3){
            System.out.println(qty + " sugar(s) added");
            this.sugar = this.sugar + qty;

        } else if (totalSugars >= 3) {
            this.sugar = 3;
            System.out.println("Sorry, but your drink limit is 3 sugars. You now have " + this.sugar + " sugars.");
        }
    }


    /**
     * Adds milks to drink if drink contains 3 or less milks. If request is for more
     * than 3, limits drink to 3 milks.
     * @param qty
     */
    @Override
    public void addMilk(int qty) {

        // checks for requested qty
        int totalMilks = qty + this.milk;

        if (totalMilks < 3){
            System.out.println(qty + " milk(s) added");
            this.milk = this.milk + qty;

        } else if (totalMilks >= 3){
            this.milk = 3;
            System.out.println("Sorry, but your drink limit is 3 milks. You now have " + this.milk + " milks.");

        }
    }


    public String getPrice() {
        return this.price;
    }


    public void setPrice(String price) {
        this.price = price;
    }


    public String getType() {
        return type;
    }


    public String getDescription() {
        return description;
    }


    public int getSugar() {
        return sugar;
    }


    public int getMilk() {
        return milk;
    }

}
