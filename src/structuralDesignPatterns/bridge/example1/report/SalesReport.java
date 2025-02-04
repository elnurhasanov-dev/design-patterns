package structuralDesignPatterns.bridge.example1.report;

import structuralDesignPatterns.bridge.example1.reportFormat.IReportFormat;

public class SalesReport extends Report{
    public SalesReport(IReportFormat iReportFormat) {
        super(iReportFormat);
    }

    @Override
    public void display() {
        super.display();
    }
}
