package algorithm;

public class BoyerMooreMajorityVote {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1};

        int candidate = 0;
        int count =0;

        for(int i  = 0 ; i < nums.length;i++){
            if(count==0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                count++;
            }else{
                count--;
            }
        }

        System.out.println(candidate);
    }
}
