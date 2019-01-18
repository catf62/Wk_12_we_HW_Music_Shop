public class CorAnglais extends Instrument {
    private String reedType;

    public CorAnglais(String reedType){
        this.reedType = reedType;
    }

    public String getReedType(){
        return this.reedType;
    }

    public void setReedType(String newReedType){
        this.reedType = newReedType;
    }

}
