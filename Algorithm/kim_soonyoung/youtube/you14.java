/*
 * 14�� ���� ���� ���
 * 421314218
 * 
 * �Էµ� ������ ������ ����϶�
 *  0: 0
	1: 3
	2: 2
	3: 1
	4: 2
	5: 0
	6: 0
	7: 0
	8: 1
	9: 0
 */
package youtube;

import java.util.ArrayList;
import java.util.Scanner;

public class you14 {
	
	public static void solution(int num) {
		int[] arr = new int[10];
		
		while(num > 0) {
			arr[num % 10] += 1;
			num = num /10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d : %d  \n", i, arr[i]);
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		solution(num);
	}

}
