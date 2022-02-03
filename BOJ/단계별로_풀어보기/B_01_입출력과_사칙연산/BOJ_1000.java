/**
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 첫째 줄에 A+B를 출력한다.
 *
 */
// WAY1 메모리 17740kb  시간	216ms
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
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    //문자 하나만 입력 받기 (하나 이상은 readline() 사용할것)
    //	int a = br.read() 로 2를 눌러 입력 받음 50 임 그래서 '0'인 48을 빼야 50-48=2가 나옴
    int a = br.read() - '0'; 
    
		//(공백 구분)스페이스나 엔터 받아서 
    br.read();
    
		//다음 문자 입력 받기
    int b = br.read() - '0';    
		
		System.out.println(a + b);
	}
}


// WAY3 메모리 14184kb  시간	124ms
import java.io.*;
import java.util.StringTokenizer;
 
public class Main { 
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine(); //한번에 문자로 입력
		StringTokenizer st = new StringTokenizer(str," "); //입력받은 문자 스페이스로 구분
		int a = Integer.parseInt(st.nextToken()); //단순 규칙으로 문자열을 분리한 것을 정수 자료형으로 초기화
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
    }
}

// [Integer.parseInt(String타입의 값)](https://colossus-java-practice.tistory.com/32)
