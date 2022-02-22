/*
9개 압력 받아서 그 중 최대값과 그의 위치 출력

예제 입력 1 
3
29
38
12
57
74
40
85
61

**/

// Way1 ( Scanner +  ArrayList)  17628	204
// Scanner 입력받아 ArrayList에 담아 최대값은 Collections 의 메소드로 출력
// 위치 출력을 위해 ArrayList.indexOf(최대값+1); 로 구한다.
import java.util.*;
class Main{ 
    public static void main(String[] args) {    
        Scanner s = new Scanner(System.in);    
        ArrayList<Integer> num = new ArrayList<>();     
        int c=0;   
        while(c<9){ 
            num.add(s.nextInt());          c++;   
        }        
        System.out.println(Collections.max(num));                // 최대값
        System.out.println(num.indexOf(Collections.max(num))+1); // 최대값의 위치
    }    
}

// Way1-1 ( Scanner +  수학연산 ) 17688	228
import java.util.*;
class Main{ 
    public static void main(String[] args) {    
        Scanner s = new Scanner(System.in);     
         int max = 0, index =0;   
         for(int i= 0;i< 9; i++){
            int val = s.nextInt();
            if(val>max) {
                max = val;
                index = i+1; // 최대값의 위치
            }            
        }    
        System.out.println(max);
		System.out.println(index);    
    }    
}

//Way2-1 ( BufferedReader + 수학연산 ) 14108	120

import java.io.*;
class Main{ 
    public static void main(String[] args) throws IOException{    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, index =0;
        
        for(int i= 0;i< 9; i++){
            int val = Integer.parseInt(br.readLine());
            if(val>max) {
                max = val;
                index = i+1; // 최대값의 위치
            }            
        } 
        System.out.println(max);
		System.out.println(index);       
    }    
}
