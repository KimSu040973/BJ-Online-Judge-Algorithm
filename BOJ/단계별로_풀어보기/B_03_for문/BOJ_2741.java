/*
문제
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
**/
//Way1 [Scanner 사용 ]   34168 kb	1176ms
import java.util.*;
class Main{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in); 
        int N =s.nextInt(); //정수 입력
        for(int i=1 ; i<=N ; i++){
            System.out.println(i); //1부터 N까지 한 줄에 하나씩 출력
        }
    }
}


//Way2 [BufferedReader 사용]   31656kb   976ms
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in)); 
        int N =Integer.parseInt(s.readLine()); //정수 입력
        for(int i=1 ; i<=N ; i++){
            System.out.println(i);//1부터 N까지 한 줄에 하나씩 출력
        }
    }
}

