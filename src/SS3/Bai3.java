package SS3;

public class Bai3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        if (names.length == 0) return;

        int max = quantities[0];
        for (int q : quantities) {
        if (q > max)
            max = q;
        }
        System.out.println("\nCác cuốn sách có số lượng lớn nhất (" + max + " cuốn):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i]);
            }
        }

    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        if (names.length == 0) return;

        int min = quantities[0];
        for (int q : quantities) {
            if (q < min)
                min = q;
        }
        System.out.println("\nCác cuốn sách có số lượng nhỏ nhất (" + min + " cuốn):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
    }
    public static void main(String[] args) {
        String[] animeBatch1 = {
                "One Piece",
                "Naruto",
                "Dragon Ball",
                "Attack on Titan",
                "Death Note"
        };
        int[] quantities1 = {15, 50, 50, 11, 5};

        maxQuantityOfBooks(animeBatch1, quantities1);
        minQuantityOfBooks(animeBatch1, quantities1);
    }
}
