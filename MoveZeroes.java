package Arrays;
import java.util.*;
public class MoveZeroes {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		
		//Not Optimal
//		 int l=0,r=0;
//			
//			for(int i=0;i<nums.length;i++) {
//				if(nums[i]!=0){nums[l]=nums[i];l++;}
//			}
//			for(int i=l;i<nums.length;i++) {nums[i]=0;}
//			 
		
		
		//Snowball Method

		int cofzero=0,l=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {cofzero++;}
			else {
				int temp=nums[i-cofzero];
				nums[i-cofzero]=nums[i];
				nums[i]=temp;
							
				
				
			}
			
		}
		for(int i=0;i<n;i++)System.out.print(nums[i]+ " ");
		
		
		

	}

}
