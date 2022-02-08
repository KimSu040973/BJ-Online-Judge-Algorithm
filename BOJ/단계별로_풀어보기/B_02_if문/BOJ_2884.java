
/*

"45분 일찍 알람 설정하기"

입력
첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.


출력
첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)


**/
// WAY1 (Scanner + 수학연산)           메모리18512kb 시간236ms
// Scanner 를 사용하여 2개의 입력값을 모두 in.nextInt() 로 정수 입력받는 방법
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int h= s.nextInt();
        int m= s.nextInt();
        s.close();//리소스 누수 방지
        if(m-45 < 0){
            if(h-1 < 0){
                h=23;
                m=60+(m-45);
                System.out.println(h+" "+m);
            }
            else{
                h=h-1;
                m=60+(m-45);
                System.out.println(h+" "+m);
            }
        }
        else{
            m-=45;
            System.out.println(h+" "+m);
        }
    }
}



// WAY2 메모리( BufferedReader + 수학연산 )  메모리 16080	kb 시간 168ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(s.readLine()," ");
        int h= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
       
        if(m-45 < 0){     // 0~44분 일 경우
            h=h-1;        // 시(Hour)에 -1해주고 
            if(h < 0){    // 시(Hour)을 -1 할때 음수될 경우 (ex.00:10->23:25) 
                h=23;     
            }
            m=60+(m-45);  // == 60 - (45-입력값)
            System.out.println(h+" "+m);
        }
        else{             // 분(Minute)이 45분 이상이면 분(Minute)만 연산해줌 된다.
            m-=45;
            System.out.println(h+" "+m);
        }
    }
}





