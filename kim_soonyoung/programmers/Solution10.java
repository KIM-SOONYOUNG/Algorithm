/* 
 * ��� ���ϱ�
 * ������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.
 */

package programmers;

public class Solution10 {
	
	public double solution(int[] arr) {
        double answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	answer += arr[i];
        }
        
        return answer = answer/arr.length;
    }
	
	public static void main(String[] args) {
		Solution10 s = new Solution10();
		int [] arr = {1,2,3,4};
		System.out.println(s.solution(arr));
	}

}
