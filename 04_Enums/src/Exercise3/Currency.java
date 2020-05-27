package Exercise3;

public enum Currency {

    Euro("Euro",1),
    Dollar("Dollar", 1.1),
    Franken("Franken",1.07);


    private String currency;
    private double conversionFactor;

    Currency(String currency, double conversionFactor) {
        this.currency = currency;
        this.conversionFactor = conversionFactor;
    }

    public String getCurrency() {
        return currency;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}
