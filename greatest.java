import java.io.IOException;
import java.util.*;

public class greatest {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int a, b, c, d, e;

        System.out.println("Enter three numbers");

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        d = Math.max(a, b);
        e = Math.max(c, d);

        System.out.println("Greatest number = " + e);
    }
}