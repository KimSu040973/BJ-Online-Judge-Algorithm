/**

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A×B를 출력한다.

*/

// Way1 메모리 17704kb 시간 208ms
// Scanner 를 사용해 s.nextInt()로 정수 입력받아 연산하는 방법
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        System.out.println(a*b);
    } 
}



// Way2 메모리 14256kb 시간	124ms
// BufferedReader 을 쓰는 방식
// StringTokenizer 클래스를 이용하여 분리해주는 방법
// 단순 규칙으로 문자열을 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");
        //== StringTokenizer st = new StringTokenizer(br.readLine()," ");
       
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        System.out.println(a*b);
    } 
}


