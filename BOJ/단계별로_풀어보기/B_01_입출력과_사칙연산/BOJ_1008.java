/**

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

*/
// Way1 메모리 kb 시간 ms
// Scanner 사용하여 in.nextDouble()로 실수 입력 받는 방법
// 오차범위 고려하여 Double 형 변수 사용
import java.util.Scanner;
 
public class Main { 
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
		
		double a=in.nextDouble();
		double b=in.nextDouble();
		
		in.close(); //리소스 누수로 적극권장
		System.out.print(a/b); 
	}
}

// Way2 메모리 kb 시간 ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
