package co.jessie.forExample;

import java.util.Scanner;

public class NumberScanner {
	/*
	 * 입력한 수가 짝수면, 짝수라고 홀수면 홀수라고 출력하기 (Scanner로 입력받기) >5 출력창 - 홀수입니다. 홀수 :n % 2 == 1
	 * >36 출력창 - 짝수입니다. 짝수: n % 2 == 0
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요.");
			int i = sc.nextInt();
			sc.nextLine();
			if (i % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
	}

}
