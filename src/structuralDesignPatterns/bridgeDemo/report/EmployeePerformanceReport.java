package structuralDesignPatterns.bridgeDemo.report;

import structuralDesignPatterns.bridgeDemo.reportFormat.IReportFormat;

public class EmployeePerformanceReport extends Report {
    public EmployeePerformanceReport(IReportFormat iReportFormat) {
        super(iReportFormat);
    }


}
