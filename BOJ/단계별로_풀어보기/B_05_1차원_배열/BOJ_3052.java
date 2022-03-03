
/*
문제
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 

수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

출력
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

**/
//배열에 1 초기화
//배열 위치는 42로 나눈 나머지(0~42) 14180	120
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c=0;
        int[] arr = new int[42];
        for(int i=0 ; i<10 ; i++){
            arr[Integer.parseInt(br.readLine()) % 42]=1;
        }
        for(int i=0 ; i<42 ; i++){
            if(arr[i]==1) c++;
        }
        System.out.println(c);
    }
}

// ArrayList 사용
// 입력시 중복 제외하고 42로 나눈 나머지 값을 입력 
// Arraylist에 값 모두 카운트 14172	124


import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	        int c=0;
    	        ArrayList<Integer> arr = new ArrayList<>();
    	        for(int i=0 ; i<10 ; i++){
    	          int item=Integer.parseInt(br.readLine()) % 42;
    	        	if(!arr.contains(item))
    	        		arr.add(item); 
    	        }
         for(int i :arr ){
    	             c++;
    	        }
    	        System.out.println(c);
    }
}


