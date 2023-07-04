package Arrays;
import java.util.*;
public class TwoSum {
	
	 public int[] twoSum(int[] nums, int target) {
		 
		 //Rolling Hash
	     int ans[]=new int[2];
	     HashMap<Integer,Integer> hm=new HashMap();

	       for(int i=0;i<nums.length;i++){
	           if(hm.containsKey(target-nums[i])){
	               ans[0]=hm.get(target-nums[i]);
	               ans[1]=i;
	               return ans;
	           }
	           hm.put(nums[i],i);
	       }
	     

	        return ans;
	     
	    }

	public static void main(String[] args) {
			int nums[]= {2,2};
			int target=4;
			
			HashMap<Integer,Integer> hm=new HashMap();
			for(int i=0;i<nums.length;i++) {hm.put(i, nums[i]);}
			
			System.out.println(hm);

	}

}
