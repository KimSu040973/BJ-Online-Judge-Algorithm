/**
*
* 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
* 참고로 특정 순서에 따라 개행( '\n') 하거나 문자열과 숫자 등 서로 다른 타입을 다룰 때는 printf(); 또는 print(); 를 쓴다.
*/
// WAY1  메모리 16744kb   시간	 172ms
public class Main{
    public static void main(String[] argc){
        System.out.println("강한친구 대한육군"+System.getProperty("line.separator")+"강한친구 대한육군");
    }
}


// WAY2  메모리 14220kb   시간	1362ms
public class Main{
    public static void main(String[] argc){
        System.out.println("강한친구 대한육군"+System.lineSeparator()+"강한친구 대한육군");
    }
}


// WAY3  메모리 13844kb   시간	 108ms
public class Main{
    public static void main(String[] argc){
        System.out.println("강한친구 대한육군");
        System.out.println("강한친구 대한육군");
    }
}



