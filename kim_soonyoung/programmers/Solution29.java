/*
 * ������ȣ
 * � ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ���
 * 
 * �Է¹��� ���ڸ� �������� ������, 
 * ���ڴ� �ƽ�Ű�ڵ�� �����ϰ�
 * ������ ����
 * n��ŭ ���� �����ְ�
 * ������� �ٽ� ���ĺ��� ����
 */
package programmers;

import java.util.Scanner;

public class Solution29 {

	public String solution(String s, int n) {
		String answer = "";
		int i, code;

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				//System.out.println("code:"+s.charAt(i));
				code = (int) s.charAt(i);
				//System.out.println("code:"+code);
				if (code >= 65 && code <= 90) {
					code = code + n;
					if (code > 90) {
						code = 65 + ((code - 91) % 26);
					}
				} else if (code >= 97 && code <= 122) {
					code = code + n;
					//System.out.println("add :"+code);
					if (code > 122) {
						code = 97 + ((code - 123) % 26);
					}
				}
				//System.out.println(Character.toString((char) code));
				answer = answer + Character.toString((char) code);
				//System.out.println("--"+answer);
			} else {
				answer = answer + Character.toString(s.charAt(i));
			}

		}
		//System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		Solution29 sol = new Solution29();
		//sol.solution(s, n);
		System.out.println(sol.solution(s, n));
	}

}
