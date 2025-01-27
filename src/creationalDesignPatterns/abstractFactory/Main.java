package creationalDesignPatterns.abstractFactory;

import creationalDesignPatterns.abstractFactory.banking.BankingTeamFactory;

public class Main {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();

        developer.writeCode();
        tester.testCode();
    }


}

