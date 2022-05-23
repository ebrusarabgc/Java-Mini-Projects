package BeybladeFactoryProgram;

public class Beyblade {
    private String owner;
    private int spinningSpeed;
    private int attackPower;

    public Beyblade(String owner, int spinningSpeed, int attackPower) {
        this.owner = owner;
        this.spinningSpeed = spinningSpeed;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(owner + " attacked with " + attackPower + " and " + spinningSpeed);
    }

    public void showBitBeast() {
        System.out.println("This Beyblade doesn't have a bit-beast.");
    }

    public void showInfo() {
        System.out.println("Beyblader Name: " + owner);
        System.out.println("Power of Attack: " + attackPower);
        System.out.println("Spinning Speed: " + spinningSpeed);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSpinningSpeed() {
        return spinningSpeed;
    }

    public void setSpinningSpeed(int spinningSpeed) {
        this.spinningSpeed = spinningSpeed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
