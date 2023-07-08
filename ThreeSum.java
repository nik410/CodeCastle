package Arrays;
import java.util.*;
public class ThreeSum {
	 public List<List<Integer>> threeSum(int[] nums) {
	        
	        Arrays.sort(nums);
	        List<List<Integer>> ans=new ArrayList();
	        List<Integer> al=new ArrayList();

	        for(int i=0;i<nums.length;i++){
	            if(i!=0&&nums[i]==nums[i-1])continue;
	            int j=i+1,k=nums.length-1;
	            while(j<k){
	                int sum=nums[i]+nums[j]+nums[k];
	                if(sum<0){
	                    j++;
	                }
	                if(sum>0){
	                    k--;
	                }
	                else if(sum==0){
	                    al.add(nums[i]);
	                    al.add(nums[j]);
	                    al.add(nums[k]);
	                    ans.add(new ArrayList(al));
	                    al.clear();
	                    j++;
	                    k--;
	                   while(j<k&&nums[j]==nums[j-1])j++;
	                   while(j<k&&nums[k]==nums[k+1])k--;
	                }
	            }
	        }
	        return ans;


	    }
	public static void main(String[] args) {
		//https://leetcode.com/problems/3sum/
	}

}
