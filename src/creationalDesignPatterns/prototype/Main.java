package creationalDesignPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Projects projects = new Projects(4,"Elnur");
        ProjectFactory projectFactory = new ProjectFactory(projects);
        Projects projectsClone = projectFactory.cloneProject();

        System.out.println(projectsClone);
    }
}
