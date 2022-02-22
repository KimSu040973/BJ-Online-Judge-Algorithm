
/*
문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
**/

// WAY2 메모리( Scanner + ArrayList )  메모리 333508 시간 1832
// Scanner로 입력받아 Arraylist에 담아서 구한다
// 최대 최소는 Collections 의 메소드 "Collections.min(num)"와 " Collections.max(num)" 사용한다.

import java.util.*;
class Main{ 
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    ArrayList<Integer> num= new ArrayList<>();
    
    for( int i=0; i < N; i++)  {
        int A = s.nextInt(); 
        num.add(A);
        // == num.add(s.nextInt());
    }       
        System.out.println( Collections.min(num) +" " +Collections.max(num));
        //Collections.sort(num);
        //System.out.println(num.get(0) +" " + num.get(N-1));
  
    }
}
/*
 [Collections.sort(num) 정렬후 최대 최소]
 최대최소를 위해 Collection.sort 로 오름차순 정렬 후
 맨앞(min)과 맨뒤(max)를 출력( get(0) ~ get(N-1) ) 
 -> 정렬로 시간 소요: 메모리 335680 시간	2360
*/




// WAY2 메모리( BufferedReader + ArrayList + StringTokenizer )  메모리 118440 시간 608
// BufferedReader와 ArrayList를 쓰는 방식
// ArrayList 에 정수 N개를 받아 Collection 에 최대 최소 메소드로 구한다.

// 단순 규칙으로 문자열 분리를 위해  StringTokenizer( "문자열" , 구분자 ); **구분자: " " or "\n"
// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환
// 반환된 문자열을 Integer.parseInt()로 int 형으로 변환

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
  // == num.add(Integer.parseInt(st.nextToken()));
    }
       System.out.println(Collections.min(num) +" " + Collections.max(num));  
    }
}


