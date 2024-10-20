package task2;

public class MainCard {

        public static void main(String[] args) {
            CreditCard card1 = new CreditCard("1464-7576-4363-5687", 1000);
            CreditCard card2 = new CreditCard("6464-9272-9238-8264", 500);
            CreditCard card3 = new CreditCard("7294-9264-9253-1936", 2000);

            TransferService service = new TransferService();

            service.deposit(150,card1);
            service.withdraw(349,card2);
            service.withdraw(1999,card3);

            System.out.println("Card 1 - Account Number: " + card1.accountNumber + ", Balance: " + card1.balance);
            System.out.println("Card 2 - Account Number: " + card2.accountNumber + ", Balance: " + card2.balance);
            System.out.println("Card 3 - Account Number: " + card3.accountNumber + ", Balance: " + card3.balance);
        }
    }


