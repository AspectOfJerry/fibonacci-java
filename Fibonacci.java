public class Fibonacci {
    public static void main(String[] args) throws Exception {
        F(0, 1);
    }

    static void F(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(result);

        if (result < 1000000) {
            F(n2, result);
        }
    }

    static int FFind(int target) {
        if (target == 0 || target == 1) {
            return target;

        }

        return FFind(target - 1) + FFind(target - 2);
    }
}
