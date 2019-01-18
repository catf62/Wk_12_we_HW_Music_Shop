public class CorAnglais extends Instrument {
    private String reedType;

    public CorAnglais(ItemType type, String primaryMaterial, String reedType){
        super(type, primaryMaterial);
        this.reedType = reedType;
    }

    public String getReedType(){
        return this.reedType;
    }

    public void setReedType(String newReedType){
        this.reedType = newReedType;
    }

}
