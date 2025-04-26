package org.example.sample_program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_02 {
    public static void main(String[] args) {

        var intArray1 = new int[] {2, 7, 11, 15};
        var target1 = 9;
        Arrays.stream(intArray1).forEach(item -> System.out.print(item + " "));
        System.out.println(target1);
        var result = indexArrayTwoSumV1(intArray1, target1);
        Arrays.stream(result).forEach(item -> System.out.print(item + " "));

        System.out.println();
        System.out.println();
        var intValue = calculateV1("1+3*2+4");
        System.out.println(intValue);

        //---
        System.out.println();
        System.out.println();
        TreeNode m1 = new TreeNode();

        TreeNode m2 = new TreeNode();
        TreeNode m3 = new TreeNode();


        m1.valueNode = 1;
        m2.valueNode = 2;
        m3.valueNode = 3;
        m2.left = m1;
        m2.right = m3;

        var resultTreeNode = getMaxTreePath(m2);
        System.out.println();
        System.out.println(resultTreeNode);
    }


    //Description Task - Two Sum
    //Given an array of integers nums and an integer target,
    // return indices of the two numbers such that they add up to target
    //You may assume that each input would have exactly one solution, and you may not use the same element twice
    //You can return the answer in any order
    //Example 1
    //Input: nums = [2, 7, 11, 15], target = 9
    //Output: [0, 1]
    //Because nums[0] + nums[1] == 9, we return [0, 1]

    //Example 2
    //Input: nums = [3, 2, 4], target = 6
    //Output: [1, 2]

    //Example 3
    //Input: nums = [3,3], target = 6
    //Output: [0, 1]

    //Constraints
    //-----------------------

    public static int[] indexArrayTwoSumV1(int[] nums, int target) {
        if(nums == null && nums.length < 2) return null;

        Map<Integer, Integer> idxByValue = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int curr = target - nums[i];
            if (idxByValue.get(curr) != null) {
                return new int[] {i, idxByValue.get(curr) };
            }
            idxByValue.put(nums[i], i);
        }
        return null;
    }

    //Дана строка-выражение вида: "1+38+37943". При этом:
    //скобок нет
    //унарных минусов нет
    //вычитания и деления нет
    //только сложение и умножение
    //Написать функцию, вычисляющие выражение
    //ограничения o(1) по памяти, o(n)  по времени
    //тест кейсы
    //  ""
    //  "1"
    //  "1+2"
    //  "23"
    //  "1+23+5"
    //  "12+35"

    //--
    // 123 //1*10+2 //12*10+3
    public static int calculateV1(String expression) {
        String[] blockPlural = expression.split("\\+"); //не удовлетворяет условию задачи
        int result = 0;
        int currentBlockValue = 1;
        int currentVal = 0;

        for(char c: expression.toCharArray()) {
            if(c == '+' || c == '*') {
                if(c == '+') {
                    currentBlockValue *= currentVal;
                    result += currentBlockValue;
                    currentBlockValue = 1;
                    currentVal = 0;
                } else {
                    currentBlockValue *= currentVal;
                }
                currentVal = 0;
            } else {
                var digit = c - '0';
                currentVal = currentVal * 10 + digit;
            }
        }

        currentBlockValue *= currentVal;
        result += currentBlockValue;

        return result;
    }

    //На вход дается непустое бинарное дерево
    //Найти максимальную сумму пути в этом дереве
    //Путь - последовательность узлов, связанных отношениями родитель-потомок
    //Путь должен содержать минимум один узел
    //Пример 1
    //      1
    //     / \
    //    2   3
    //Answer 6 (2+3+1)
    //
    //Пример 2
    //      -10
    //      /  \
    //     9    20
    //         /  \
    //        15   7
    //Answer 42 (15+20+7) идем только по положительным узлам дерева
    //
    //Пример 3
    //       -10
    //       / \
    //      9   20
    //         /  \
    //        15  -100
    //Answer 35
    //

    public static int result = Integer.MIN_VALUE;

    public static int getMaxTreePath(TreeNode root) {
        getMaxStraightPath(root);
        return result;
    }

    public static int getMaxStraightPath(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int maxL = getMaxStraightPath(root.left);
        int maxR = getMaxStraightPath(root.right);
        result = Math.max(result, maxL+root.valueNode+maxR);

        return Math.max(maxL + root.valueNode, maxR + root.valueNode);
    }

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int valueNode;
    }

}
