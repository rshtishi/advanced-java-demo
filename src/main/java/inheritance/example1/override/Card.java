package inheritance.example1.override;

public class Card {

    private String image;
    private CardType type;

    public Card(String image, CardType type) {
        if (image == null || type == null) {
            throw new IllegalArgumentException();
        }
        this.image = image;
        this.type = type;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public CardType getType() {
        return type;
    }

    public String getImage() {
        return image;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return image.equals(card.getImage()) &&
                type == card.getType();
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}
