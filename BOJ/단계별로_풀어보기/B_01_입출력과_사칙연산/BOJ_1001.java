/**

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A-B를 출력한다.

*/
// WAY1 메모리 17704kb 시간 212ms
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		System.out.println(A-B);
 
		in.close();//리소스 누수 관련으로 적극 권장이라고 한다...
	}
}

// WAY2 메모리 14152kb 시간 124ms
//BufferedReader 을 쓰는 방식
//st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다.
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
