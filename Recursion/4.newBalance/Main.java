public class Main {
    public static void main(String[] args) {
        System.out.println(getBalance(5, 0.1, 1000.0));
    }

    public static double getBalance(int n, double p, double bal) {
        if (n > 0) {
            double newBalance = bal + (p * bal);
            return getBalance(n - 1, p, newBalance);
        } else {
            return bal;
        }
    }
}
