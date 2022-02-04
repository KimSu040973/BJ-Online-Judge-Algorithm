/**

 입력
 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 
 출력
 첫째 줄에 A+B를 출력한다.
 
 */

// WAY1 메모리 17740kb  시간	216ms
// Scanner 를 사용해 s.nextInt()로 정수 입력받아 연산하는 방법
import java.util.*;
public class Main{
    public static void main(String[] argc){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a+b);
    }
}


// WAY2 메모리 14188kb  시간	124ms
// BufferedReader 을 쓰는 방식
// BufferedReader 의 경우 문자열을 받는 대표적인 방법은 readLine() 과 read() 이다.
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
   	     //read() 메소드는 문자 1 개만 아스키코드(문자)로 읽어 정수형태로 반환
 	     //만약 2라는 정수를 입력해도 문자로 인식하여 실제 변수엔 아스키 코드 50이 저장된다 
	     //그래서 '0'or 48을 빼야 50-48=2가 나온다
	     int a = br.read() - '0'; 
	     
	     //(공백 구분)스페이스나 엔터 받아서 
	     br.read();
    
 	     //다음 문자 입력 받기
             int b = br.read() - '0';    
		
	     System.out.println(a + b);
	}
}


// WAY3 메모리 14184kb  시간	124ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); 
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환
import java.io.*;
import java.util.StringTokenizer;
 
public class Main { 
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine(); //한번에 문자로 입력
		StringTokenizer st = new StringTokenizer(str," "); //입력받은 문자 스페이스로 구분
		//굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.
		//== StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken()); // Integer 정수 자료형으로 초기화
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
    }
}

// [Integer.parseInt(String타입의 값)](https://colossus-java-practice.tistory.com/32)
