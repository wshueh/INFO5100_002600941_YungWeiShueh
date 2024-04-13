import java.util.*;

class StockManager {
    
    private static StockManager instance;
    private Map<String, Double> stockPrices;
    private List<Trader> observers;

    private StockManager() {
        stockPrices = new HashMap<>();
        observers = new ArrayList<>();
    }

    public static StockManager getInstance() {
        if (instance == null) {
            instance = new StockManager();
        }
        return instance;
    }

    public void addObserver(Trader observer) {
        observers.add(observer);
    }

    public void removeObserver(Trader observer) {
        observers.remove(observer);
    }

    public void setStockPrice(String stock, double price) {
        stockPrices.put(stock, price);
        notifyObservers(stock, price);
    }

    private void notifyObservers(String stock, double price) {
        for (Trader observer : observers) {
            observer.update(stock, price);
        }
    }
}
