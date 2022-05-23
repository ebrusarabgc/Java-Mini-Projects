package BeybladeFactoryProgram;

public class Draciel extends Beyblade{
    private final String bitBeast;

    public Draciel(String owner, int spinningSpeed, int attackPower, String bitBeast) {
        super(owner, spinningSpeed, attackPower);
        this.bitBeast = bitBeast;
    }

    @Override
    public void showBitBeast() {
        System.out.println(getOwner() + " presents " + bitBeast);
        System.out.println(getOwner() + "'s secret defense is Castle Defense.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bit Beast Name: " + bitBeast);
    }
}
