/**
[if 조건문의 기초]

입력
첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

출력
첫째 줄에 다음 세 가지 중 하나를 출력한다.

- A가 B보다 큰 경우에는 '>'를 출력한다.
- A가 B보다 작은 경우에는 '<'를 출력한다.
- A와 B가 같은 경우에는 '=='를 출력한다.

제한
-10,000 ≤ A, B ≤ 10,000

*/

// WAY1 메모리 17668kb 시간 208ms
// Scanner 를 사용하여 in.nextInt() 로 정수 입력받는 방법
import java.util.*;
public class Main{
    public static void main(String[] args){
        int a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        s.close();//리소스 누수로 사용 적극권장,,
        if(a>b){
            System.out.println(">");
        } 
        else if(a<b){
            System.out.println("<");
        }
        else if(a==b){
            System.out.println("==");
        }
    }
}
/*
다만 조건문을 좀 더 획기적으로 줄일 수 있는 방법이 있다!
이름하여 "삼항연산자" 다. 
변수 = (조건문) ? (true 일 때의 연산) : (false 일 때의 연산) ; (ex> boolean c = (a>b) ? true : false ;)

아래처럼 중첩하여 사용 가능하다.
System.out.println((a>b) ? ">" : ((a<b) ? "<" : "==" ));
메모리 17720 시간	204 
(메모리는 저하되지만 시간은 단축..근데 별차이 안나기에 편하고 가독성 좋은것으로 선택하여 사용할 것)
**/



// WAY2 메모리 14152kb 시간 124ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");                        
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a>b) System.out.println(">");
        else if(a<b) System.out.println("<");
        else System.out.println("==");
        //System.out.print((a>b) ? ">" : ((a<b) ? "<" : "==" ));(성능 같다 but 가독성은 좋아 보인다.)
    }
}


