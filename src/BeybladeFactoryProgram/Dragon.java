package BeybladeFactoryProgram;

public class Dragon extends Beyblade{
    private final String bitBeast;
    private final String secretAbility;

    public Dragon(String owner, int spinningSpeed, int attackPower, String bitBeast, String secretAbility) {
        super(owner, spinningSpeed, attackPower);
        this.bitBeast = bitBeast;
        this.secretAbility = secretAbility;
    }

    @Override
    public void showBitBeast() {
        System.out.println(getOwner() + " presents " + bitBeast);
        System.out.println(getOwner() + "'s secret attack is Ghost Tornado.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bit Beast Name: " + bitBeast);
        System.out.println("Secret Ability: " + secretAbility);
    }
}
