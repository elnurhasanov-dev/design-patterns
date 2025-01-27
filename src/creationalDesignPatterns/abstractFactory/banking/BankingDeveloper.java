package creationalDesignPatterns.abstractFactory.banking;

import creationalDesignPatterns.abstractFactory.Developer;

public class BankingDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Banking developer write java code !");
    }
}
