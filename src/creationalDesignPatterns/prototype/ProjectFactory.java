package creationalDesignPatterns.prototype;

public class ProjectFactory {
    private final Projects projects;

    public ProjectFactory(Projects projects) {
        this.projects = projects;
    }

    public Projects cloneProject(){
        return (Projects) projects.copy();
    }
}
