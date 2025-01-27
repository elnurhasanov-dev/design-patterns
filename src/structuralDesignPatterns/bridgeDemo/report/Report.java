package structuralDesignPatterns.bridgeDemo.report;

import structuralDesignPatterns.bridgeDemo.UserReport;
import structuralDesignPatterns.bridgeDemo.reportFormat.IReportFormat;

public abstract class Report {
    IReportFormat iReportFormat;

    public Report(IReportFormat iReportFormat) {
        this.iReportFormat = iReportFormat;
    }

    public void display(UserReport userReport){
        iReportFormat.generate(userReport);
    }
}
