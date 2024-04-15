public class CreditCard {
    private int creditCardNumber;
    private float creditCardBalance;

    CreditCard(int creditCardNumber, float creditCardBalance) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardBalance = creditCardBalance;
    }

    public int incSumCreditCard(float addSum) {
        creditCardBalance = creditCardBalance + addSum;
        return 1;
    }

    public int decSumCreditCard(float decSum) {
        if (creditCardBalance - decSum > 0) {
            creditCardBalance = creditCardBalance - decSum;
            return 1;
        } else {
            return -1;
        }
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public double getCreditCardBalance() {
        return creditCardBalance;
    }

    public void setCreditCardBalance(float creditCardBalance) {
        this.creditCardBalance = creditCardBalance;
    }

    @Override
    public String toString() {
        return "Кредитная карточка {" +
                "Номер счета = " + creditCardNumber +
                ", Текущая сумма на счету = " + creditCardBalance +
                '}';
    }
}
