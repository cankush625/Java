package com.collections.sorted_collections.sorted_collections_challenge;

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
                item.adjustStock(inStock.availableQuantity());
            }

            list.put(item.getName(), item);
            return item.availableQuantity();
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
        StockItem inStock = list.get(item);

        if ((inStock != null) && (quantity > 0)) {
            return inStock.finalizeStock(quantity);
        }
        return 0;
    }

    /**
     * This method reserves the item
     * <p>
     *
     * @param item name of the item
     * @param quantity number if items to be reserve
     * @return returns the number of items reserved
     */
    public int reserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);
        if ((inStock != null) && (quantity > 0)) {
            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    /**
     * This method un-reserves the item
     * <p>
     *
     * @param item name of the item
     * @param quantity number if items to be un-reserve
     * @return returns the number of items un-reserved
     */
    public int unreserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);
        if ((inStock != null) && (quantity > 0)) {
            return inStock.unreserveStock(quantity);
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

            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            s = s + stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of" + ((stockItem.availableQuantity() == 1) ? " item " : " items ");
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }
        return s + String.format("Total stock value %.2f", totalCost);
    }
}

//by Ankush Chavan