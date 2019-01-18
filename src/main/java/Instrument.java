public abstract class Instrument {
    private ItemType type;
    private String primaryMaterial;
    private String name;

    public Instrument(ItemType type, String primaryMaterial, String name){
        this.type = type;
        this.primaryMaterial = primaryMaterial;
        this.name = name;
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
}
