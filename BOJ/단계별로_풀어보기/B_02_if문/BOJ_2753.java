/**
문제
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.

입력
첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.

출력
첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
*/

// WAY1 메모리 17760kb 시간 212ms
// Scanner 를 사용하여 in.nextInt() 로 정수 입력받는 방법

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        s.close(); // 리소스 누수 권장사항,,
        if( (year%4 == 0 && year%100 != 0) || year%400 == 0 )   //메모리  17760 시간	212
        //==if( year%4==0 && ( year%100 != 0 || year%400 == 0 ))  메모리	 17764 시간	208
        {
            System.out.println("1"); //== println(1);
        }
        else {
            System.out.println("0"); //== println(0);            
        }
         
    }
}
// 삼항연산자(성능차 크지X)
// == System.out.println((year%4 == 0 && year%100 != 0) || year%400 == 0  ? "1" : "0");
// 메모리 17728 시간	208





// WAY2 메모리 14248kb 시간 132ms
// BufferedReader 을 쓰는 방식
// readLine() 이용해 한번에 입력받은 문자열을 Integer.parseInt()로 int 형으로 변환
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        
        if((year%4 == 0 && year%100 != 0) || year%400 == 0)   System.out.println("1");
        else  System.out.println("0");        
    }
}
// 삼항연산자(성능차 크지X)
// == System.out.println((year%4 == 0 && year%100 != 0) || year%400 == 0  ? "1" : "0");
// 메모리 14288 시간	124



