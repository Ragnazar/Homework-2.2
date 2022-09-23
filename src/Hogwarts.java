public class Hogwarts {
    private int magicPower;
    private int transgressionLength;
    private String name;

    public Hogwarts(String name, int magicPower, int transgressionLength) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionLength = transgressionLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionLength() {
        return transgressionLength;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionLength(int transgressionLength) {
        this.transgressionLength = transgressionLength;
    }


}
