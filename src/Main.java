import java.util.Random;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray(){
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        System.out.println(" ");
        System.out.println("Exercise 1 ");

        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i : arr){
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
    public static void task2(){
        System.out.println(" ");
        System.out.println("Exercise 2");

        int[] arr = generateRandomArray();
        int min = 200_000;
        int max = 0;

        for (int i : arr){
            if(min > i){
                min = i;
            }
            if(max < i){
                max = i;
            }
        }
        System.out.println("Минимальная сумма затрат составила " + min + " рублей. Максильная сумма затрат  в день составила "
        + max + " рублей.");
    }
    public static void task3(){
        System.out.println(" ");
        System.out.println("Exercise 3");

        int[] arr = generateRandomArray();
        int sum = 0;

        for(int i : arr){
            sum += i;
        }
        double averSum = (double)sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " +averSum);
    }
    public static void task4(){
        System.out.println(" ");
        System.out.println("Exercise 4");

        char[] reverseName = {'n' , 'a' , 'v', 'I' , ' ' , 'v' , 'o', 'n', 'a' , 'v' , 'I'};
        for (int i = 0; i < reverseName.length; i++){
            System.out.println(reverseName[(reverseName.length -1) - i]);
        }

    }
}