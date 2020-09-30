/*
 * ����� ����
 * ����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�.
 * 2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�
 */

package programmers;

import java.sql.Array;

import org.omg.Messaging.SyncScopeHelper;

public class Solution11 {
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i < arr1.length; i++) {
        	for(int j=0; j<arr1[0].length;  j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution11 s = new Solution11();
		int[][] arr1= {{1,2},{2,3}};
		int[][] arr2= {{3,4},{5,6}};

		System.out.println();
		int[][] answer = s.solution(arr1, arr2);
		for (int y = 0; y < answer.length; y++) {
			for (int x = 0; x < answer[0].length; x++) {
				System.out.print(answer[y][x]);
				System.out.print(' ');
			}
			System.out.println();
		}

	}

}


//arr1[0][0]+arr2[0][0] arr1[0][1]+arr2[0][1]
//arr1[1][0]+arr2[1][0] arr1[1][1]+arr2[1][1]