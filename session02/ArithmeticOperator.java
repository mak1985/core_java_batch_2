package session02;

public class ArithmeticOperator {
    public static void main(String[] args) {
        /**
         *  1. Arithmetic operator - (+, -, *, /, %, ++ and --)
         */
        int a = 10;
        int b = 5;

        System.out.println(a+b); //15
        System.out.println(a-b);//5
        System.out.println(a*b); //50
        System.out.println(a/b);//2
        System.out.println(a%b);//0

        // ++ increment operator - (pre increment + post increment)
        System.out.println(a++); // 10-------->increase by 1 = 11

        System.out.println(a++); //11
        System.out.println(a); //12

        // -- decrement operator
        System.out.println(b--); //post decrement expected value = 5
        System.out.println(b); //expected value = 4

        System.out.println(--b);//expected value =3
        System.out.println(b); //expected value =


    }
}
