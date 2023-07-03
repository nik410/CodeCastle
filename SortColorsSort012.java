package Arrays;

public class SortColorsSort012 {

	 public static void sortColors(int[] nums) {
	     int l=0,r=nums.length-1,i=0;
	     
	     while(i<=r) {
	    	 if(nums[i]==2) {
	    		 int temp=nums[r];
	    		 nums[r]=2;
	    		 nums[i]=temp;
	    		
	    		 r--;
	    	 }
	    	 else if(nums[i]==0) {
	    		 int temp=nums[l];
	    		 nums[l]=0;
	    		 nums[i]=temp;
	    		 l++;i++;
	    	 }
	    	 else {i++;}
	    	 
	    	 for(int j=0;j<nums.length;j++)System.out.print(nums[j]+" ");
	     System.out.println();
	     }
	     
	   
		 
		 
	    }
	
	public static void main(String[] args) {
		
		//https://leetcode.com/problems/sort-colors/
		
		
		int nums[]= {2,0,1};
		sortColors(nums);
		
		
	}

}
