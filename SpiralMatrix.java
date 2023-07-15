package Arrays;
import java.util.*;
public class SpiralMatrix {
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        int left=0,right=matrix[0].length;
        int top=0,down=matrix.length;
 
        List<Integer> list=new ArrayList();
        
        while(left<right&&top<down) {
        	
        	for(int i=left;i<right;i++) {
        		list.add(matrix[top][i]);
        	}
        	top++;
        	for(int i=top;i<down;i++) {
        		list.add(matrix[i][right-1]);
        	}
        	right--;
        	
        	if(top<down) {
        		for(int i=right-1;i>=left;i-=1) {
        			list.add(matrix[down-1][i]);
        		}
        		down--;
        		
        	}
        	if(left<right) {
        		
        		for(int i=down-1;i>=top;i--) {
        			list.add(matrix[i][left]);
        		}
        		left++;
        	}
        	
        	
        }
        
       

        return list;


    }
	

	public static void main(String[] args) {
		int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(spiralOrder(mat));

	}

}
