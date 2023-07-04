package Arrays;
import java.util.*;
public class FindDuplicateinArray {
	
	 public List<Integer> findDuplicates(int[] nums) {
	        List<Integer> ans=new ArrayList();
	          
	          for(int i=0;i<nums.length;i++){
	              if(nums[Math.abs(nums[i])-1]<0)ans.add(Math.abs(nums[i]));

	              nums[Math.abs(nums[i])-1]=-1* nums[Math.abs(nums[i])-1];
	          }

	          return ans;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
