
    import java.util.Scanner;

    public class ex_2_16 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое значение: ");
            int a = in.nextInt();
            System.out.print("Введите второе значение: ");
            int b = in.nextInt();
            in.close();
            if (a > b) {
                System.out.println("Первое значение больше");
            } else if (a < b) {
                System.out.println("Второе значение больше");
            } else {
                System.out.println("Они равны");
            }
        }
    }

