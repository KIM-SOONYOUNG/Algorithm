package youtube;

import java.util.Scanner;

public class Decimal {

	public String solution(int n) {
		if(n == 2) {
			return "�Ҽ��Դϴ�.";
		}
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return "�Ҽ��� �ƴմϴ�.";
			}
		}
		return "�Ҽ��Դϴ�.";
	}
	
	public static void main(String[] args) {
		Decimal d = new Decimal();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(d.solution(n)); //13
		
	}

}


/*
 * 1 1
 * 2 1 2
 * 3 1 3
 * 4 1 2 4
 * 5 1 5
 * 
 */