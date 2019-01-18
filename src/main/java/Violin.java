public class Violin extends Instrument {
    private Integer numberOfStrings;

    public Violin(Integer numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(Integer numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
