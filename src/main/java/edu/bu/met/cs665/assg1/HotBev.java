/*
    Shelby Goudy
    CS665 O2
    Wk 1 Assignment
    13 Jul 21
*/

package edu.bu.met.cs665.assg1;

public abstract class HotBev implements ICondiments{

    int sugar = 0;
    int milk = 0;

    String type;
    String ingredients;
    String price;


    public String getPrice() {
        System.out.println("Your drink total is $" + this.price + ".");
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public void addSugar(int qty) {
        int totalSugars = qty + this.sugar;
        if (totalSugars < 3){
            System.out.println(qty + " sugar(s) added");
            this.sugar = this.sugar + qty;
        } else if (totalSugars > 3){
            System.out.println("Sorry, but your drink limit is 3 sugars.");
        } else {
            System.out.println("You've reached your sugar limit.");
        }
    }

    @Override
    public void addMilk(int qty) {

        int totalMilks = qty + this.milk;

        if (totalMilks < 3){
            System.out.println(qty + " milk(s) added");
            this.milk = this.milk + qty;

        } else if (totalMilks > 3){
            System.out.println("Sorry, but your drink limit is 3 milks.");
        } else {
            System.out.println("You've reached your milk limit.");
        }
    }




}
