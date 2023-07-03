package Arrays;

public class FindtheDuplicateNumber {
	
	
public static int findDuplicate(int[] nums) {
        int ans=0;
        
        for(int i=0;i<nums.length;i++) {
        	if(nums[Math.abs(nums[i])]<0) {ans=Math.abs(nums[i]);break;}  
        	nums[Math.abs(nums[i])]=-1*nums[Math.abs(nums[i])];
          }
        
        
	
	return ans;
    }

	public static void main(String[] args) {
		int nums[]= {3,1,3,4,2};
System.out.println(findDuplicate(nums));
	}

}
