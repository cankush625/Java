package com.collections.sorted_collections.sorted_collections_challenge;

import java.util.Map;

public class StockItemManager {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 6.20, 8);
        stockList.addStock(temp);

        temp = new StockItem("smartphone", 90.10, 16);
        stockList.addStock(temp);

        temp = new StockItem("juice", 5.28, 20);
        stockList.addStock(temp);

        temp = new StockItem("laptop", 128.35, 4);
        stockList.addStock(temp);

        temp = new StockItem("cup", 2.20, 10);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s: stockList.items().keySet()) {
            System.out.println(s);
        }

        //purchasing items
        //adding to the basket
        Basket ankushsBasket = new Basket("Ankush");

        sellItem(ankushsBasket, "smartphone", 2);
        System.out.println(ankushsBasket);

        if (sellItem(ankushsBasket, "laptop", 3) != 1) { //checking if the item is available
            System.out.println("There are no more laptops in the stock");
        }
        sellItem(ankushsBasket, "juice", 3);

        sellItem(ankushsBasket, "bread", 3);
        sellItem(ankushsBasket, "cake", 1);
        sellItem(ankushsBasket, "cup", 2);

//        System.out.println(stockList);

        Basket basket = new Basket("customer");
        sellItem(basket, "juice", 2);
        sellItem(basket, "bread", 20);
        removeItem(basket, "bread", 3);
        System.out.println(basket);

        removeItem(ankushsBasket, "juice", 1);
        removeItem(ankushsBasket, "bread", 1);
        System.out.println(ankushsBasket);

        System.out.println("Display stockList before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

/*
        //This returns error because we have make stockList.items() to return unmodifiableMap
        temp = new StockItem("keyboard", 10.60);
        stockList.items().put(temp.getName(), temp);
*/

        //Adjusting the stock
        StockItem laptop = stockList.items().get("laptop");
        //Adding 20 laptops in the stock
        if (laptop != null) {
            stockList.items().get("laptop").adjustStock(20); //We can get the item by using items() from stockList
//        System.out.println(stockList);
        }

        //Removing 10 items from the stock
        if (laptop != null) {
            stockList.get("laptop").adjustStock(-10); //We can also get the item directly without using items()
            System.out.println(stockList);
        }

        //Providing unmodifiable map of name and prices
//        for (Map.Entry<String, Double> price: stockList.priceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        checkOut(ankushsBasket);
        System.out.println(ankushsBasket);
    }

    /**
     * This function is for selling the item from the stock
     * <p>
     *
     * @param basket creating a basket
     * @param item name of the item
     * @param quantity quantity of the item
     * @return returns the quantity of the item
     */
    private static int sellItem(Basket basket, String item, int quantity) {
        //Retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    /**
     * Removing the item from the basket
     * <p>
     *
     * @param basket basket of the individual
     * @param item name of the item
     * @param quantity number of items
     * @return returns the number of items un-reserved
     */
    private static int removeItem(Basket basket, String item, int quantity) {
        //Retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    private static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item: basket.items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}

//by Ankush Chavan