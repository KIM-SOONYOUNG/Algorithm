/*
 * 12�� ���� �簢��3
 * �Էµ� ��(n) ��ŭ n�� n���� ���� ���
 * 1 5 9 13
 * 2 6 10 14
 * 3 7 11 15
 * 4 8 12 16
 * 
 * ��ø �ݺ���(for�� while)
 * ���ǹ�(if)
 * �迭
 */

package youtube;

import java.util.Scanner;

public class you12 {

	public void solution(int n) {
		int[][] arr = new int[n][n];
		int num = 1;
		
		for(int j = 0; j < n; j++) { //��
			for(int i = 0; i < n; i++) { //��
				arr[i][j] = num;
				num++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		you12 y = new you12();
		y.solution(n);
	}

}
