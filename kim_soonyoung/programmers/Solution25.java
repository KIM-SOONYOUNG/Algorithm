/*
 * 2016�� 
 * 2016�� a�� b���� ���������ΰ�?
 * a,b�� �Է¹޾� 2016�� a�� b���� ���� �������� ����
 * ���� �̸� : SUN,MON,TUE,WED,THU,FRI,SAT
 * 
 * ����
 * a=5, b=24��� 5�� 24���� ȭ���� -> TUE ��ȯ
 * 
 * ����
 * 2016���� ����
 * 2016�� 1�� 1���� �ݿ����Դϴ�
 * 
 * point!!
 * 1. �����̶�?
 * - ������ �ش� ������ 4�� ���� ���� 0�� ���� �ǹ��Ѵ�.
 * - �� �� 100���� ���� ���� 0�� ���� ���⿡�� �����ϳ�, 
 * - 400���� ���� ���� 0�� ���� �������� ���Եȴ�.
 * - �� ���� ������ ������ ����̴�.
 * 
 * 2. ���� ��¥��� ���̴�.
 */

package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution25 {

	public String solution(int a, int b) {
		int year = 2016;
		String[] weeks = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int[] months = {31, 29, 31, 30, 31, 30 , 31, 31, 30, 31, 30, 31};
		int total = 0;
		
		for(int i = 0; i < a - 1; i++) {
			total += months[i];
		}
		
		total += b - 1;
		String answer = weeks[total % 7]; 
		
		return answer;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		Solution25 s = new Solution25();
		System.out.println(s.solution(a, b));
	}

}
