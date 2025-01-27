package structuralDesignPatterns.bridge;

import structuralDesignPatterns.bridge.report.EmployeePerformanceReport;
import structuralDesignPatterns.bridge.report.Report;
import structuralDesignPatterns.bridge.reportFormat.WebFormat;

public class Main {
    public static void main(String[] args) {
        Report report = new EmployeePerformanceReport(new WebFormat());
        report.display();
    }
}
