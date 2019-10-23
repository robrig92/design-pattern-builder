package app.models;

/**
 * Cookie
 */
public class Cookie {

    private boolean chocolate;
    private boolean honey;
    private boolean korn;
    private boolean sugar;

    public Cookie() {
    }

    public boolean hasChocolate() {
        return this.chocolate;
    }

    public void addChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }

    public boolean hasHoney() {
        return this.honey;
    }

    public void addHoney(boolean honey) {
        this.honey = honey;
    }

    public boolean hasKorn() {
        return this.korn;
    }

    public void addKorn(boolean korn) {
        this.korn = korn;
    }

    public boolean hasSugar() {
        return this.sugar;
    }

    public void addSugar(boolean sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "{" +
            " chocolate='" + hasChocolate() + "'" +
            ", honey='" + hasHoney() + "'" +
            ", korn='" + hasKorn() + "'" +
            ", sugar='" + hasSugar() + "'" +
            "}";
    }

}