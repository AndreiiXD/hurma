import java.util.Scanner;//2.15
public class andre {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter 1st val: ");
            int a = in.nextInt();
            System.out.print("Enter 2nd val: ");
            int b = in.nextInt();
            in.close();
            System.out.println("__________________");
            System.out.println("Sum = " + (a + b));
            System.out.println("Product = " + a * b);
            System.out.println("Difference = " + (a - b));
            if (b == 0) {
                System.out.println("2nd value is null or 0");
            } else {
                System.out.println("Division = " + a / b);
            }
        }
    }

