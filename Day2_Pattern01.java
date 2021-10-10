/**
Write code to print the following pattern:

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
**/
import java.util.Scanner;
public class Solution{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				if((i+j)%2 == 0){
					System.out.print("1 ");
				}else{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	
	}
}
