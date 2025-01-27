package creationalDesignPatterns.abstractFactory.banking;

import creationalDesignPatterns.abstractFactory.Developer;
import creationalDesignPatterns.abstractFactory.ProjectTeamFactory;
import creationalDesignPatterns.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new BankingDeveloper();
    }

    @Override
    public Tester getTester() {
        return new Bankingester();
    }
}
