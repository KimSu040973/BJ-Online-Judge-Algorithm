/*

문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.


입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)


출력
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

**/

// WAY1 (Scanner + 수학연산)            메모리 19048	kb 시간 268ms
// Scanner 를 사용하여 2개의 입력값을 모두 in.nextInt() 로 정수 입력받는 방법
import java.util.*;
class Main{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in); 
        int N =s.nextInt();
        for(int i=1 ; i<=N ; i++){
            int a =s.nextInt();
            int b =s.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b +" = "+ (a+b));
        }
        s.close();
    }
}

// WAY2 메모리( BufferedReader + 수학연산 )  메모리 16388kb 시간 180ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환

import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int N =Integer.parseInt(br.readLine());
        StringTokenizer st ;
                                               
        for(int i=1 ; i<=N ; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());
            System.out.println("Case #" + i + ": " + a + " + " + b +" = "+ (a+b));
        }
      br.close();
    }
}


// WAY3 ( BufferedReader + StringBuilder + CharAt )  메모리 	14112kb 시간 128ms
// BufferedReader 로 입력 받아 StringBuilder 로 출력하는 방법
// (StringBuilder.append(): 당장 출력한 데이터는 많지 않아 시간 단축이 눈에 띄지 않아도 한번에 출력할 수 있는 방법 익히기)
// 테스트 케이스의 개수 N를 문자열로 입력받아 Integer.parseInt()로 int 형으로 변환
/*
입력에서 A 와 B 의 범위는 1~9 사이다.
그럼 입력받은 문자열의 배열 위치는 아래처럼 고정된다.
 A     " "     B 
[0]    [1]    [2]
A 와 B 는 "무조건" 한 자릿수만 입력받기 때문에 문자열로 입력받을시 공백이 들어가는 위치는 언제나 고정!!

그럼 문자열의 특정 위치의 문자를 반환해주는 charAt() 을 쓰면 StringTokenizer 객체 생성 필요X
==>결국 시간이 더욱 단축 된다.
*/

import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int N =Integer.parseInt(br.readLine());
      
        StringBuilder sb = new StringBuilder();
        String s;
                                               
        for(int i=1 ; i<=N ; i++){
            s = br.readLine();
            int a =s.charAt(0)-48; // ASCII - 48 or "0" 
            int b =s.charAt(2)-48; // ASCII - 48 or "0" 
          
            sb.append("Case #").append(i).append(": ").append(a)
			.append(" + ").append(b).append(" = ").append(a+b).append('\n');         

        }
        System.out.println(sb); //한번에 
        br.close();
    }
}
/*

[ 문자열(ASCII표현)을 정수로 표현 ]

s.charAt(0) 는 문자 Char형으로 출력된다. 
==> 정수출력 or 정수연산을 위해 아스키 코드값 에서 48 or "0" 를 빼서 정수로 표현해야 한다. 


[ StringBuilder 을 생성하여 하나의 문자열로 연결 해 준 다음 한번에 출력하는 방법 ]

sb.append("Case #").append(i).append(": ").append(a)
			.append(" + ").append(b).append(" = ").append(a+b).append('\n'); 
      
==sb.append("Case #"+ i + ": " + A + " + " + B + " = " + (A+B) +  "\n" );

출력할 문자에 여러 타입이 너무 많이 섞여있으면 
해당 메소드는 일일이 타입검사를 해주어야 하기 때문에 시간이 미약하게나마 더 걸리게 된다. 

물론 성능 상관없이 하나로 합쳐서 써도 무방 but 반대로 하나하나 다 나눠서 넣어줘도 무방하다!

*/


