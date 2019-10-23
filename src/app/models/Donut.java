package app.models;

/**
 * Donut
 */
public class Donut {

    private boolean chocolate;
    private boolean honey;
    private boolean korn;
    private boolean sugar;

    public void Donuts() {}

    public boolean hasChocolate() {
        return chocolate;
    }

    public void addChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }

    public boolean hasHoney() {
        return honey;
    }

    public void addHoney(boolean honey) {
        this.honey = honey;
    }

    public boolean hasKorn() {
        return korn;
    }

    public void addKorn(boolean korn) {
    this.korn = korn;
    }

    public boolean hasSugar() {
        return sugar;
    }

    public void addSugar(boolean sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "{" +
            " chocolate='" + chocolate + "'" +
            ", honey='" + honey + "'" +
            ", korn='" + korn + "'" +
            ", sugar='" + sugar + "'" +
            "}";
    }
}