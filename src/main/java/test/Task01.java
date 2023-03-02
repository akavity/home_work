package test;

public class Task01 {
    public static void main(String[] args) {
        Task01 task01 = new Task01();
        int answer1 = task01.getSum(1, 2, 3);
        int answer2 = task01.getSum(5, 2, 3);

        System.out.println(answer1);
        System.out.println(answer2);

        double answer3 = task01.getAverage(2, 3, 1);
        double answer4 = task01.getAverage(3, 3, 1);

        System.out.println(answer3);
        System.out.println(answer4);
    }

    public int getSum(int a, int b, int c) {
        int result;
        if (a > b && a > c) {
            result = a + c;
        } else {
            result = b;
        }
        return result;
    }

    public double getAverage(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }
}
