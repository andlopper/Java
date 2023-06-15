package utils;

public class CurrencyConverter {
    public static double totalReais(double dollarPrice, double totalDollar){
        return dollarPrice * totalDollar + (totalDollar * dollarPrice * 6 / 100);
    }
}
