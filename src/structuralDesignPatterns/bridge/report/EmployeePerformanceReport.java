package structuralDesignPatterns.bridge.report;

import structuralDesignPatterns.bridge.reportFormat.IReportFormat;

public class EmployeePerformanceReport extends Report{
    public EmployeePerformanceReport(IReportFormat iReportFormat) {
        super(iReportFormat);
    }

    @Override
    public void display() {
        super.display();
    }
}
