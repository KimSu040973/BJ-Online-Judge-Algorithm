
/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
**/

// WAY1 (Scanner + 수학연산)            메모리 17860	kb 시간 228ms
// Scanner 를 사용하여 2개의 입력값을 모두 in.nextInt() 로 정수 입력받는 방법

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int a,b;
        for(int i=0 ; i<N ; i++){
            a = s.nextInt();
            b = s.nextInt();
            System.out.println(a+b);
        }
        s.close();
    }
}


// WAY2-1 ( BufferedReader  + 수학연산 )  메모리 14328	kb 시간 132ms
// BufferedReader  클래스를 쓰는 방식
// 입력값은 readLine()을 이용해 문자열로 한번에 받는다.
// N 문자열을 Integer.parseInt()로 int 형으로 변환
/*
입력에서 A 와 B 의 범위는 1~9 사이다.
그럼 입력받은 문자열의 배열 위치는 아래처럼 고정된다.
 
 A     " "     B 
[0]    [1]    [2]

A 와 B 는 "무조건" 한 자릿수만 입력받기 때문에 문자열로 입력받을시 공백이 들어가는 위치는 언제나 고정!!
그럼 문자열의 특정 위치의 문자를 반환해주는 charAt() 을 쓰면 StringTokenizer 객체 생성 필요X

==>결국 시간이 더욱 단축 된다.
*/

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a,b;
        String st;                              
        for(int i=0 ; i<N ; i++){
            st = br.readLine();
            a = st.charAt(0)-48;
            b = st.charAt(2)-48;
            System.out.println(a+b);
        }
        br.close();
    }
}



// WAY2-2 ( BufferedReader + StringTokenizer + 수학연산 )  메모리 14160kb 시간 140ms
// BufferedReader 와 StringTokenizer 클래스를 쓰는 방식
// Ex 입력을 보면 " " 로 구분 O == Stringtokenizer 필요 O
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a,b;
        StringTokenizer st;                              
        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
        br.close();
    }
}

// WAY2-3 ( BufferedReader + StringTokenizer + StringBuilder )  메모리 14228kb 시간 132ms
// BufferedReader 와 StringTokenizer 클래스로 입력받아 한번에 출력하는 방식
// Ex 입력을 보면 " " 로 구분 O == Stringtokenizer 필요 O
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환
// 바로 StringBuilder 에 계산한 식을 넣어준 뒤 나중에 한 번에 출력해주는 방식
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();                              
        for(int i=0 ; i<N ; i++){
           st = new StringTokenizer(br.readLine()," ");
           sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }
        System.out.println(sb);
    }
}


