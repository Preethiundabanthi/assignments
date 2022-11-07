public class SimpleInterest {
    public static void main(String[] args) {
        FuncInter Result = (var p, var t, var r) -> {
            System.out.println((p * r * t) / 100);
            return (p * t * r) / 100;
        };

        Result.interest(8234,45,7);

    }

    interface FuncInter {
        int interest(int a, int b, int c);
    }
}