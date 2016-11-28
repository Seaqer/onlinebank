package core.entity.info;

import java.time.LocalDate;

public class CardInfo {
    private final String cardNumber;
    private final String cardOwner;
    private final LocalDate toDate;
    private final String accountNumber;
    private final int cvv;
    private final int pinCode;

    public CardInfo(String cardNumber, String cardOwner, LocalDate toDate, String accountNumber, int cvv, int pinCode) {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
        this.toDate = toDate;
        this.accountNumber = accountNumber;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
