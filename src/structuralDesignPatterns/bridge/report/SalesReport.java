package structuralDesignPatterns.bridge.report;

import structuralDesignPatterns.bridge.reportFormat.IReportFormat;

public class SalesReport extends Report{
    public SalesReport(IReportFormat iReportFormat) {
        super(iReportFormat);
    }

    @Override
    public void display() {
        super.display();
    }
}
