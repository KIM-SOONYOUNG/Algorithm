/* 
���� : 1026�� - ����
���̰� N�� ���� �迭 A�� B
�Լ� S : S = A[0]*B[0] + ... + A[N-1]*B[N-1]
S�� ���� ���� �۰� ����� ���� A�� ���� ��迭����. ��, B�� �ִ� ���� ��迭�ϸ� �� �ȴ�.
S�� �ּڰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

5
1 1 1 6 0
2 7 8 3 1
*/

package baekjoon;

public class treasure {
	int sum=0;
	static int [] A = {1, 1, 1, 6, 0};
	int [] B = {2, 7, 8, 3, 1};
	

	public int S() {
		 for(int i=0;i<A.length;i++) {
			 sum += A[i]*B[i];
			 //System.out.println(sum);
		 }
		 return sum;
	}
	
	public static void main(String[] args) {
		treasure t = new treasure();
		t.S();
		
		int temp = A[2];
		A[2] = A[4];
		A[4] = temp;
		System.out.println(A);
		
	}

}
