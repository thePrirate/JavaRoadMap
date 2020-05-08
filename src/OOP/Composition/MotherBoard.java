package OOP.Composition;

public class  MotherBoard {
private String model;
private String manufracture;
private int ramSlot;
private int cardSlot;
private String bios;

    public MotherBoard(String model, String manufracture, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.manufracture = manufracture;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Loading the program"+programName);
    }
}
