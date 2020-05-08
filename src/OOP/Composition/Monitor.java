package OOP.Composition;

public class Monitor {
    private String model;
    private String manufracture;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufracture, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufracture = manufracture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println("draw at "+x+ " and "+y+"in colors"+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufracture() {
        return manufracture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
