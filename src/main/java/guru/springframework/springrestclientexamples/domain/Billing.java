package guru.springframework.springrestclientexamples.domain;

public class Billing {

    private Card card;

    /**
     * 
     */
    public Billing() {
    }

    /**
     * @param card
     */
    public Billing(Card card) {
        this.card = card;
    }

    /**
     * @return Card return the card
     */
    public Card getCard() {
        return card;
    }

    /**
     * @param card the card to set
     */
    public void setCard(Card card) {
        this.card = card;
    }

}
