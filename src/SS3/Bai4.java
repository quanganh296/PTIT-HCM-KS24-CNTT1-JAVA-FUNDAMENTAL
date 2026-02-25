package SS3;

public class Bai4 {
    static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void main(String[] args) {
        int[] arr = {101,105,102,109,104,103,110};
        System.out.println("Danh sách mã sách trước khi sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sortBooks(arr);
        System.out.println("\nDanh sách mã sách sau khi sắp xếp: ");
        displayBooks(arr);
    }
}
