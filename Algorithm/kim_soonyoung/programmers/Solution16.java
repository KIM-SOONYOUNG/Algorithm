/* 
 * ���ڿ� �ٷ�� �⺻
 * ���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�
 * ���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.
 * 
 * isStringDouble : ���ڿ��� ���ڷθ� �̷���� �ִ� �� Ȯ��
 * 					�Ķ����(�μ�)�� ���� ���ڿ��� �Ǽ��� ��ȯ �� �� �ִ��� ���θ� Ȯ��
 * 					������ �Ǽ��� ���ԵǱ⿡, ���������� �Ǵ��� �� �ִ�.
 * 
 * Double.parseDouble()�� ���ڿ��� �Ǽ��� ��ȯ, ������ �߻��ϸ� ���ڰ� �ƴ� ������ �Ǵ�(false)
 */

package programmers;

import java.util.Scanner;

public class Solution16 {
	
	public boolean solution(String s) {
        boolean answer = false;
        
        if(isStringDouble(s)) {
        	answer= true;
        }
        return answer;
    }
	
	private boolean isStringDouble(String s) {
		// TODO Auto-generated method stub
		try {
			Double.parseDouble(s); //���ڿ����� double������ �ٲٴ� ��� - Double Ŭ���� parseDouble �޼��� ���
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		Solution16 s = new Solution16();
		System.out.println(s.solution(str));
	}

}
