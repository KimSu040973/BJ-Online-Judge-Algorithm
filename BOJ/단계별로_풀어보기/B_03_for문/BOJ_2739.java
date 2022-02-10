
/*

문제
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

입력
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

출력
출력형식과 같게 N*1부터 N*9까지 출력한다.

**/

// WAY1 (Scanner + 수학연산)            메모리 18512		kb 시간 244ms
// Scanner 를 사용하여 2개의 입력값을 모두 in.nextInt() 로 정수 입력받는 방법
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N= s.nextInt();
        s.close();
        for (int i=1 ; i<=9 ;i++){
            System.out.println(N + " * " + i + " = " + i*N);
        }
    }
}



// WAY2 ( BufferedReader + 수학연산 )    메모리 16192	kb 시간 160ms
// BufferedReader 를 쓰는 방식
// Ex 입력을 보면 " " 로 구분 X == Stringtokenizer 필요 X 
// 입력값을 read() or readLine()를 이용하여 입력받아 필요시 int형으로 변환하여 정수로 연산
/*
1) int read()
: 스트림으로부터 한 문자를 아스키 코드(ASCII)로 읽어서 int형으로 리턴 ('3' -> (int)'3' -> 51)

2) String readLine()
: 스트림으로부터 한 줄을 읽어 문자열로 리턴

[참고] https://snupi.tistory.com/48
*/
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int N= b.read()-48;
      //== int N= Integer.parseInt(b.readLine());
        
        for (int i=1 ; i<=9 ;i++){
            System.out.println(N + " * " + i + " = " + i*N);
        }
    }
}







