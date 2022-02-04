/**
         4 7 2   -- --(1)
      x  3 8 5   -- --(2)
______________________
       2 3 6 0   -- --(3)
     3 7 7 6     -- --(4)
   1 4 1 6       -- --(5)
_______________________
   1 8 1 1 7 0   -- --(6)
   
입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

EX>> 
472 385 (X)    |    472 
               |    385 (O)

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

솔루션
두 번째 입력으로 들어오는 정수를 분리하여 각 각 곱한 값을 출력(3~5) 한 뒤 마지막에는 원래 식의 연산 값을 출력해주어야 한다.
*/

// WAY1 (Scanner + 수학연산)            메모리 17588kb 시간 204ms
// Scanner 를 사용하여 2개의 입력값을 모두 in.nextInt() 로 정수 입력받는 방법

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        
        s.close()//리소스 누수로 사용 적극권장,,
        
        System.out.println(a*(b%10));
        System.out.println(a*(b/10%10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
        
        
    }
}

// WAY2 ( BufferedReader + 수학연산 )    메모리 14084kb 시간 128ms
// BufferedReader 을 쓰는 방식
// Ex 입력을 보면 " " 로 구분 X == Stringtokenizer 필요 X 
// 두 정수 입력값은 readLine()를 이용하여 문자열로 입력받아
// Integer.parseInt()로 int 형으로 변환

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        //StringTokenizer st = new StringTokenizer(br.readLine(),"\n"); (X)
      
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        System.out.println(a*(b%10));
        System.out.println(a*(b/10%10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}


// WAY3 ( BufferedReader + toCharArray )  메모리 14012kb 시간 124~128ms
// BufferedReader 을 쓰는 방식
// Ex 입력을 보면 " " 로 구분 X == Stringtokenizer 필요 X 
// 첫 번째 입력값 세 자리수 정수를 문자열로 입력받아 Integer.parseInt()로 int 형으로 변환
// 두 번째 입력값 분리 방법: toCharArray() 로 문자열을 character 배열로 한 자리씩 넣어주어 이용하는 방법
// EX> 385 --> ["3","8","5"] (예시를 든것뿐,,실제 char[] b 출력값은 385로 출력됨)
// 마지막 마지막 출력은 전체 곱한 결과를 출력하면 되므로 
// Integer.parseInt()을 통해 문자열을 int형으로 바꿔주어 A와 곱해준 값을 출력
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        char[] b = br.readLine().toCharArray(); // 문자열로 입력받고 Char형 배열로 변환
        
        System.out.println(a*(b[2]-48)); //셋째 자리 ASCII - 48 or "0" 
        System.out.println(a*(b[1]-48)); //둘째 자리 ASCII - 48 or "0" 
        System.out.println(a*(b[0]-48)); //첫째 자리 ASCII - 48 or "0" 
        System.out.println(a*Integer.parseInt(new String(b))); //CharArr-->String-->integer      
        //== System.out.println(a*Integer.parseInt(String.valueOf(b)));                              
    }
}
        // [ Char 배열을 Int로 변환 ] https://www.delftstack.com/ko/howto/java/char-array-to-int-java/
        // +함수 대문자 오류 신경쓰기 + 메모리 시간 성능 비슷함 
        // 참고. 변수.toString() 메소드는 변환메서드가 아닌 재정의메서드 입니다.  
        // [t oString() 메서드 ] https://seeminglyjs.tistory.com/192


