package co.jessie.whileFor;

public class Print1to1000 {

	public static void main(String[] args) {
		//if와 while을 이용해서 출력해보기. 역순으로. 이게시험문제였었음.
		//1000 999 998 997 996 .. .. .. 
		int n = 1000;
		int i = 1;
//      case 1 : while문일때만
//		while(n>=1) {                
//			System.out.println(n);
//			n--;
//		}
		
     //case 2 : while문일때 순차적으로 표현
//		while(i<=1000) {
//			System.out.println(i);
//			i++;
//		}
		
	//case 3 : while if 둘다 사용하기 1000~1 역순으로. 시험문제
//		while(true) {
//			if(n>=1) {
//				System.out.println(n);
//				n--;
//			}else {
//				break;
//			}
//		}
	
	//case 4 : while if 사용 1~1000 출력.
		while(true) {
			if(i<=1000) {
				System.out.println(i); //1000을 일단 표현해야하니까
				i++;
			}else {
				break;
			}
		}
	}

}
