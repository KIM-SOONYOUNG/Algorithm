/*
 * ���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
 */
package programmers;

import java.util.Scanner;

public class Solution12 {
	
	public String solution(int num) {
        
		String answer = "";
		
        if(num %2 ==0 || num ==0) {
        	answer +="Even";
        }else {
        	answer += "Odd";
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Solution12 s = new Solution12();
		System.out.println(s.solution(num));
	}

}
