package Arrays;

public class ContainerWithMostWater {
	   public int maxArea(int[] height) {
	        int l=0,r=height.length-1;
	        int ans=0;
	        while(l<r){
	           int a=height[l];
	           int b=height[r];
	           ans=Math.max(Math.min(a,b)*(r-l),ans);
	      
	           if(a>=b){r--;}
	           else l++;
	        }

	         return ans;
	    }
	

	public static void main(String[] args) {
		//https://leetcode.com/problems/container-with-most-water/description/
		

	}

}
