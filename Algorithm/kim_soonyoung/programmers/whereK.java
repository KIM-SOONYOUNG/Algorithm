/*
�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.

 */

package programmers;

import java.util.Scanner;

public class whereK {
	int [] answer = new int []
	int [] arr2= {};
	
	public String solution(int[] arr, int i, int j, int k) {
		
		substring(arr[i],arr[j]);
	}
	
	public static void main(String[] args) {
		whereK w = new whereK();
		int[] arr = {1, 5, 2, 6, 3, 7, 4}; 
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		w.solution(arr,i, j,k);
	}

}
