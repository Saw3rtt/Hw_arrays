import java.util.Arrays;

public class Arrays_hw {
    public static void main(String[] args) {
        //task1
        int[] array = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        double[] array3 = {1.45, 3.3123, 444.3};
        //task2
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j]);
            if (j < array2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i < array3.length - 1) {
                System.out.print(",");
                //task3

            }

        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int j = array2.length - 1; j >= 0; j--) {
            System.out.print(array2[j]);
            if (j > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i > 0) {
                System.out.print(",");

            }
        }
        System.out.println();
        //task4
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}




