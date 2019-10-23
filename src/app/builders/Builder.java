package app.builders;

/**
 * Builder
 */
public interface Builder {

    public abstract void reset();
    public abstract void addChocolate(boolean add);
    public abstract void addHoney(boolean add);
    public abstract void addKorn(boolean add);
    public abstract void addSugar(boolean add);
}