import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int myArray[] = arr;
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Сумма трат за месяц " + sum);
    }


    public static void task2() {
        int[] arr = generateRandomArray();
        int[] sum = arr;
        int maxSum = -1;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > maxSum) {
                maxSum = sum[i];
            } else {
                System.out.println("Минимальная сумма трат за день составила " + sum[i] + " рублей");
            }
            System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");
        }
    }


    public static void task3() {
        int[] arr = generateRandomArray();
        int[] nums = arr;
        double result = 0;

        for (double d : nums) {
            result += d;
        }
        System.out.println("Средняя сумма трат за месяц составила " + result / nums.length + " рублей");
    }


    public static void task4() {
        int[] arr = generateRandomArray();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; ++i) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }

        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
    }




