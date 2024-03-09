import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(removeElement(nums, val));

    }


    public static int removeElement(int[] nums, int val) {


        int current_index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[current_index] = nums[i];
                current_index++;
            }
        }


        return current_index;
    }
}

//  *** Another approach ***


//    public static int removeElement(int[] nums, int val) {
//
//
//        int k = 0;
//        ArrayList<Integer> a = new ArrayList<>();
//
//
//        for (int i =0; i < nums.length; i++){
//
//            if(nums[i] != val){
//                a.add(nums[i]);
//                k++;
//            }
//        }
//
//        System.out.println(a.size());
//
//        return k;
//    }
