package structuralDesignPatterns.bridge.example1.reportFormat;

public class WebFormat implements IReportFormat {
    @Override
    public void generate() {
        System.out.println("Web format report");
    }
}
