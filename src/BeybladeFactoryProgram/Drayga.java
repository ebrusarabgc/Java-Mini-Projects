package BeybladeFactoryProgram;

public class Drayga extends Beyblade{
    private final String bitBeast;

    public Drayga(String owner, int spinningSpeed, int attackPower, String bitBeast) {
        super(owner, spinningSpeed, attackPower);
        this.bitBeast = bitBeast;
    }

    @Override
    public void showBitBeast() {
        System.out.println(getOwner() + " presents " + bitBeast);
        System.out.println(getOwner() + "'s secret attack is Tiger Claw.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bit Beast Name: " + bitBeast);
    }
}
