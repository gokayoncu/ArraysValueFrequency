import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 23, 90, 8, 9, 15, 8, 90, 23, 15};

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları:");
        Arrays.sort(list);
        int num = 1;
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                for (int j = 0; j < list.length; j++) {
                    if ((i != j) && (list[i] == list[j])) {
                        num++;
                    }
                }
                System.out.println(list[i] + " sayısı " + num + " kere tekrar edildi.");
            } else if (list[i] != list[i - 1]) {
                for (int j = 0; j < list.length; j++) {
                    if ((i != j) && (list[i] == list[j])) {
                        num++;
                    }
                }
                System.out.println(list[i] + " sayısı " + num + " kere tekrar edildi.");
            }
        }
    }
}