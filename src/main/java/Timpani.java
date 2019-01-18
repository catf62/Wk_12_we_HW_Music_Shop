public class Timpani extends Instrument {
    private Integer numberOfDrums;

    public Timpani(Integer numberOfDrums){
        this.numberOfDrums = numberOfDrums;
    }

    public Integer getNumberOfDrums(){
        return this.numberOfDrums;
    }

    public void setNumberOfDrums(Integer newNumberOfDrums){
        this.numberOfDrums = newNumberOfDrums;
    }
}
