package SS11.BaiThucHanhOPP;

class Mage extends GameCharacter implements ISkill {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[" + getClass().getSimpleName() + "] " + name + " tấn công " + target.getName() + "!");
        int damage = attackPower;
        if (mana >= 5) {
            mana -= 5;
        } else {
            damage /= 2;
        }
        target.takeDamage(damage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        if (mana >= 50) {
            mana -= 50;
            int damage = 100;
            target.takeDamage(damage);
            System.out.println("-> " + name + " tốn 50 mana. " + target.getName() + " mất " + damage + " máu.");
        } else {
            System.out.println(name + " không đủ mana để dùng chiêu cuối.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mana: " + mana);
    }
}
