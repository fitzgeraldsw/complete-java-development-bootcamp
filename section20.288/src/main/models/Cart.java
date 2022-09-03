package main.models;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cart {

    ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }

    /**
     * Function name: add
     * @param item 
     * @return (boolean) <-------
     * 
     * Inside the function:
     *   1. adds an Item object
     *   2. returns true <-------
     */
    public boolean add(Item item) {

        if (this.items.contains(item)) {
            return false;
        }
        this.items.add(new Item(item));
        return true;
    }

    /**
     * Function name: remove
     * @param name
     * 
     * Inside the function:
     *   1. nothing
     */
    public void remove(String name) {

        if (this.items.isEmpty()) {
            throw new IllegalStateException("your cart is empty.  you can't remove any items");
        }

        this.items.removeIf((item) -> {
            return item.getName().equals(name);
        });


        // for (int i = 0; i < this.items.size(); i++) {
        //     if (this.items.get(i).getName().equals(name)) {
        //         this.items.remove(i);
        //     }
        // }
    }

     /**
     * Function name: getSubtotal
    * @return double
    * 
    * Inside the function:
    *   1. return -2
    */
    public double getSubtotal() {

        return this.items.stream().mapToDouble((item) -> item.getPrice()).sum();

        // double amount = 0.00;
        // for (int i = 0; i < this.items.size(); i++) {
        //     amount += this.items.get(i).getPrice();
        // }
        // return amount;
    }

     /**
     * Function name: getTax
    * @param double (subtotal)
    * @return double
    * 
    * Inside the function:
    *   1. return -2
    */
    public double getTax(double subtotal) {

        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(subtotal * 0.13));

    }

     /**
     * Function name: getTotal
    * @param double (subtotal)
    * @param double (tax)
    * @return (double)
    * 
    * Inside the function:
    *   1. returns -2
    */
    public double getTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    public String checkout() {

        if (this.items.isEmpty()) {
            throw new IllegalStateException("your cart is empty.  you can't check out");
        }
        
        return "\tRECEIPT\n\n" +
        "\tSubtotal: $" + getSubtotal() + "\n" +
        "\tTax: $" + getTax(getSubtotal()) + "\n" +
        "\tTotal: $" + getTotal(getSubtotal(), getTax(getSubtotal())) + "\n";
    }

    public void clear() {
        this.items.clear();
    }

    public boolean contains(Item item) {
        return this.items.contains(item);
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }

}