class Account {
    private String name;
    private double balance;

    public void withdraw(double balance) {
        if (balance > this.balance) {
            System.out.println("Withdrawal amount exceeded account balance");
        } else {
            this.balance -= balance;
        }


    }


    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }


    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public double getBalance() {
        return balance;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}

public class ex_3_11 {
    public static void main(String[] args) {
        Account acc1 = new Account("Тимош Игорь:", 39.69);
        Account acc2 = new Account("Вергин Максим:", 86.21);


        System.out.println(acc1.getName() + acc1.getBalance());

        acc2.withdraw(25);
        System.out.println(acc2.getBalance());



    }
}