/*

문제
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 X를 입력. (1 ≤ N, X ≤ 10,000)
둘째 줄에 수열 A를 이루는 정수 N개를 입력. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

출력
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

**/

// WAY1 (Scanner + ArrayList)            메모리 32180kb 시간 612ms
// Scanner 를 사용하여 입력값을 모두 in.nextInt() 로 정수 입력받는 방법
// 출력은 ArrayList 객체의 add() "추가" 와 get() "출력" 메소드 이용

import java.util.*;

class Main{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in); 
        int N = s.nextInt();
        int X = s.nextInt();
        int A = 0;
      
        ArrayList<Integer> a = new ArrayList<>();
      
        for(int i=1 ; i<=N ; i++){
            A =s.nextInt();
            if(A<X){
                a.add(A);
            }                     
        } 
        for(int i=0 ; i<a.size() ; i++){
            System.out.print(a.get(i)+ " ");                   
        }            
    }    
}
/*
  Way 1-1. 	30860 kb	  428 ms
  [ArrayList 대신 StringBuilder 로 시간 단축 방법]  
  
    int N = in.nextInt();
		int X = in.nextInt();
		StringBuilder a = new StringBuilder();
        int A = 0;
		for (int i = 0; i < N; i++) {
			A = in.nextInt();
            if(A<X) a.append(A+" ");
		}	
        System.out.println(a);	
        
*/

// WAY2 메모리( BufferedReader + StringBuilder )  메모리 16232kb 시간 200ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
        int N = Integer.parseInt(st.nextToken());
		    int X = Integer.parseInt(st.nextToken());
		    int A = 0;
        
        StringBuilder a = new StringBuilder();
        st = new StringTokenizer(br.readLine()," ");  // N개의 수열 A를 한번에 입력
	    	for (int i = 0; i < N; i++) {
		  	    A = Integer.parseInt(st.nextToken());     // st.nextToken() 로 분리하여 int형으로 초기화
            if(A<X) a.append(A+" ");
	    	}	
        System.out.println(a);	
	}
}

