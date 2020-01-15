package co.jessie.sum;

public class SumExample {

	public static void main(String[] args) {
//10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
//1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
		int sum = 0;

		for(int i = 0; i<1000; i++) {
			if(i % 3 == 0 || i % 5 ==0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}