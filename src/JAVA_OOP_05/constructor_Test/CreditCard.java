package JAVA_OOP_05.constructor_Test;

public class CreditCard {
    // Card usage
    // Card payment
    // Point accumulation

    private long cardNumber;
    public String cardOwner;

    public long totalCardUsageAmount;
    public long accumulatedPoints;

    public void useCard(long usageAmount){
        totalCardUsageAmount += usageAmount;
    }
    public void payCardBill(long paymentAmount){
        totalCardUsageAmount -= paymentAmount;
        givePoints(paymentAmount / 1000);
    }
    private void givePoints(long pointAmount){
        accumulatedPoints += pointAmount;
    }


    //setter
    public void setCardNumber(long cardNumber){
        this.cardNumber = cardNumber;
    }
    public long getCardNumber(){
        return cardNumber;
    }

}
