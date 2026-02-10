package arrays;

import java.util.HashMap;
import java.util.Map;

/*
majority element need to be more than n/2 times
* */
public class MajorityElement {

    public static int maxElementBruteForce(int[] arr){
        int length = arr.length;


        for(int i = 0 ; i < length ; i++){
            int count = 0;

            for(int j = 0 ; j < length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > length/2){
                return arr[i];
            }
        }
        return -1;

    }

    public static int maxElementBest(int[] arr){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        int length = arr.length;
        for(int num : arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            if(entry.getValue() > length/2){
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void optimalResult(int[] arr){
        int candidate =0;int count =0;
        for(int i  = 0 ; i < arr.length ; i++){
            if(count == 0){
                candidate = arr[i];
            }
            if(candidate == arr[i]){
                count++;
            }else{
                count--;
            }
        }

        System.out.println("Best solution with O(n) TC and O(1) SC with Moorey algo : " +candidate);
    }

    public static void main(String[] args) {
        int[] nums1 = {2,2,1,1,1,2,2};
        int bruteforceResult = maxElementBruteForce(nums1);
        int hashmapResult = maxElementBest(nums1);
        optimalResult(nums1);
    }


}
