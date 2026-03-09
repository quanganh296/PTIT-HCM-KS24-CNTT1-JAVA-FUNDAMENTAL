package SS11.BaiThucHanhOPP;

import java.util.ArrayList;
import java.util.List;

public class MainTH {
    public static void main(String[] args) {
        List<GameCharacter> characters = new ArrayList<>();

        Warrior yasuo = new Warrior("Yasuo", 500, 50, 20);
        Mage veigar = new Mage("Veigar", 300, 40, 200);

        characters.add(yasuo);
        characters.add(veigar);

        GameCharacter goblin = new GameCharacter("Goblin", 100, 10) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("[Quái vật] " + name + " tấn công!");
                System.out.println("   -> " + name + " cắn trộm " + target.getName() + "... Gây 10 sát thương.");
                target.takeDamage(10);
            }
        };

        characters.add(goblin);

        System.out.println("=== ARENA OF HEROES ===");
        System.out.println("Đã khởi tạo " + GameCharacter.count + " nhân vật tham gia đấu trường.");

        yasuo.attack(goblin);
        veigar.useUltimate(yasuo);
        goblin.attack(veigar);

        System.out.println("\n=== THÔNG SỐ SAU LƯỢT ĐẤU ===");
        for (GameCharacter c : characters) {
            c.displayInfo();
        }
    }
}
