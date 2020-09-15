package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HourglassSum {

	public static void main(String[] args) {
		int[][] a = new int[6][6];
		int result=Integer.MIN_VALUE, sum=0;
		//Map<Integer,Integer> sum = new HashMap<>();
		//int[][] sums = new int[16][16];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
//		for(int i=0;i<=a.length-1;i++)
//		{
//			for(int j=0;j<=a.length-1;j++)
//			{
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//		}
		for(int i = 0; i<=3; i++)
		{
			for(int j = 0; j<= 3;j++)
			{
				sum= a[i][j] + a[i][j+1] + a[i][j+2] +
							 a[i+1][j+1] + 
							 a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
				result = Math.max(result, sum);
			}
		}
		System.out.println(result);
	}

}
