package com.test.programmers;

public class StrangeCharacter {

	/**
	 * @param args
	 * https://programmers.co.kr/learn/courses/30/lessons/12930
	 * 
	 */
	public static void main(String[] args) {

		//¦���� �빮��
		// Ȧ���� �ҹ��ڷ�
		// �ܾ ¦/Ȧ��
		
		String s = "tray hello world";

		String answer = "";
		boolean isOdd = false;
		for(String checkStr : s.split("")) {
			System.out.println(checkStr);
			if(checkStr.equals(" ") || isOdd){
				answer += checkStr.toLowerCase();
				isOdd = false;
			}else {
				answer += checkStr.toUpperCase();
				isOdd = true;
			}
		}
		
		System.out.println(answer);
	}

}
