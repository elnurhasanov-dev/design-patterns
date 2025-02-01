package structuralDesignPatterns.facade;

class Lights {
    public void dim(int percentage) {
        System.out.println("İşıqlar " + percentage + "% zəiflədi");
    }

    public void brighten() {
        System.out.println("İşıqlar normallaşdı");
    }
}