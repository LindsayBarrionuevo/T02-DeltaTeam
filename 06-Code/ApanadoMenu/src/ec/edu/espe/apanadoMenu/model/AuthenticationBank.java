package ec.edu.espe.apanadoMenu.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class AuthenticationBank {
    private int cardNumber;
    private int verificationNumber;
    private int expirationDate;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getVerificationNumber() {
        return verificationNumber;
    }

    public void setVerificationNumber(int verificationNumber) {
        this.verificationNumber = verificationNumber;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    
}
