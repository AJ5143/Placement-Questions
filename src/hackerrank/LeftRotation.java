package hackerrank;
import java.util.Scanner;

public class LeftRotation {

	public static int[] leftRotation(int[] arr,int d)
	{
		int n = arr.length;
		int[] ans = new int[n];
		for(int oldI = 0; oldI<n;oldI++)
		{
			int newI = (oldI + n - d)%n;
			ans[newI] = arr[oldI];
		}
		return ans;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] answer = leftRotation(arr,d);
		for(int i=0;i<answer.length;i++)
		{
			System.out.print(answer[i]);
		}
		
	}

}
