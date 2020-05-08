package OOP.Composition;

public class Case {
    private String model;
    private String manufracture;
    private String powerSupply;
    private Dimensions dimensions;



    public void pressPowerButton(){
        System.out.println("SYSTEM RUNINNG");
    }
    public String getModel() {
        return model;
    }

    public String getManufracture() {
        return manufracture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Case(String model, String manufracture, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufracture = manufracture;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
}
