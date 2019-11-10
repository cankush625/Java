package com.collections.sorted_collections.sorted_collections_challenge;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    public final String name;
    public final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>(); //TreeMap adds the records alphabetically
    }

    /**
     *
     * @param item item of the type map contains item details
     * @param quantity contains the quantity of the item of the type integer
     * @return returns the quantity of the item in the basket
     */
    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    /**
     *
     * @param item item to be remove from the basket
     * @param quantity the number of items to be remove from the basket
     * @return returns the number of items removed from the basket
     */
    public int removeFromBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            //Check if we already have the item in the basket
            int inBasket = list.getOrDefault(item, 0);
            int newQuantity = inBasket - quantity;

            if (newQuantity > 0) {
                list.put(item, newQuantity);
                return quantity;
            } else if (newQuantity == 0) {
                list.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    /**
     * This method clears the items added in the basket
     */
    public void clearBasket() {
        this.list.clear();
    }

    public Map<StockItem, Integer> items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}

//by Ankush Chavan