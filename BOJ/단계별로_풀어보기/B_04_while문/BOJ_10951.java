
/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
**/

// Way 1  ( Scanner + 수학연산 )  메모리 17832 kb  시간	232 ms
// Scanner 를 사용하여 2개의 입력값을 모두 in.nextInt() 로 정수 입력받는 방법 
// NoSuchElementException방지하는 방법
//-->hasNextInt() 또는 hasNext() 로 더이상 읽을 수 있는 데이터(EOF)가 없을때  while 문 종료
// 추가로 스페이스바 또는 엔터의 입력시에도 예외처리를 해줘야하지만 백준에서는  
// 더이상 데이터를 읽을 것이 없는경우 당연히 nextInt() 에서 받는 입력이 존재하지 않아 예외를 던져준다.
// (스페이스바 or 엔터 따윈 없음,,)

 
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()){  //== while(s.hasNext())
            int A = s.nextInt();
            int B = s.nextInt();
            System.out.println(A+B);            
        }
    }
}


// Way 2 ( BufferedReader + Stringbuilder) 메모리 14228 kb  시간	120 ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환
// NullPointer 방지법; BufferedReader 의 경우 null 을 반환한다. 
// 이 부분은 오히려 null 인지 아닌지만 조건문을 통해 구분해주면 된다.

import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;
        while((str=br.readLine()) != null){    //한번에 읽어온 문자열이 null이 아닐 경우 while~~ 
            st = new StringTokenizer(str," "); //str 에 한번에 읽은 문자열이 들어간다.
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A+B).append("\n");            
        }
        System.out.print(sb);
    }
}




// Way 3 ( BufferedReader + StringBuilder + charAt) 메모리 14168kb  시간	120ms
// BufferedReader 로 입력 받아 StringBuilder 로 출력하는 방법
// (StringBuilder.append(): 당장 출력한 데이터는 많지 않아 시간 단축이 눈에 띄지 않아도 한번에 출력할 수 있는 방법 익히기)
// charAt(): String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환

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
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        StringBuilder sb = new StringBuilder();
        String str;
        while((str=br.readLine()) != null){
           
            int A = str.charAt(0)-48;
            int B = str.charAt(2)-48;
            sb.append(A+B).append("\n");            
        }
        System.out.print(sb);
    }
}

