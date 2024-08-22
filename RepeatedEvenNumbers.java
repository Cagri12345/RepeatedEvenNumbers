package Arrays;

public class RepeatedEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 2, 6, 8, 10, 12, 10, 8, 14, 14};

        System.out.println("Repeated even numbers:");

        // Çift sayıları ve tekrar edenleri bulmak için döngü
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { // Çift sayıyı kontrol et
                boolean isRepeated = false;

                // Önceden kontrol edilip edilmediğini kontrol et
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == numbers[i]) {
                        isRepeated = true;
                        break;
                    }
                }

                // Tekrar eden çift sayıyı yazdır
                if (isRepeated) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
