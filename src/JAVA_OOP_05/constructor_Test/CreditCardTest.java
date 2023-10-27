package JAVA_OOP_05.constructor_Test;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard();
        myCard.setCardNumber(1234_5678_1234_1234L);
        myCard.cardOwner = "홍길동";

        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.cardOwner);

        myCard.setCardNumber(1111_2222_3333_4444L);
        myCard.cardOwner = "Hong Gil-dong";
        System.out.println("==========================================");

        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.totalCardUsageAmount);
        System.out.println(myCard.accumulatedPoints);

        myCard.useCard(8000);
        myCard.useCard(12000);
        myCard.useCard(21000);
        myCard.payCardBill(30000);
        System.out.println("==========================================");
        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.totalCardUsageAmount);
        System.out.println(myCard.accumulatedPoints);

    }
}

