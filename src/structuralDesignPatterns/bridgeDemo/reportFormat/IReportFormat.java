package structuralDesignPatterns.bridgeDemo.reportFormat;

import structuralDesignPatterns.bridgeDemo.UserReport;

public interface IReportFormat {
    void generate(UserReport report);
}
