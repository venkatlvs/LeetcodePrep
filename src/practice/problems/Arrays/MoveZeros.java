package practice.problems.Arrays;

import practice.utility.Helper;

public class MoveZeros {

    public void executeMoveZeros() {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        System.out.println("The given array is: ");
        Helper.printArray(arr);
        System.out.println("The output is: ");
        Helper.printArray(new MoveZeros().moveZeros(arr));
    }

    private int[] moveZeros(int[] arr) {
        int i = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[i] = num;
                i++;
            }
        }
        while (i < arr.length) {
            arr[i] = 0;
            i++;
        }
        return arr;
    }

}
