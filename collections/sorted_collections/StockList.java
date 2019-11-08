package com.collections.sorted_collections;

import java.util.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    /**
     * @param item takes the parameter item of the type StockItem
     * @return returns quantity in the stock
     */
    public int addStock(StockItem item) {
        if (item != null) {
            //Check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
//            StockItem inStock = list.get(item.getName()); //If we write this, we have to replace item by null on line no. 20
//            and comment the line no. 16 and un-comment the line no. 17
            //If there are already stocks on this item, adjust the quantity
            if (inStock != item) {
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    /**
     *
     * @param item item is of the type string
     * @param quantity quantity is of the type int. It takes quantity of the item
     * @return returns the total quantity
     */
    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);

        if ((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, Double> priceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item: list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> items() {
        return  Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of" + ((stockItem.quantityInStock() == 1) ? " item " : " items ");
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }
        return s + String.format("Total stock value %.2f", totalCost);
    }
}

//by Ankush Chavan