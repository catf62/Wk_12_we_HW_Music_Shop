public abstract class Instrument implements ISell {
    private ItemType type;
    private String primaryMaterial;
    private String name;
    private Double buyPrice;
    private Double sellPrice;

    public Instrument(ItemType type, String primaryMaterial, String name, Double buyPrice, Double sellPrice){
        this.type = type;
        this.primaryMaterial = primaryMaterial;
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public ItemType getType(){
        return this.type;
    }

    public void setType(ItemType newType){
        this.type = newType;
    }

    public String getPrimaryMaterial(){
        return this.primaryMaterial;
    }

    public void setPrimaryMaterial(String newMaterial){
        this.primaryMaterial = newMaterial;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }


    public String play(){
        return "Now playing " + this.name;
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

    public Double calculateMarkUp(){
        return Math.round((this.buyPrice/this.sellPrice*100)*100d)/100d;
    }

    public Double returnMarkUpAsCash(){
        return sellPrice-buyPrice;
    }
}
