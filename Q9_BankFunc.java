class Q9_BankFunc {
    private String name;
    private int customerId;

    public Q9_BankFunc(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public static void main(String[] args) {
        Q9_BankFunc customer = new Q9_BankFunc("Hafiz", 12345);
        Account sbp = new SBP(customer, 1000);
        Account mcb = new MCB(customer, 1000);
        Account bop = new BOP(customer, 1000);

        sbp.deposit(100);
        mcb.deposit(100);
        bop.deposit(100);

        System.out.println("SBP balance: " + sbp.getBalance());
        System.out.println("MCB balance: " + mcb.getBalance());
        System.out.println("BOP balance: " + bop.getBalance());
    }
}

abstract class Account {
    protected Q9_BankFunc customer;
    protected double balance;

    public Account(Q9_BankFunc customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public Q9_BankFunc getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SBP extends Account {
    public SBP(Q9_BankFunc customer, double balance) {
        super(customer, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class MCB extends Account {
    public MCB(Q9_BankFunc customer, double balance) {
        super(customer, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * 0.05);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class BOP extends Account {
    public BOP(Q9_BankFunc customer, double balance) {
        super(customer, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * 0.1);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

}
