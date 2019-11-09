package com.collections.sorted_collections.sorted_collections_challenge;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityInStock = 0; //can be initialized later
    private int reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0;
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    /**
     * Adjusting the quantity of the stock
     * <p>
     *
     * @param quantity the number of items to be add to the stock
     */
    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }

    /**
     * It reserves the items added to the basket instead of removing the item from the list
     * <p>
     *
     * @param quantity the number of items to be reserve
     * @return returns the quantity of items to be reserve
     */
    public int reserveStock(int quantity) {
        if (quantity <= availableQuantity()) {
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    /**
     * It un-reserves the items added to the basket
     * <p>
     *
     * @param quantity the number of items to be unreserved
     * @return returns the quantity of items to be reserve
     */
    public int unreserveStock(int quantity) {
        if (quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    /**
     * It confirms the selling/buying of the item
     * <p>
     *
     * @param quantity the number of items to be buy
     * @return returns the quantity of the items purchased
     */
    public int finalizeStock(int quantity) {
        if (quantity <= reserved) {
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
//        System.out.println("Entering StockItem.equals()");
        if (obj == this) {
            return true;
        } else if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        } else {
            String objName = ((StockItem) obj).getName();
            return this.name.equals(objName);
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
//        System.out.println("Entering StockItem.compareTo");
        if (this == o) {
            return 0;
        }

        if (o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price + ". Reserved: " + this.reserved;
    }
}

//by Ankush Chavan