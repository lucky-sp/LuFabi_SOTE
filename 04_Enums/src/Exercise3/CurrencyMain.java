package Exercise3;

import java.net.StandardSocketOptions;

public class CurrencyMain {

    public static void main (String[]args) {

        Cost cost = new Cost(5,Currency.Dollar);
        String amountInCurrency = cost.getAmountInCurrency(Currency.Euro);
        System.out.println(amountInCurrency);
    }
}
