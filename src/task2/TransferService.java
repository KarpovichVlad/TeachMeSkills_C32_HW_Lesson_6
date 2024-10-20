package task2;

public class TransferService {
public void deposit(double amount, CreditCard card) {
    if (amount <= 0) {
        System.out.println("The amount must be greater than zero.");
    } else {
        card.balance += amount;
        System.out.println("Deposited " + amount + " to account " + card.accountNumber);

    }
}
    public void  withdraw(double amount, CreditCard card) {
    if (amount<= 0){
        System.out.println("The amount must be greater than zero.");
    } else if (amount> card.balance) {
        System.out.println("Insufficient funds on account " + card.accountNumber);
    } else{
    card.balance-= amount;
        System.out.println("Withdrew " + amount + " from account " + card.accountNumber);
    }

    }
}





