import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int getStockSize() {
        return this.stock.size();
    }

    public void addItemToStock(ISell newISell) {
        this.stock.add(newISell);
    }

    public void removeItemFromStock(ISell item) {
        this.stock.remove(item);
    }

    public String getStock() {
        return stock.toString();
    }

    public Double calculateFullStockProfit(){
        Double totalStock = 0.00;
        for (ISell item: this.stock) {
           totalStock += item.returnMarkUpAsCash();
        }
        return totalStock;
    }

}
