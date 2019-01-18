public class Timpani extends Instrument {
    private Integer numberOfDrums;

    public Timpani(ItemType type, String primaryMaterial, Integer numberOfDrums, String name){
        super(type, primaryMaterial, name);
        this.numberOfDrums = numberOfDrums;
    }

    public Integer getNumberOfDrums(){
        return this.numberOfDrums;
    }


    public void setNumberOfDrums(Integer newNumberOfDrums){
        this.numberOfDrums = newNumberOfDrums;
    }


}
