package Exercise3;

import java.net.StandardSocketOptions;

public class CurrencyMain {

    public static void main (String[]args) {

        Cost cost = new Cost(5,Currency.Dollar);
        System.out.println(cost.getAmountInCurrency(Currency.Euro));
    }
}
