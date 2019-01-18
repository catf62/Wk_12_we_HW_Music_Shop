public abstract class Instrument {
    private ItemType type;
    private String primaryMaterial;

    public Instrument(ItemType type, String primaryMaterial){
        this.type = type;
        this.primaryMaterial = primaryMaterial;
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
}
