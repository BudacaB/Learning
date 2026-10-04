public class Main {
    public static void main(String[] args) {
        int result = karatsuba(1234, 5678);
        System.out.println(result);
    }

    public static int karatsuba(int x, int y) {
        if (x <= 0 || y <= 0) {
            System.out.println("positive integers please, equal length");
            return -1;
        }

        if (x < 10 && y < 10) {
            return x * y;
        }

        int a;
        int b;
        int c;
        int d;

        String s1 = Integer.toString(x);
        int n = s1.length();
        int mid1 = n / 2;
        String[] parts1 = { s1.substring(0, mid1), s1.substring(mid1) };
        a = Integer.parseInt(parts1[0]);
        b = Integer.parseInt(parts1[1]);

        String s2 = Integer.toString(y);
        int mid2 = s2.length() / 2;
        String[] parts2 = { s2.substring(0, mid2), s2.substring(mid2) };
        c = Integer.parseInt(parts2[0]);
        d = Integer.parseInt(parts2[1]);

        return (int) Math.pow(10, n) * karatsuba(a, c) + (int) Math.pow(10, n/2) * (karatsuba(a, d) + karatsuba(b, c)) + karatsuba(b, d);

    }
}
