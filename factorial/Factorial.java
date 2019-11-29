package factorial;

public class Factorial {

    public static void main(String[] args) {

        int multiplo;
        int factorial;

        multiplo = 8;

        int i;
        if (multiplo == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (i = multiplo; i >= 1; i--) {
                factorial = factorial * i;
            }
        }

        System.out.println(factorial);

    }

}
