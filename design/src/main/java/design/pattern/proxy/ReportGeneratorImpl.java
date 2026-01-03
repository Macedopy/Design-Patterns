package design.pattern.proxy;

import java.util.UUID;

public class ReportGenerator {
    private final Report report;

    ReportGenerator(Report report)
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
