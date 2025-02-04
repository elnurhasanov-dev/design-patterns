package structuralDesignPatterns.bridge.example1.report;

import structuralDesignPatterns.bridge.example1.reportFormat.IReportFormat;

public class EmployeePerformanceReport extends Report{
    public EmployeePerformanceReport(IReportFormat iReportFormat) {
        super(iReportFormat);
    }

    @Override
    public void display() {
        super.display();
    }
}
