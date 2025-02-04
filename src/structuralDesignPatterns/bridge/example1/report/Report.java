package structuralDesignPatterns.bridge.example1.report;

import structuralDesignPatterns.bridge.example1.reportFormat.IReportFormat;

public abstract class Report {
    IReportFormat iReportFormat;

    public Report(IReportFormat iReportFormat) {
        this.iReportFormat = iReportFormat;
    }

    public void display(){
        iReportFormat.generate();
    }
}
