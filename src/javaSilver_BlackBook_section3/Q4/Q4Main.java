package javaSilver_BlackBook_section3.Q4;

public class Q4Main {

    public static void main(String[] args) {
        int a = 10;
        int b = a++ + a + a-- - a-- + ++a;
        //11 ,21, 30, 21 32
        System.out.println(b); //32正解

    }

}
