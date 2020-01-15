package co.jessie.forExample;

public class For {
	/*
	 * 1부터 100까지 수 중에서 5의 배수만 출력하세요. 5 10
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) { // % 나머지!!!
				System.out.println(i);
			}
		}
	}

}
