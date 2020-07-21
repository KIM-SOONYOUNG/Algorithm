/*
 * �ִ������� �ּҰ����
 * �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution
 * �迭�� �� �տ� �ִ�����, �� ���� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�.
 * �� �� 3,12�� �ִ������� 3, �ּҰ������ 12, [3,12]
 */

package programmers;

import java.util.Scanner;
import java.util.Arrays;

public class Solution14 {

	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n,m); //�ִ�����
        answer[1] = (n*m)/answer[0]; //�ּҰ����
        
        return answer;
	}
	
	public static int gcd(int p, int q) {
		if(q == 0) {
			return p;
		}
		return gcd(q, p%q);
	}
	
	public static void main(String[] args) {
		Solution14 s = new Solution14();
		System.out.println(Arrays.toString(s.solution(4, 12)));
		
	}

}
