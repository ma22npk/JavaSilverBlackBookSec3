package javaSilver_BlackBook_section3.Q3;

public class Q3Main {

    public static void main(String[] args) {
        // 明示的なキャスト
        int a = 100;
        // short型に変換
        short b = (short) a;

        // byte 型は -128 ~ 127までの値を扱うデータ型なので、範囲を超えるとエラーとなる。
        // byte の範囲内のint型のリテラルのためcompile可能
        byte c = 127;
        // byte の範囲に収まらないint型のリテラルのためコンパイルエラー
        byte d = 128;
        // 10進数にすると256になるため、コンパイルエラー
        byte e = 0b10000000;

        int f = 2 * 3L;
        float g = 10.0;

        System.out.println(g);
    }

}
