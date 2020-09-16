import java.util.Scanner;//2.15
public class andre {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое значение: ");
            int a = in.nextInt();
            System.out.print("Введите второе значение: ");
            int b = in.nextInt();
            in.close();
            System.out.println("__________________");
            System.out.println("Сумма = " + (a + b));
            System.out.println("Умножение = " + a * b);
            System.out.println("Разница = " + (a - b));
            if (b == 0) {
                System.out.println("Второе значение равно 0");
            } else {
                System.out.println("Деление = " + a / b);
            }
        }
    }

