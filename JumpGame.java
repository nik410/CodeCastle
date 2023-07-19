package Arrays;

public class JumpGame {

	
	 public boolean canJump(int[] nums) {

	        
	        int indreachable=1000000;
	        
	        for(int i=nums.length-1;i>=0;i--){
	            if(nums[i]+i+1>=nums.length){indreachable=i+1;}
	            else if(nums[i]+i+1>=indreachable)indreachable=i+1;
	          
	        }
	        if(indreachable==1)return true;
	        else return false;


	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
