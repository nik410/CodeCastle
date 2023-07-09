package Arrays;
import java.util.*;
public class MaximumPointsYouCanObtainfromCards {
        
	 public static int maxScore(int[] cardPoints, int k) {
	      int sum=0,ans=0,l=0,r=cardPoints.length-1;
	      
         for(int i=0;i<k;i++){
             sum+=cardPoints[i];
               }
           ans=sum;
           
           for(int i=k-1;i>=0;i--){

               sum-=cardPoints[i];
               sum+=cardPoints[r];
               r--;
               ans=Math.max(ans,sum);
           }
           
	      

	  return ans;  
	 }
	
	
	public static void main(String[] args) {
         // https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
        //Take the sum of first k terms 
		//Then run a loop from k-1 to i>=0 while adding terms from last index of array 
		//and subtracting the ith position terms
		//Select the max among them
		int arr[] ={96,90,41,82,39,74,64,50,30};
		int k=8;
		
		System.out.println(maxScore(arr, k));
		
	}

}
