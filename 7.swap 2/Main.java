class Main {

    public static void main(String[] args) {
        double num1 = 5.5;
        double num2 = 10.2;

        num1 = num1 + num2; // num1 = 15.7
        num2 = num1 - num2; // num2 = 15.7 - 10.2 = 5.5
        num1 = num1 - num2; // num1 = 15.7 - 5.5 = 10.2

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
