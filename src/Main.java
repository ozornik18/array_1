import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weights = new int[3];
        weights[0] = 1;
        int one = weights[0];
        weights[1] = 2;
        int two = weights[1];
        weights[2] = 3;
        int three = weights[2];
        double[] weights1 = {1.57, 7.654, 9.986};
        int[] weights2 = {12, 8, 55, 14, 9};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] weights = new int[3];
        weights[0] = 1;
        int one = weights[0];
        weights[1] = 2;
        int two = weights[1];
        weights[2] = 3;
        int three = weights[2];
        double[] weights1 = {1.57, 7.654, 9.986};
        int[] weights2 = {12, 8, 55, 14};
        System.out.println(Arrays.toString(weights));
        System.out.println(Arrays.toString(weights1));
        System.out.println(Arrays.toString(weights2));

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weights = new int[3];
        weights[0] = 1;
        int one = weights[0];
        weights[1] = 2;
        int two = weights[1];
        weights[2] = 3;
        int three = weights[2];
        double[] weights1 = {1.57, 7.654, 9.986};
        int[] weights2 = {12, 8, 55, 14};
        System.out.print(weights[2] + ", " + weights[1] + ", " + weights[0] + ", ");
        System.out.println();
        System.out.print(weights1[2] + ", " + weights1[1] + ", " + weights1[0]);
        System.out.println();
        System.out.print(weights2[3] + ", " + weights2[2] + ", " + weights2[1] + ", " + weights2[0]);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array = {12, 8, 9, 14};

        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 != 0) {
                array[index] += 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}