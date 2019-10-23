package app.builders.impl;

import app.builders.Builder;
import app.models.Cookie;

/**
 * CookieBuilder
 */
public class CookieBuilder implements Builder {

    private Cookie cookie;


    public CookieBuilder() {
        reset();
    }

    @Override
    public void reset() {
        cookie = new Cookie();
    }

    @Override
    public void addChocolate(boolean add) {
        cookie.addChocolate(add);
    }

    @Override
    public void addHoney(boolean add) {
        cookie.addHoney(add);
    }

    @Override
    public void addKorn(boolean add) {
        cookie.addKorn(true);
    }

    @Override
    public void addSugar(boolean add) {
        cookie.addSugar(true);
    }

    public Cookie getResult() {
        Cookie resultCookie = cookie;
        reset();
        return resultCookie;
    }
}