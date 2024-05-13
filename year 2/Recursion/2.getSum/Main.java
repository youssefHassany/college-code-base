public class Main {
    public static void main(String[] args) {
        System.out.println(getSum(100, 0)); // 5050
        System.out.println(getSum(15, 10)); //
    }

    public static int getSum(int x, int y) {
        if (x > y) {
            return x + getSum(x - 1, y);
        } else {
            return y;
        }
    }
}
