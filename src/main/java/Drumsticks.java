public class Drumsticks implements ISell {
    private ItemType type;
    private Double buyPrice;
    private Double sellPrice;
    private String name;

    public Drumsticks(ItemType type, Double buyPrice, Double sellPrice, String name){
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.name = name;
    }

    public ItemType getItemType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double calculateMarkUp(){
       return Math.round((this.buyPrice/this.sellPrice*100)*100d)/100d;
    }
}
