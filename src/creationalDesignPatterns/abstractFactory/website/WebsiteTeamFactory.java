package creationalDesignPatterns.abstractFactory.website;

import creationalDesignPatterns.abstractFactory.Developer;
import creationalDesignPatterns.abstractFactory.ProjectTeamFactory;
import creationalDesignPatterns.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new WebsiteDeveloper();
    }

    @Override
    public Tester getTester() {
        return new WebsiteTester();
    }
}
