package arrays;

/*
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]*/


public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        int write = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                arr[write] = arr[i];
                write++;
            }
        }

        while(write < arr.length){
            arr[write] = 0;
            write++;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
