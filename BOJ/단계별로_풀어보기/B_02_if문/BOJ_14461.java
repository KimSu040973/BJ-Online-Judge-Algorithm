
/*
흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.

Quadrant 2     |     Quadrant 1
   B(-12,5)    |        A(12,5)
_______________|___________________>X축
Quadrant 3     |     Quadrant 4
   C(-12,-5)   |        D(12,5)

예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.

입력
첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)

출력
점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.

**/
// WAY1 (Scanner + 수학연산)       메모리 17680kb 시간 204ms
// Scanner 를 사용하여 2개의 입력값을 모두 in.nextInt() 로 정수 입력받는 방법
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int y= s.nextInt();
       s.close(); // 리소스 누수
        if(x>0 && y>0){
                System.out.println(1);
            }
        else if(x<0 && y>0) {
                System.out.println(2);
        }
        else if(x<0 && y<0) {
                System.out.println(3);
        }
        else if(x>0 && y<0) {
                System.out.println(4);
        }     
    }
}


// WAY2 ( BufferedReader + 수학연산 )    메모리 14144kb 시간 120ms
// BufferedReader 을 쓰는 방식
// Ex 입력을 보면 " " 로 구분 X == Stringtokenizer 필요 X 
// 두 정수 입력값은 readLine()를 이용하여 문자열로 입력받아
// Integer.parseInt()로 int 형으로 변환
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x= Integer.parseInt(br.readLine());
        int y= Integer.parseInt(br.readLine());
        
        if(x>0 && y>0){
                System.out.println(1);
            }
        else if(x<0 && y>0) {
                System.out.println(2);
        }
        else if(x<0 && y<0) {
                System.out.println(3);
        }
        else if(x>0 && y<0) {
                System.out.println(4);
        }     
    }
}

