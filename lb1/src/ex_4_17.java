
    import java.util.Scanner;
    public class ex_4_17 {
        public static void main(String[] args) {
            System.out.println(Trips());
        }

        public static String Trips() {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите километры >");
            int km = in.nextInt();
            System.out.print("Введите литры >");
            int liters = in.nextInt();
            int countOfTrips = 0;
            double result = 0;
            if (km != 0 || liters != 0) {
                result += (double) km / (double) liters;
                countOfTrips++;
            }
            if (km <= 0 || liters <= 0) {
                System.out.println("Неправильный километр или литры!!!");
                return "Км на литр: " + result + "\nКоличество поездок: " + countOfTrips + "\n_____________________";
            }
            while (km != 0 || liters != 0) {
                System.out.print("Введите километры >");
                km = in.nextInt();
                System.out.print("Введите литры >");
                liters = in.nextInt();
                if (km <= 0 || liters <= 0) {
                    break;
                }
                result += (double) km / (double) liters;
                countOfTrips++;
            }
            in.close();
            return "Км на литр: " + result + "\nКоличество поездок: " + countOfTrips + "\n_____________________";
        }
    }


