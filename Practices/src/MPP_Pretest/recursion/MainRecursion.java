package MPP_Pretest.recursion;

import java.util.ArrayList;
import java.util.List;

public class MainRecursion {
    public static void main(String[] args) {
        int [] numbers = {1,2,3};
        System.out.println(listPermutations(numbers));
    }

    static List<List<Integer>> listPermutations(int[] numbers){
        List<List<Integer>> result = new ArrayList<>();
        helper(0, numbers, result);
        return result;
    }

    private static void helper(int start, int[] numbers, List<List<Integer>> result ){
        if(start == numbers.length -1){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i< numbers.length; i++){
                list.add(numbers[i]);
            }
            result.add(list);
            return;
        }

        for(int i = start; i< numbers.length; i++){
            swap(numbers, i, start);
            helper(start + 1, numbers, result);
            swap(numbers, i, start);
        }
    }

    private static void swap(int[] numbers, int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
