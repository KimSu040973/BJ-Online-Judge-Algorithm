/*
문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 출력 1 __________
*                    |
**                   |
***                  |
****                 |
*****                |
_____________________|
**/

// WAY1 (Scanner + 수학연산)      메모리 18076kb 시간 308ms
// Scanner 를 사용하여 입력값을  in.nextInt() 로 정수를 입력받는 방법

import java.util.*;
class Main{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in); 
        int N =s.nextInt();
        for(int i=1 ; i<=N ; i++){
	        for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}


// WAY2 ( BufferedReader + 수학연산 )    메모리 15000kb 시간 216ms
// BufferedReader 를 쓰는 방식
// Ex 입력을 보면 " " 로 구분 X == Stringtokenizer 필요 X 
// readLine()를 이용하여 문자열로 입력받아 Integer.parseInt()로 int 형으로 변환

import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N =Integer.parseInt(br.readLine());
        for(int i=1 ; i<=N ; i++){
	        for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            } 
            br.close;
            System.out.println();
        }
    }
}
