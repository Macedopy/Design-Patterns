package design.pattern.proxy;

public class ReportGeneratorProxy implements ReportGeneratorInterface {
    private final ReportGeneratorImpl reportGeneratorImpl;

    ReportGeneratorProxy(ReportGeneratorImpl reportGeneratorImpl)
    {
        this.reportGeneratorImpl = reportGeneratorImpl;
    }

    @Override
    public Report generateReport() {
        Report newReport = reportGeneratorImpl.generateReport();

        String newContent = "Bruno Content".repeat(5);

        newReport.replaceContent(newContent);
        return newReport;
    }
}
