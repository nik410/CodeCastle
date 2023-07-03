package Arrays;

public class RemoveDuplicates {
	
	 public int removeDuplicates(int[] nums) {
		 //Not optimal
		 
		    //       int count=1;
		    //    for(int i=0;i<nums.length-1;i++){
		    //        if(nums[i]!=nums[i+1]){
		    //           count++;
		               
		    //        }
		    //        if(nums[i]==nums[i+1]){
		    //            nums[i]=10000000;
		               
		    //        }
		           
		    //    }
		    //    Arrays.sort(nums);
		    //    return count;
		      int j=0;
		     for(int i=1;i<nums.length;i++){
		       if(nums[i]!=nums[j]){
		           nums[++j]=nums[i];
		       }
		     }

		     return j+1;



		    }
	

	public static void main(String[] args) {
		//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

	}

}
