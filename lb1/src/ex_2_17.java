import java.util.Arrays;
import java.util.Scanner;

    public class ex_2_17 {
        public static void main(String[] args) {


            Scanner in = new Scanner(System.in);
            int[] arr = new int[3];
            System.out.print("Введите первое значение: ");
            arr[0] = in.nextInt();
            System.out.print("Введите второе значение: ");
            arr[1] = in.nextInt();
            System.out.print("Введите третье значение: ");
            arr[2] = in.nextInt();
            in.close();
            System.out.println("Сумма = " + Arrays.stream(arr).sum());
            System.out.println("AVG = " + (arr[0] + arr[1] + arr[2]) / Arrays.stream(arr).count());
            System.out.println("Минимальное значение = " + Arrays.stream(arr).min().getAsInt());
            System.out.println("Максимальное значение = " + Arrays.stream(arr).max().getAsInt());
            System.out.println("Множество значений = " + arr[0] * arr[1] * arr[2]);


        }
    }

