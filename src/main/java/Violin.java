public class Violin extends Instrument {
    private Integer numberOfStrings;

    public Violin(ItemType type, String primaryMaterial, Integer numberOfStrings){
        super(type, primaryMaterial);
        this.numberOfStrings = numberOfStrings;

    }

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(Integer numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

}
