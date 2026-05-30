public class CurrencyConverterV2 {
    double[] exchangeRates;

    void setExchangeRates(double[] rates) {
        exchangeRates = rates;
    }

    void updateExchangeRate(int arrayIndex, double newVal) {
        exchangeRates[arrayIndex] = newVal;
    }

    double getExchangeRate(int arrayIndex) {
        return exchangeRates[arrayIndex];
    }

    double computeTransferAmount(int arrayIndex, double amount) {
        return amount * getExchangeRate(arrayIndex);
    }

    void printCurrencies() {
        System.out.println("rupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);
        System.out.println("real: " + exchangeRates[2]);
        System.out.println("chilean_peso: " + exchangeRates[3]);
        System.out.println("mexican_peso: " + exchangeRates[4]);
        System.out.println("_yen: " + exchangeRates[5]);
        System.out.println("$australian: " + exchangeRates[exchangeRates.length - 1] + "\n");
    }

    public static void main(String[] args) {
        CurrencyConverterV2 currencyConverter = new CurrencyConverterV2();
        double[] rates = new double[] {
                63.0,
                3.0,
                3.0,
                595.0,
                18.0,
                107.0,
                2.0
        };
        currencyConverter.setExchangeRates(rates);
        currencyConverter.printCurrencies();

        rates = new double[] {
                65.0,
                3.0,
                3.0,
                595.0,
                18.0,
                107.0,
                2.0
        };
        currencyConverter.setExchangeRates(rates);
        currencyConverter.printCurrencies();

        currencyConverter.updateExchangeRate(0, 32.0);
        currencyConverter.printCurrencies();

        System.out.println("\n Transfer Amount " + currencyConverter.computeTransferAmount(0, 337));
    }
}
