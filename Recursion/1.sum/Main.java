public class Main {
    public static void main(String[] args) {
        System.out.println(sum(100)); // 5050
    }

    public static int sum(int num) {
        if (num > 0) {
            return num + sum(num - 1); // 100 + sum(99) ---> 99 + sum(98) --> 98 + sum(97) --> 1 + 2 + 3 + 4
        } else {
            return 0; // 0 + 1 + 2 + 3
        }
    }
}
