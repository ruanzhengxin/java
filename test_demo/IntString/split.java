package IntString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String input="91 27 46 38 50";
        String[] input_numbers=input.split(" ");
        int [] nums=new int[input_numbers.length];
        for(int i=0;i<input_numbers.length;i++){
            nums[i]=Integer.parseInt(input_numbers[i]);
        }
        Arrays.sort(nums);
        String output=new String("");
        for(int i=0;i<nums.length;i++){
            if(i!= nums.length-1)output+=nums[i]+" ";
            else output+=nums[i];
        }

        System.out.println(output);

    }
}
