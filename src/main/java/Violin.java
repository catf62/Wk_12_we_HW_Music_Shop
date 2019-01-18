public class Violin extends Instrument {
    private Integer numberOfStrings;

    public Violin(ItemType type, String primaryMaterial, Integer numberOfStrings, String name){
        super(type, primaryMaterial, name);
        this.numberOfStrings = numberOfStrings;

    }

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(Integer numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

}
