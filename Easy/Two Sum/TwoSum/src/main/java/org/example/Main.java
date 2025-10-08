package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Solution solution = new Solution();
    int [] nums =solution.twoSum(new int[]{3,2,3}, 6);
    for (int i = 0; i < nums.length; i++) {
        System.out.println(nums[i]);
    }
    }
}