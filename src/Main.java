//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public void foo() {
        System.out.println("foo() 메소드가 호출되었습니다.");
    }

    public static void main(String[] args) {

        // 1. Main 클래스의 객체(인스턴스)를 생성합니다.
        Main myMain = new Main();

        // 2. 생성된 객체를 통해 foo() 메소드를 호출합니다.
        myMain.foo();
        System.out.println("myMain 객체 정보: " + myMain);

        // 정수 나눗셈과 실수 나눗셈의 차이
        System.out.println(1/2);
        System.out.println((double)1/2);
        System.out.println((double)(1/2));

        System.out.println(0XFFFF); // Hex => Deci
        System.out.println(1.0 /3.0); // double
        System.out.println(1.0F /3.0F); // Hex => Deci
        long CreditCardNumber = 2324_4545_4519_3415L;
        System.out.println("Credit Card Number: " + CreditCardNumber);
        System.out.println(1 -0.1 - 0.1 - 0.1-0.1-0.1);
        double x=1.0;
        final double EPSILON = 1E-10;
//        while(true) {
//            //c에서는 1이 true를 뜻하지만 자바는 불리언으로 취급 X
//            if (x==0.5)
//                break;
//            else
//                System.out.println("x: " + x);
//            x = x-0.1; // => 무한루프에 빠짐, 왜냐 0.50000000001이 되기떄문에 0.5가될수없다
//                        // 절대 실수를 루프문의 조건으로 사용하지 말라
//        }
        while(true) {
            //c에서는 1이 true를 뜻하지만 자바는 불리언으로 취급 X
            if (Math.abs(x-0.5)<EPSILON)
                break;
            else
                System.out.println("x: " + x);
            x = x-0.1; // => 무한루프에 빠짐, 왜냐 0.50000000001이 되기떄문에 0.5가될수없다
            // 절대 실수를 루프문의 조건으로 사용하지 말라
        }
        int number=11;
//      boolean even;
//        if ((number % 2) == 0) {
//            even = true;
//        }
//        else
//            even = false;
//        System.out.println("even: " + even);
//      => 위의 주석을 밑의 2줄로 간편하게 표현 가능
        boolean even = number % 2 == 0;
        System.out.println("even: " + even);

        char letter = 'A';
        char letter2= '\u0041';
        char ch ='a';
        System.out.println(ch+1);
        System.out.println(ch++);
        System.out.println(++ch);
        // ch++ =>  operator ++(ch) "값을 먼저 사용하고, 나중에 1 증가시킨다"고 생각하시면 쉽습니다.
        // 1.현재 ch의 값을 먼저 반환 (또는 사용)합니다.2.그 후에 ch의 값을 1 증가시켜 저장합니다.작성하신 코드의 이 부분을 보면 명확히 알 수 있습니다.
        // 2 + 'a' 에서 'a'는 자바에서는 number로 취급 아스키코드 개념이랑 비슷하듯
        int k = '2' + '3'; // 아스키코드에서 50,51이다
        System.out.println("k: " + k);
        System.out.println("k: " + (char)k);
        // 결론은 char을 숫자로써 취급한다는 의미인거 같네요
        String welcome = "Welcome to java";
        String welcome2 = "Welcome to java";
        if (welcome2 == welcome)
            System.out.println("same");
        else System.out.println("different");
        String welcome3 = new String("Welcome to java");
        if (welcome2 == welcome3)
            System.out.println("same");
        else System.out.println("different");
//        왜 different인가
//        char *str = "Welcome";
//        1: is a constant string
//        2: or a variable string(we can modify)
//        char str[10] = "welcome"은 array이며 컴파일러가 스택에 저장한다. 이는 읽고 쓰기가 가능하다.
//        welcome3는 constant string으로 stack segment(rw) - heap - data segment(rw) - read-only data segment - text seg(r)
//        new 명령어는 heap에다가 새로운 메모리를 만드므로 주소가 달라져 welcome2와 welcome3는 다르다.
        String s = welcome + "123";
        System.out.println(s);
        System.out.println(welcome3.equals(welcome2)); // 0이면 같다라는 뜻
        System.out.println(welcome3.compareTo(welcome2));


    }
}





























