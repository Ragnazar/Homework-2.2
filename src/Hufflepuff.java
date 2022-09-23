public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honour;

    public Hufflepuff(String name, int magicPower, int transgressionLength,
                      int diligence, int loyalty, int honour) {
        super(name, magicPower, transgressionLength);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honour = honour;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }
}
