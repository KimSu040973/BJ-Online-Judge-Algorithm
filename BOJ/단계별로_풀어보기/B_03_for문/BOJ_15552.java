
/*
문제
본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다.

Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 
테스트케이스를 하나 받은 뒤 하나 출력해도 된다.


입력
첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

출력
각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

[scanner & System.out.println() 사용 X]
모든 테스트케이스가 1.5초 즉, 1500ms 내의 시간에서 풀려야 한다.
문제에서 보면 최대 100만개의 테스트 케이스가 주어진다. 
케이스가 늘어나면 늘어날 수록 문제점이 생기는데 바로 System.out.println()의 호출횟수 또한 증가한다는 것이다.
그래서 아무리 BufferedReader 을 써줬어도 System.out.println() 을 각 테스트 케이스마다 해주면 시간초과가 되어버린다.
**/

// Way1  [ BufferedReader & BufferedWriter 사용 ]    kb     ms
// StringBuilder 로 하나의 문자열로 계속 연결시킨 뒤 가장 마지막에 연결된 하나의 문자열을 출력시키는 방법.

import java.io.*;
import java.util.StringTokenizer;
 
public class Main { 
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
 
		int N = Integer.parseInt(br.readLine()); //테스트 케이스 입력
        
		StringTokenizer st;
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");//입력
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");//출력
		}
		br.close();   
		bw.flush();
		bw.close();
 
	}
}

// Way2 [ BufferedReader & StringBuilder 사용 ]  kb     ms 
// BufferedWriter 로 버퍼에 담아둬았다가 한 번에 데이터를 보내는 방법

import java.io.*;
import java.util.StringTokenizer;
 
public class Main { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine()); //테스트 케이스 입력
        
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," "); //입력
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');/출력을 위한 입력값 더하기
		}
		br.close();
 
		System.out.println(sb); //한번에 출력
 
	}
}


// way3 [BufferedReader & BufferedWriter 와 split 사용]
// readLine() 으로 문자열을 한번에 입력받고 String.split() 메소드로 " " 구분자 기준으로 분리
// 연산 내용을 BuffreedWriter.write() 안에 넣어 출력
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int N = Integer.parseInt(scan.readLine()); //테스트 케이스 입력
        int a,b;
        for(int i=1 ; i<=N ; i++){
            String s = scan.readLine(); //입력
            a = Integer.parseInt(s.split(" ")[0]); //입력값 변환
            b = Integer.parseInt(s.split(" ")[1]);
            print.write(a+b+"\n");  //출력
        }
        print.flush();
      
    }
}
/*
[s.split(" ")[0] 과 같은 역할_입력값 분리]

- int target = str.indexOf(" "); //구분자 " "로  분리

- int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));	
//substring (x) x가 나오면 이후는 잘라 없애기	

- sb.append(result+"\n");
//한번에 출력을 위해 띄어쓰기 append!!

*/
