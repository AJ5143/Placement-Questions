package placement;

import java.util.Scanner;

public class Gas_station {
	
	public int canCompleteCircuit(int[] gas, int[] cost)
	{
		int tank=0,diff=0,start=0,net=0;
		for(int i=0;i<gas.length;i++)
		{
			tank = gas[i]-cost[i];
			if(diff>=0)
				diff += tank;
			else
			{
				diff = tank;
				start = i;
			}	
			net+=tank;
		}
		return net>=0? start : -1;
	}
	public static void main(String[] args)
	{
		Gas_station g = new Gas_station();
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		System.out.println("Enter First Array elements:");
		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("Enter Second Array elements:");
		for(int i=0;i<N;i++)
		{
			B[i]=sc.nextInt();
		}
		
		int sol = g.canCompleteCircuit(A,B);
		System.out.println(sol);
	}
}
