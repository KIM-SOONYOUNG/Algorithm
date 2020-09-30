/*
 * Summer/Winter Coding(~2018)
 * ����
 * �Ű����� budget
 * �ִ� �� ���� �μ��� ��ǰ�� ������ �� �ִ��� return �ϵ��� solution �Լ��� �ϼ��ϱ�
 * �ִ� ��� �μ�?
 * d�� �� ���Ҵ� �μ����� ��û�� �ݾ��� ��Ÿ����, 
 * 
 * 1 <= budget�� ���� <= 10,000,000
 * �μ��� ��û �ݾ� : 1 �̻� 100,000 ������ �ڿ���
 * �迭 d  : �μ����� ��û�� �ݾ��� ����ִ� �迭
 */

package programmers;

import java.util.Arrays;

public class Solution27 {


    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        //System.out.println(Arrays.toString(d));
        
        for(int i = 0; i < d.length; i++) {
        	//System.out.println("arr : "+d[i]);
        	//System.out.println("budget : "+ budget);
        	budget -= d[i];
        	//System.out.println("budget : "+ budget);
        	if(budget < 0) {
        		break;
        	}
        	answer++;
        	//System.out.println("answer : "+ answer);        	
        	//System.out.println("-------");
        }
        
        return answer;
    }

	
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		Solution27 s = new Solution27();
		System.out.println(s.solution(d, budget));
		
	}

}
