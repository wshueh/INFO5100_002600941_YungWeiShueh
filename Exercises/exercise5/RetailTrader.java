class RetailTrader implements Trader {

    // Implements Trader interface to receive and display stock price updates for retail traders
    private String name;

    public RetailTrader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock, double price) {
        System.out.println(name + " observed a price update for " + stock + " : now $" + price);
    }
}

