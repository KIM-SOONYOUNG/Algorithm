/*
 * ���� ������������ ��ġ�ϱ�
 * 
 * �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. 
 * n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
 * ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
 * 
 */

package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution17 {
	
	public long solution(long n) {
        long answer = 0;
        String a = Long.toString(n);
        
        Integer[] arr = new Integer[a.length()];
        
        for(int i = 0; i < arr.length ; i++) {
        	arr[i] = (int) (n % 10);
        	n = n / 10;
        }
        
       Arrays.sort(arr, Collections.reverseOrder()); //wrapper������ ����ؾ� �Ѵ�.
       for(int i = 0; i < arr.length; i++) {
    	   //answer += a[i];
    	   System.out.print(arr[i]);
       }
       
       for (int i = 0; i < arr.length; i++) {
    	   answer += arr[i];
    	   answer *= 10;
       }
       answer /= 10;

       return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		Solution17 s = new Solution17();
		//System.out.println(s.solution(n));
		
		s.solution(n);
	}

}
