//# 2차원배열 기본문제[3단계]
package day_17;

public class ArrayEx41 {
	public static void main(String[] args) {
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
			// 문제 1) 가로 합 출력
			// 정답 1) 410, 810, 1210
			System.out.println("문제 1) 가로 합 출력");
			int sum1 = 0, sum2 = 0, sum3 = 0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(i == 0)
					{
						sum1 = sum1 + arr[i][j];
					}
					else if(i == 1)
					{
						sum2 = sum2 + arr[i][j];
					}
					else if(i == 2)
					{
						sum3 = sum3 + arr[i][j];
					}
				}
			}
			
			System.out.println("sum1=" + sum1);
			System.out.println("sum2=" + sum2);
			System.out.println("sum3=" + sum3);
			
			// 문제 2) 세로 합 출력
			// 정답 2) 603, 606, 609, 612
			System.out.println();
			System.out.println("문제 2) 세로 합 출력");
			sum1 = 0; sum2 = 0; sum3 = 0;
			int sum4 = 0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(j == 0)
					{
						sum1 = sum1 + arr[i][j];
					}
					else if(j == 1)
					{
						sum2 = sum2 + arr[i][j];
					}
					else if(j == 2)
					{
						sum3 = sum3 + arr[i][j];
					}
					else if(j == 3)
					{
						sum3 = sum3 + arr[i][j];
					}
				}
			}
			
			System.out.println("sum1=" + sum1);
			System.out.println("sum2=" + sum2);
			System.out.println("sum3=" + sum3);
			System.out.println("sum4=" + sum4);
	}
}
