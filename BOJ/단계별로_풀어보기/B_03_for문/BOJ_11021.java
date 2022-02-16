/*

문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
**/

// Way1 [ Scanner 사용 ]   18664	kb     252ms

import java.util.*;
class Main{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in); 
        int N =s.nextInt();           // 테스트 케이스 입력
        for(int i=1 ; i<=N ; i++){
            int a =s.nextInt();       // a와 b 입력
            int b =s.nextInt();
            System.out.println("Case #" + i + ": " + (a+b)); // 합 출력
        }
    }
}


// Way2 [ BufferedReader & StringBuilder & CharAt 사용 ]   14164	kb     132ms
// BufferedReader 로 입력받아 StringBuilder로 한번에 출력하는 방법
// A와 B 입력값 법위가 정해져 있기때문에 입력값 및 공백 위치 알 수 있다.
// charAt()은 문자를 아스키코드 정수로 출력한다.
// charAt(): String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
// 원하는 정수 출력을 위해 연산(-48 or -"0")이 필요하다.

import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in)); 
        int N =Integer.parseInt(s.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=1 ; i<=N ; i++){
            String st= s.readLine();
            int a =st.charAt(0)-48; 
            int b =st.charAt(2)-48;
            sb.append("Case #").append(i).append(": ").append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}


