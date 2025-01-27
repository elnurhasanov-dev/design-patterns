package structuralDesignPatterns.bridge.report;

import structuralDesignPatterns.bridge.reportFormat.IReportFormat;

public abstract class Report {
    IReportFormat iReportFormat;

    public Report(IReportFormat iReportFormat) {
        this.iReportFormat = iReportFormat;
    }

    public void display(){
        iReportFormat.generate();
    }
}
