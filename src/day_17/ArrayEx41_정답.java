package day_17;

//# 2�����迭 �⺻����[3�ܰ�]

public class ArrayEx41_���� {
	public static void main(String[] args) {

		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 

		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// ���� 1) ���� �� ���
		// ���� 1) 410, 810, 1210
		// ���� 2) ���� �� ���
		// ���� 2) 603, 606, 609, 612

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {			//arr.length = 3�ε� j�� 4���� �ʿ����� �ʳ�?
				garo[i] += arr[i][j];
				sero[j] += arr[i][j];
			}
		}
		
		for(int i=0; i<3; i++) {
			System.out.print(garo[i] + " ");
		}
		System.out.println();
		for(int i=0; i<4; i++) {
			System.out.print(sero[i] + " ");
		}
		
		
	}
}