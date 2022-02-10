
import java.util.*;
class Main{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in); 
        int N =s.nextInt();
        s.close(); //리소스 누수,,
        for(int i = 1 ; i <= N ; i++){
	        for(int j = N ; j > 0 ; j--){
                if(j > i) System.out.print(" ");
                else System.out.print("*");
            } 
          
            System.out.println();
        }
    }
}
