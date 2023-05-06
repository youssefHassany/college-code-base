class Main {

    // bravo Menna !!!!!

    public static void main(String[] args) {
        double num1 = 5.5;
        double num2 = 10.2;

        double container = num1; // 5
        num1 = num2; // 5 -> 10
        num2 = container; // 10 -> 5

        myPrint(num1, num2);
    }

    public static void myPrint(int num1, int num2) {
        System.out.println("Num 1 = " + num1 + " and num2 = " + num2);
    }

    // overloaded function
    public static void myPrint(double num1, double num2) {
        System.out.println("Num 1 = " + num1 + " and num2 = " + num2);
    }

}
