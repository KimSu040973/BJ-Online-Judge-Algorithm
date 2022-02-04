
/**
[if문 단골_시험 성적 문제]
문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
시험 성적을 출력한다.

*/

// WAY1 메모리 17744kb 시간 208ms
// Scanner 를 사용하여 in.nextInt() 로 정수 입력받는 방법

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int score;
        score = s.nextInt();
        s.close();//리소스 누수 문제로 사용 적극권장,,
        if(score>=90)      { System.out.println("A");}
        else if(score>=80) { System.out.println("B");}
        else if(score>=70) { System.out.println("C");}
        else if(score>=60) { System.out.println("D");}
        else               { System.out.println("F");}
    }
}
// System.out.print((score>=90)?"A": (score>=80)? "B": (score>=70)? "C": (score>=60)? "D": "F");
// 메모리 17752  시간	220




// WAY2 메모리 14280	kb 시간 128ms
// BufferedReader 을 쓰는 방식
// readLine() 로 입력받은 문자열을 Integer.parseInt()로 int 형으로 변환

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        
        if(score>=90)      { System.out.println("A");}
        else if(score>=80) { System.out.println("B");}
        else if(score>=70) { System.out.println("C");}
        else if(score>=60) { System.out.println("D");}
        else               { System.out.println("F");}
    }
}
// System.out.print((score>=90)?"A": (score>=80)? "B": (score>=70)? "C": (score>=60)? "D": "F");       
// 메모리 14248 시간	128 (메모리만 조금 줄었다.)


