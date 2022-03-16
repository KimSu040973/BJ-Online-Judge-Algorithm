/*
문제
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

출력
각 테스트 케이스마다 점수를 출력한다.

**/
//	17804	228
import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<test_case;i++){
            int c=0,sum=0;
            for(byte value : sc.next().getBytes()){
                if(value=='O'){
                    c++;
                    sum+=c;
                }
                else {c=0;}
            }
            sb.append(sum).append('\n');//이거 대신 바로 출력하면 시간 조금 단축
        }
        sc.close();
        System.out.println(sb);   
    }                                     
}
//	14272	124
import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<test_case;i++){
            int c=0,sum=0;
            for(byte value : br.readLine().getBytes()){
                if(value=='O'){c++;sum+=c;}
                else {c=0;}
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);   
    }                                     
}
