import java.util.Set;

    public class ex_3_12 {
        public static void main(String[] args) {

            Invoice Firstproduct = new Invoice("7", "Plita", 20, 110000);
            System.out.println(Firstproduct.getDescription() + " " + Firstproduct.getPartNumber() + " " + Firstproduct.getPrice() + " " + Firstproduct.getQuantity());
            Invoice Secondproduct = new Invoice("3", "Holodilnik", 4, 12800);
            System.out.println(Secondproduct.getDescription() + " " + Secondproduct.getPartNumber() + " " + Secondproduct.getPrice() + " " + Secondproduct.getQuantity());

            Firstproduct.setDescription("PC");
            Firstproduct.setQuantity(7);
            Firstproduct.setPartNumber("3");
            Firstproduct.setPrice(110000);
            System.out.println(Firstproduct.getDescription() + " " + Firstproduct.getPartNumber() + " " + Firstproduct.getPrice() + " " + Firstproduct.getQuantity());
            double x= Firstproduct.getInvoiceAmount();
            System.out.println("Test "+x);


        }
    }


    class Invoice {


        private String partNumber;
        private String description;
        private int quantity;
        private double price;

        public Invoice(String partNumber, String description, int quantity, double price) {
            this.partNumber = partNumber;
            this.description = description;

            if (price > 0.0) {
                this.price = price;
            }
            if (quantity > 0.0) {
                this.quantity = quantity;
            }
        }


        public String getPartNumber() {
            return partNumber;
        }

        public void setPartNumber(String partNumber) {
            this.partNumber = partNumber;
        }


        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }


        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }


        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getInvoiceAmount() {


            if (quantity < 0) {
                quantity = 0;

            }
            if (price < 0) {
                price = 0.0;

            }
            return price * quantity;

        }


    }

