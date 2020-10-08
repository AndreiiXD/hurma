import java.sql.Struct;
import java.util.*;

    public class ex_7_12 {
        public static void main(String[] args) {
            int[] arr = new int[5];

            Scanner in = new Scanner(System.in);
            System.out.println("Введите 5 чисел:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Введите " + (i + 1) + " число>");
                arr[i] = in.nextInt();
            }
            in.close();

            for (int i = 0, count = 0; i < arr.length; i++) {
                boolean flag = false;
                for (int j = 0; j < arr.length; j++) {
                    if (i == j && i != 4 && j != 4) {
                        continue;
                    } else if (arr[i] == arr[j] && i != 4 && j != 4) {
                        break;
                    } else if (j == arr.length - 1 && arr[i] != arr[j]) {
                        flag = true;
                    }
                }
                if (flag) {
                    System.out.println(arr[i] + " ");
                }
            }


        }

    }

