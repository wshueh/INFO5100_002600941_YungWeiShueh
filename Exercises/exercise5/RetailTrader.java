class RetailTrader implements Trader {

    private String name;

    public RetailTrader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock, double price) {
        System.out.println(name + " observed a price update for " + stock + " : now $" + price);
    }
}

