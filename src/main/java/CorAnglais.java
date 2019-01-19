public class CorAnglais extends Instrument {
    private String reedType;

    public CorAnglais(ItemType type, String primaryMaterial, String reedType, String name, Double buyPrice, Double sellPrice){
        super(type, primaryMaterial, name, buyPrice, sellPrice);
        this.reedType = reedType;
    }

    public String getReedType(){
        return this.reedType;
    }

    public void setReedType(String newReedType){
        this.reedType = newReedType;
    }

}
