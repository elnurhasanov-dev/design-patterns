package structuralDesignPatterns.bridgeDemo.report;

import structuralDesignPatterns.bridgeDemo.reportFormat.IReportFormat;

public class SalesReport extends Report {
    public SalesReport(IReportFormat iReportFormat) {
        super(iReportFormat);
    }


}
