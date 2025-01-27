package structuralDesignPatterns.bridgeDemo;

import structuralDesignPatterns.bridgeDemo.report.EmployeePerformanceReport;
import structuralDesignPatterns.bridgeDemo.report.Report;
import structuralDesignPatterns.bridgeDemo.reportFormat.WebFormat;

public class Main {
    public static void main(String[] args) {
        UserReport userReport1 = new UserReport("Elnur", "Hasanov");

        Report report = new EmployeePerformanceReport(new WebFormat());
        report.display(userReport1);
    }
}
