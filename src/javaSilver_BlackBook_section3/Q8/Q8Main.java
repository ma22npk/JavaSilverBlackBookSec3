package javaSilver_BlackBook_section3.Q8;

public class Q8Main {

    public static void main(String[] args) {

        // 1. Sampleのインスタンスを１つ生成
        Sample sample1 = new Sample(10);

        // 2. Sample型変数をもう一つ用意し、１つ目のインスタンスへの参照を代入
        Sample sample2 = sample1; // sample1,sample2は「同一」※同じインスタンスであること

        // 3. さらにSample1のインスタンスを生成し、そのインスタンスへの参照をsample1に代入
        sample1 = new Sample(10);// sample1とsample2は異なるインスタンスへの参照を持っているため「同一」ではなくなる

        System.out.println(sample1 == sample2); // 結果false

    }

}
