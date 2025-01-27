package creationalDesignPatterns.abstractFactory.website;

import creationalDesignPatterns.abstractFactory.Developer;

public class WebsiteDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Website developer write python code");
    }
}
