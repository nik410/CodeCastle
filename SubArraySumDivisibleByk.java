package Arrays;

import java.util.HashMap;

public class SubArraySumDivisibleByk {
         
	 public static int subarraysDivByK(int[] nums, int k) {
	        HashMap<Integer,Integer> hm=new HashMap();
	        int sum=0,ans=0;
	         hm.put(0,1);
	        for(int i=0;i<nums.length;i++){
	            sum+=(nums[i]);
   
	            int a=sum%k;
	            //We miss some subarray if a is -ve so make a +ve by adding k 
	            if(a<0)a+=k;
	            if(hm.containsKey(a)){ans+=hm.get(a);}
	            hm.put(a,hm.getOrDefault(a,0)+1);
	            
	        }
	        
	       
	        return ans;
	    }
	 
	 public static void main(String []args) {
		 int nums[]= {-1,2,9};
		 int k=2;
		 System.out.println(subarraysDivByK(nums, k));
		 
//https://leetcode.com/problems/subarray-sums-divisible-by-k/description/		 
		 
	 }
	
	
	
}
