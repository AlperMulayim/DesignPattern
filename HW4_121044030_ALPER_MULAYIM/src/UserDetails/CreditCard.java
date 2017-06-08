package UserDetails;

/**
 * Created by Alper on 25.12.2016.
 */
public class CreditCard implements Comparable {
    private String cardName;
    private String cardNumber;
    private String cardPasword;
    private double cardCap;
    private  double usedMoney;

    public CreditCard(String cardName, String cardNumber, double cardCap ) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardCap = cardCap;
        this.usedMoney = cardCap;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getCardCap() {
        return cardCap;
    }

    public void setCardCap(double cardCap) {
        this.cardCap = cardCap;
    }

    public double getUsedMoney() {
        return usedMoney;
    }

    public void setUsedMoney(double usedMoney) {
        this.usedMoney = usedMoney;
    }

    public String getCardPasword() {
        return cardPasword;
    }

    public void setCardPasword(String cardPasword) {
        this.cardPasword = cardPasword;
    }

    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("\nCard Name   : " + getCardName());
        strB.append("\nCard Number :" + getCardNumber());
        strB.append("\nBalance    :" + String.format("%.2f%n", getUsedMoney()));
        return  strB.toString();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
