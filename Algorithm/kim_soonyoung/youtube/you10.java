/*
 * ���� �簢��(1)
 * �Էµ� ��(n) ��ŭ n�� n���� ���·� ���������� ��µǴ� ���� �簢���� ����Ͻÿ�
 * 4
 * 1 2 3 4 
   5 6 7 8 
   9 10 11 12 
   13 14 15 16 
 */
package youtube;

import java.util.Scanner;

public class you10 {
	int num=0;
	
	public void solution(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				++num;
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		you10 y = new you10();
		y.solution(n);
	}

}
