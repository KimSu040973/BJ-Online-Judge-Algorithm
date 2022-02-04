/**

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A-B를 출력한다.

*/
// WAY1 메모리 17704kb 시간 212ms
// Scanner 를 사용하여 in.nextInt() 로 정수 입력받는 방법
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		System.out.println(A-B);
 
		in.close();//리소스 누수 관련으로 적극 권장이라고 한다..
	}
}


// WAY2 메모리 14152kb 시간 124ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환
import java.util.*;
import java.io.*;
 
public class Main { 
	public static void main(String[] args) throws IOException { 
  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//InputStreamReader라는 빨대로 입력을 문자로 읽을 준비
    
    		String str = br.readLine(); // 문자로 한번에 읽기    
   		StringTokenizer st = new StringTokenizer(str," "); //한번에 읽은 문자 " " 로 구분
   		//==  StringTokenizer st = new StringTokenizer(br.readLine()," "); 
    
  		int A = Integer.parseInt(st.nextToken()); //으로 차례로 정수로 초기화
 		int B = Integer.parseInt(st.nextToken());
    
 		System.out.println(A-B); 
	}
}
//[Integer.parseInt(String타입의 값)](https://colossus-java-practice.tistory.com/32)
