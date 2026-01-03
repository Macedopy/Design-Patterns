package design.pattern.proxy;

public class ReportGeneratorImpl {
    private final Report report;

    ReportGeneratorImpl(Report report)
    {
        this.report = report;
    }

    public Report generateReport() {
        if (report.content().isEmpty())
            {
                return report.replaceContent("Generated content");
            }
        return report;
    }
}
