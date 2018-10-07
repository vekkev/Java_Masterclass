package at.fhj.swd;

public class Case {

    private String model;
    private String maufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String maufacturer,
                String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.maufacturer = maufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }


    public void pressPowerButton (){
        System.out.println("Power buttoin pressed");
    }


    public String getModel() {
        return model;
    }

    public String getMaufacturer() {
        return maufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
