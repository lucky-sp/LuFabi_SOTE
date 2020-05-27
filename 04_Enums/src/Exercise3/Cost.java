package Exercise3;

import java.text.DecimalFormat;

public class Cost {

    private int amount;
    Currency curr;

    public Cost(int amount, Currency curr) {
        this.amount = amount;
        this.curr = curr;
    }

    DecimalFormat df = new DecimalFormat("###.##");

    public String getAmountInCurrency(Currency currency) {

        double value = this.amount / curr.getConversionFactor();
        return "converted into " + currency.getCurrency() + " " + df.format(value);
    }
}
