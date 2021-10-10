/**
Write a code to print the below pattern:
# # # # 
  # # # #
    # # # #
	  # # # #
	  **/
import java.util.Scanner;
public class Solution{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i<=j){
					System.out.print("* ");
				}else{
				System.out.print("  ");
				}
			}
			for(int k=0; k<n; k++){
				if(i>=k){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	
	}
}