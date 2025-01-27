package structuralDesignPatterns.bridgeDemo.reportFormat;

import structuralDesignPatterns.bridgeDemo.UserReport;

public class DesktopFormat implements IReportFormat {
    @Override
    public void generate(UserReport report) {
        System.out.println("Report / Name: " + report.userName + " Surname: " + report.userSurname );
    }
}
