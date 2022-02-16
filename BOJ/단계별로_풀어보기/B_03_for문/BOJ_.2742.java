/*
문제
자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

예제 입력 1 
**/

// way1 [ Scanner 사용 ]     32972kb	1040ms

import java.util.*;
class Main{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in); 
        int N =s.nextInt();
        for(int i=0 ; i<N ; i++){
            System.out.println(N-i);
        }     
    }
}

//way2 [ bufferedReader 사용 ]   30168	kb      1072ms
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in)); 
        int N =Integer.parseInt(s.readLine());
        for(int i=0 ; i<N ; i++){
            System.out.println(N-i);
        }     
    }
}
