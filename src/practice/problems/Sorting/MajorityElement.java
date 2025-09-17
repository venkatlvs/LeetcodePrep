package practice.problems.Sorting;

import practice.utility.Helper;

public class MajorityElement {
    public void executeMajorityElement() {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println("The given Array is: ");
        Helper.printArray(nums);
        System.out.println("The output of the code is: " + majorityElement(nums));
    }

    private int majorityElement(int[] nums) {
        int count = 0, a = nums[0];
        for (int i : nums) {
            if (count == 0) {
                a = i;
            }
            if (a == i) {
                count++;
            } else {
                count--;
            }
        }
        return a;
    }

    private void sort(int a, int b, int[] s) {
        int temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
