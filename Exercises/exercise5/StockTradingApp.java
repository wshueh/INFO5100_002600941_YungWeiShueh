public class StockTradingApp {
    public static void main(String[] args) {

        StockManager manager = StockManager.getInstance();
        RetailTrader peter = new RetailTrader("Peter");
        RetailTrader katy = new RetailTrader("Katy");

        manager.addObserver(peter);
        manager.addObserver(katy);

        manager.setStockPrice("META", 120.00);
        manager.setStockPrice("AMZN", 100.00);

        Message message = MessageFactory.createMessage("simple", "<Alert: Stock prices updated!>");
        System.out.println(message.getContent());
    }
}
