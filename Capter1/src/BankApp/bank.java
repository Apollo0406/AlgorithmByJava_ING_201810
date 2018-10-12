package BankApp;

class BankAccount {
    private double balance;

    public BankAccount(double openingBalance){
        balance = openingBalance;
    }

    public void display() {
        System.out.println("balance="+balance);
    }

    public void deposit(double v) {
        balance = balance + v;
    }

    public void withdrow(double v) {
        balance = balance - v;
    }
}

class bank{
    public static void main(String[] args){
        BankAccount bank1 = new BankAccount(100.00);
        System.out.println("Before transactions:");
        bank1.display();
        bank1.deposit(74.35);
        bank1.withdrow(20.00);
        System.out.println("After transactions:");
        bank1.display();
    }
}

