package guru.springframework.springrestclientexamples.domain;

import java.time.ZonedDateTime;

public class Card {

    private CardType type;
    private String number;
    private ZonedDateTime expirationDate;
    private String iban;
    private String swift;

    /**
     * 
     */
    public Card() {
    }

    /**
     * @param type
     * @param number
     * @param expirationDate
     * @param iban
     * @param swift
     */
    public Card(CardType type, String number, ZonedDateTime expirationDate, String iban, String swift) {
        this.type = type;
        this.number = number;
        this.expirationDate = expirationDate;
        this.iban = iban;
        this.swift = swift;
    }
    
    /**
     * @return CardType return the type
     */
    public CardType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(CardType type) {
        this.type = type;
    }

    /**
     * @return String return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return ZonedDateTime return the expirationDate
     */
    public ZonedDateTime getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(ZonedDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @return String return the iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * @param iban the iban to set
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * @return String return the swift
     */
    public String getSwift() {
        return swift;
    }

    /**
     * @param swift the swift to set
     */
    public void setSwift(String swift) {
        this.swift = swift;
    }

}
