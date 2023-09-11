public class Factorizaion {
    public static StringBuilder factorize(int n, int i, StringBuilder builder) {
        if (n == 1) {
            return builder;
        }

        if (n % i == 0) {
            builder.append(i + " ");
            n /= i;
        } else {
            i++;
        }
        return factorize(n, i, builder);
    }

    public static void main(String[] args) {
        StringBuilder builder = factorize(10, 2, new StringBuilder());
        System.out.println(builder);

    }
}
