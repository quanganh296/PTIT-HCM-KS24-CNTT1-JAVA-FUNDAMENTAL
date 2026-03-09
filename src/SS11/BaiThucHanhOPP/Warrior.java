package SS11.BaiThucHanhOPP;

class Warrior extends GameCharacter implements ISkill {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[" + getClass().getSimpleName() + "] " + name + " tấn công " + target.getName() + "!");
        target.takeDamage(attackPower);
        System.out.println("   -> " + target.getName() + " mất " + attackPower + " máu. HP còn: " + target.getHp());
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("[" + getClass().getSimpleName() + "] " + name + " dùng chiêu cuối lên " + target.getName() + "!");
        int damage = attackPower * 2;
        target.takeDamage(damage);
        int selfDamage = (int) (hp * 0.1);
        hp -= selfDamage;
        System.out.println("-> " + name + " mất " + selfDamage + " máu do gắng sức.");
    }

    @Override
    public void takeDamage(int amount) {
        int actualDamage = Math.max(0, amount - armor);
        hp -= actualDamage;
        System.out.println("-> " + name + " mất " + actualDamage + " máu.");
        if (hp <= 0) {
            System.out.println(name + " đã bị hạ gục.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giáp: " + armor);
    }
}
