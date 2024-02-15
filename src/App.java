import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        double a = 234.345;
        double b = 45.698;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.printf("%.6f", a);
        System.out.print(" - ");
        System.out.printf("%.6f\n", b);

        System.out.printf("%.0f", a);
        System.out.print(" - ");
        System.out.printf("%.0f\n", b);

        System.out.printf("%.1f", a);
        System.out.print(" - ");
        System.out.printf("%.1f\n", b);

        System.out.print(df.format(a));
        System.out.print(" - ");
        System.out.println(df.format(b));

        System.out.printf("%.3f", a);
        System.out.print(" - ");
        System.out.printf("%.3f\n", b);

        System.out.printf("%5.6e", a);
        System.out.print(" - ");
        System.out.printf("%5.6e\n", b);

        System.out.printf("%5.6E", a);
        System.out.print(" - ");
        System.out.printf("%5.6E\n", b);

        System.out.printf("%.3f", a);
        System.out.print(" - ");
        System.out.printf("%.3f\n", b);

        System.out.printf("%.3f", a);
        System.out.print(" - ");
        System.out.printf("%.3f\n", b);
        
    }
}
