/*
 * �ڸ��� ���ϱ�
 * N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ�
 * ������� N = 123�̸� 1 + 2 + 3 = 6
 */

package programmers;

import java.util.Scanner;

public class Solution13 {

	public int solution(int n) {
        int answer = 0;
        
        while(n>0) {
        	answer += n%10;
        	n = n/10;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Solution13 s = new Solution13();
		System.out.println(s.solution(n));
	}

}
