/*
문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
**/
// Way 1 ( Scanner + ArrayList + Collections 함수 ) 
// 입력과 add 분리하고 sort 하지 않는 것이 가장 빠름
import java.util.*;
class Main{ 
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        ArrayList<Integer> num= new ArrayList<>();
        
        for( int i=0; i < N; i++)  {
            int a = s.nextInt(); num.add(a);  // == num.add(s.nextInt()); 
        }
        System.out.println(Collections.min(num)+" "+ Collections.max(num));
        //== Collections.sort(num);        System.out.println(num.get(0) +" " + num.get(N-1));
    }
}


import java.util.*;
import java.io.*;

class Main{ 
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    ArrayList<Integer> num= new ArrayList<>();
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    for( int i=0; i < N; i++)  {
        int A = Integer.parseInt(st.nextToken());
        num.add(A);
    }
        
        System.out.println(Collections.min(num) +" " + Collections.max(num));
  
    }
}
