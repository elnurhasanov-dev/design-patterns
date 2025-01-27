package structuralDesignPatterns.bridge.reportFormat;

public class DesktopFormat implements IReportFormat{
    @Override
    public void generate() {
        System.out.println("Web report format");
    }
}
