package structuralDesignPatterns.bridge.example1;

import structuralDesignPatterns.bridge.example1.report.EmployeePerformanceReport;
import structuralDesignPatterns.bridge.example1.report.Report;
import structuralDesignPatterns.bridge.example1.reportFormat.DesktopFormat;
import structuralDesignPatterns.bridge.example1.reportFormat.WebFormat;

public class Main {
    public static void main(String[] args) {
        Report report = new EmployeePerformanceReport(new WebFormat());
        report.display();

        Report report2 = new EmployeePerformanceReport(new DesktopFormat());
        report2.display();
    }
}
