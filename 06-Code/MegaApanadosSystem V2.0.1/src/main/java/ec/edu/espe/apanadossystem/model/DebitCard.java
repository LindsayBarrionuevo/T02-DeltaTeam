/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.apanadossystem.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class DebitCard {
    private String CardOwner;
    private String numberCard;
    private int cvcCard;
    private String dateVecCard;

    public DebitCard(String CardOwner, String numberCard, int cvcCard, String dateVecCard) {
        this.CardOwner = CardOwner;
        this.numberCard = numberCard;
        this.cvcCard = cvcCard;
        this.dateVecCard = dateVecCard;
    }

    /**
     * @return the CardOwner
     */
    public String getCardOwner() {
        return CardOwner;
    }

    /**
     * @param CardOwner the CardOwner to set
     */
    public void setCardOwner(String CardOwner) {
        this.CardOwner = CardOwner;
    }

    /**
     * @return the numberCard
     */
    public String getNumberCard() {
        return numberCard;
    }

    /**
     * @param numberCard the numberCard to set
     */
    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    /**
     * @return the cvcCard
     */
    public int getCvcCard() {
        return cvcCard;
    }

    /**
     * @param cvcCard the cvcCard to set
     */
    public void setCvcCard(int cvcCard) {
        this.cvcCard = cvcCard;
    }

    /**
     * @return the dateVecCard
     */
    public String getDateVecCard() {
        return dateVecCard;
    }

    /**
     * @param dateVecCard the dateVecCard to set
     */
    public void setDateVecCard(String dateVecCard) {
        this.dateVecCard = dateVecCard;
    }
    
}
