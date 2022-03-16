/*
입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 
점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
**/
//32704 408
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        
        int[] score;
        int TestCase = s.nextInt();
        for(int i =0; i < TestCase; i++){
            score = new int[s.nextInt()];
            
            for(int j=0 ; j<score.length ; j++){
                score[j] = s.nextInt();// 성적 입력
            }
            double avg = Arrays.stream(arr).average().orElse(0);
            double c = 0.0;// 평균 넘는 학생 수 변수 
            // 평균 넘는 학생 비율 찾기 
            for(int j=0 ; j<score.length ; j++){
                if(avg < score[j]) c++;
            }
           System.out.printf("%.3f%%\n",(c/N)*100); //학생 비율
        }
       s.close();
    }
}
//15700	188
import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader s= new BufferedReader(new InputStreamReader(System.in));
    	int TestCase = Integer.parseInt(s.readLine());
    	int[] score ;
    	for(int i =0; i < TestCase; i++){
    		StringTokenizer st = new StringTokenizer(s.readLine()," ");
    		score = new int[Integer.parseInt(st.nextToken())];
    		for(int j=0 ; j<score.length ; j++){
    			score[j] = Integer.parseInt(st.nextToken());
    			}
    		double avg = Arrays.stream(score).average().orElse(0.0);
    		double c = 0.0;
    		
    		for(int j=0 ; j<score.length ; j++){
    			if(avg < score[j]) c++;
    			}
    		System.out.printf("%.3f%%\n",(c/score.length)*100); 
    		}
    	s.close();   
    }
}
/*
average()는 OptionalDouble 타입을 리턴 하기 때문에 필수적으로 
OptionalDouble의 orElse() 메소드를 이용하여, 
average()가 리턴한 값이 없을 경우, null 대신 0을 리턴할 수 있도록 초기화 필수!
*/

