/**

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-9 이하이면 정답이다.

*/

// Way1   메모리 17760kb   시간 208ms
// Scanner 사용하여 s.nextDouble()로 실수 입력 받는 방법
// 오차범위 고려하여 Double 형 변수 사용
import java.util.Scanner;
 
public class Main { 
	public static void main(String[] args) {
 
		Scanner s=new Scanner(System.in);
		
		double a=s.nextDouble();
		double b=s.nextDouble();
		
		s.close(); //리소스 누수로 적극권장
		System.out.print(a/b); 
	}
}

// Way2   메모리 14308kb  시간 136ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 "실수" 문자열을 오차범위 고려하여 Double.parseDouble()로 Double 형으로 변환
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
       
        System.out.println(a/b);
    } 
}


