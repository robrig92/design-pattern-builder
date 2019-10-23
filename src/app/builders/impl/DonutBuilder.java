package app.builders.impl;

import app.builders.Builder;
import app.models.Donut;

/**
 * DonutBuilder
 */
public class DonutBuilder implements Builder {

    private Donut donut;

    public DonutBuilder() {
        reset();
    }

    @Override
    public void reset() {
        donut = new Donut();
    }

    @Override
    public void addChocolate(boolean add) {
        donut.addChocolate(add);
    }

    @Override
    public void addHoney(boolean add) {
        donut.addHoney(add);
    }

    @Override
    public void addKorn(boolean add) {
        donut.addKorn(add);
    }

    @Override
    public void addSugar(boolean add) {
        donut.addSugar(add);
    }

    public Donut getResult() {
        Donut resultDonut = donut;
        reset();
        return resultDonut;
    }
}