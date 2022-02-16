/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

출력
각 테스트 케이스마다 A+B를 출력한다.
**/

// Way 1  ( Scanner + 수학연산 )  메모리 17872 kb  시간	228 ms
// Scanner 를 사용하여 2개의 입력값을 모두 in.nextInt() 로 정수 입력받는 방법 
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true){
            int A = s.nextInt();
            int B = s.nextInt();
            if(A==0 && B==0){
              s.close(); //리소스 누수 관련 
              break;
            }
            System.out.println(A+B);
        }
    }
}



// Way 2 ( BufferedReader + 수학연산) 메모리 14096 kb  시간	128 ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환

import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        while(true){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A==0 && B==0){
              br.close();
              break;
			}
            System.out.println(A+B);
        }
    }
}

/*
- 메모리 14184 kb  시간	124 ms,,,,미세한 시간 단축
 
[ System.out.println(A+B) 대신 StringBuileder 로 출력하는 방법]

        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A==0 && B==0){
              br.close();
              break;
            }
            sb.append(A+B).append("\n");
        }
        System.out.println(sb);
*/




// Way 3 ( BufferedReader + StringBuilder + charAt) 메모리 14232kb  시간	120ms
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
import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String s = br.readLine();
            int A = s.charAt(0)-48;
            int B = s.charAt(2)-48;
            if(A==0 && B==0){
				br.close();
				break;
			}
            sb.append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}

