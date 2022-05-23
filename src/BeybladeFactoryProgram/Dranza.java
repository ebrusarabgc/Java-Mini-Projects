package BeybladeFactoryProgram;

public class Dranza extends Beyblade{
    private String bitBeast;

    public Dranza(String owner, int spinningSpeed, int attackPower, String bitBeast) {
        super(owner, spinningSpeed, attackPower);
        this.bitBeast = bitBeast;
    }

    @Override
    public void showBitBeast() {
        System.out.println(getOwner() + " presents " + bitBeast);
        System.out.println(getOwner() + "'s secret attack is Fire Sword.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bit Beast Name: " + bitBeast);
    }

    public String getBitBeast() {
        return bitBeast;
    }

    public void setBitBeast(String bitBeast) {
        this.bitBeast = bitBeast;
    }
}
