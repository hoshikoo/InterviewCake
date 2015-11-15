package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        int[]  stockPricesYesterday = {10, 7, 5, 8, 11, 9};
//        System.out.println("best margin is: " + StockPrice.getBestMargin(stockPricesYesterday));
//
//        int[]  stockPricesYesterday2 = {11,7,5,8,10,9};
//        System.out.println("best margin is: " + StockPrice.getBestMargin(stockPricesYesterday2));
//
//        int[]  stockPricesYesterday3 = {7,8,11,9,10,5};
//        System.out.println("best margin is: " + StockPrice.getBestMargin(stockPricesYesterday3));
//
//        int[]  stockPricesYesterday4 = {7,8,10,6,11,5};
//        System.out.println("best margin is: " + StockPrice.getBestMargin(stockPricesYesterday4));
//
//        int[]  stockPricesYesterday5 = {7,8,11,6,10,5};
//        System.out.println("best margin is: " + StockPrice.getBestMargin(stockPricesYesterday5));
//
//        int[]  stockPricesYesterday6 = {};
//        System.out.println("best margin is: " + StockPrice.getBestMargin(stockPricesYesterday6));
//
//        int[]  stockPricesYesterday7 = {5};
//        System.out.println("best margin is: " + StockPrice.getBestMargin(stockPricesYesterday7));

        int[]  list = {1, 7, 3, 4};
        System.out.println("the product of every integer except the integer at that index is: " + ProductOfOtherNum.getProductsOfAllExceptAtIndex(list));

        int[]  list2 = {1, 7, 7, 3, 4};
        System.out.println("the product of every integer except the integer at that index is: " + ProductOfOtherNum.getProductsOfAllExceptAtIndex(list2));
    }
}
