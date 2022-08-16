public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;


    public Gryffindor(String name, int magicPower, int transgressionLength,
                      int honour, int bravery, int nobility) {
        super(name, magicPower, transgressionLength);
        this.honour = honour;
        this.bravery = bravery;
        this.nobility = nobility;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


}
