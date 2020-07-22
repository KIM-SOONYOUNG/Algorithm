/*
 * ���� ������ �Ǻ�
 * ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
 * n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, 
 * n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
 * 
 * - Math.sqrt()
 * - Math.pow()
 */

package programmers;

import java.util.Scanner;

public class Solution15 {
	
	public long solution(long n) {
        long answer = -1;
        
        long num = (long)Math.sqrt(n); 
        
        if(Math.pow(num, 2) == n) {
        	answer =(long)Math.pow(num+1,2);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Solution15 s = new Solution15();
		System.out.println(s.solution(n));
		
	}
}
