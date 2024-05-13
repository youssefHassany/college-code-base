class Main {

    public static void main(String[] args) {
        getThings(3, 10, 0);
    }

    public static void getThings(int num1, int num2, int num3) {

        // this is for maximum
        int max = 0;

        if (max < num1) {
            max = num1;
        }

        if (max < num2) {
            max = num2;
        }

        if (max < num3) {
            max = num3;
        }

        System.out.println("maximum = " + max);

        // this is for min
        int min = num1;

        if (min > num2) {
            min = num2;
        }

        if (min > num3) {
            min = num3;
        }

        System.out.println("minimum = " + min);

        // this is for middle
        int middle = 0;

        if (num1 != max && num1 != min) {
            middle = num1;
        }

        if (num2 != max && num2 != min) {
            middle = num2;
        }

        if (num3 != max && num3 != min) {
            middle = num3;
        }

        System.out.println("middle number = " + middle);

        double avg = (min + middle + max) / 3;

        System.out.println("Sort: " + min + ", " + middle + ", " + max);
        System.out.println("Average = " + avg);
        // task: fix avg
    }

}
