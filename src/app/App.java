package app;

import app.builders.impl.CookieBuilder;
import app.builders.impl.DonutBuilder;
import app.models.Cookie;
import app.models.Donut;

public class App {
    public static void main(String[] args) throws Exception {
        DonutBuilder donutBuilder = new DonutBuilder();

        donutBuilder.addChocolate(true);
        donutBuilder.addHoney(true);

        Donut donut = donutBuilder.getResult();

        System.out.println(donut);

        CookieBuilder cookieBuilder = new CookieBuilder();

        cookieBuilder.addSugar(true);
        cookieBuilder.addKorn(true);

        Cookie cookie = cookieBuilder.getResult();

        System.out.println(cookie);
    }
}