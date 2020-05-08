package OOP.Composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    public void playHonkai(){
        motherBoard.loadProgram(" HonkaiImpact3rd ");
        drawtheGameLogo();
    }
    public void drawtheGameLogo(){
        monitor.drawPixelAt(3000,3000," red ");
    }
    public void drawLogo(){
        monitor.drawPixelAt(1200,1200," Yellow ");
    }

}
