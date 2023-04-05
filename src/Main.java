public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int sum1 = a+b;
        int sum2 = c+d;

        String result1 = sum1<sum2 ? "true" : "false";
        System.out.println(result1);

        sum1++;
        System.out.println(sum1);

        sum2--;
        sum2--;
        System.out.println(sum2);

        String result2 = sum1<sum2 ? "true" : "false";
        System.out.println(result2);

        String result3 = sum1%2 == 0 || sum2%2 == 0 ? "true" : "false";
        System.out.println(result3);

    }
}
