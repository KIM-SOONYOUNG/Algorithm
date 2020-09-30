/*
 * �� ������ �û���
 * 24line���� if���� ���� ��, 
 * seoul[i] == "Kim"�� �ƴ϶� seoul[i].equals("Kim")�� ���� ������
 * ���ϴ� �ؽ��ڵ� �ּҰ� �ٸ��� �����̴�.
 * ���ڰ� �ƴ� ���ڸ� ���� ���� �ݵ�� ==�� �ƴ� equals�� ���������Ѵ�.
 * */

package programmers;

public class SearchKim {
    
	String answer;
	
	public String solution(String[] seoul) {
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) { 
				answer = "�輭���� "+i+"�� �ִ�"; //answer�� ���⼭ �����ع����� for���� �����鼭 �������. �׷��� ��������� �������ִ� ���� �´�.
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String [] seoul = {"Jane", "Kim"};
		SearchKim s = new SearchKim();
		s.solution(seoul);
	}
}