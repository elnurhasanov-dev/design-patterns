package creationalDesignPatterns.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();
}
