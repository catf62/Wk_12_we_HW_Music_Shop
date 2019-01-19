public class Timpani extends Instrument {
    private Integer numberOfDrums;

    public Timpani(ItemType type, String primaryMaterial, Integer numberOfDrums, String name, Double buyPrice, Double sellPrice){
        super(type, primaryMaterial, name, buyPrice, sellPrice);
        this.numberOfDrums = numberOfDrums;
    }

    public Integer getNumberOfDrums(){
        return this.numberOfDrums;
    }


    public void setNumberOfDrums(Integer newNumberOfDrums){
        this.numberOfDrums = newNumberOfDrums;
    }


}
