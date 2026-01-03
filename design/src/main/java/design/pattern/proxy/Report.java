package design.pattern.proxy;

import java.util.UUID;

public record Report(UUID id, String content) {
    public Report(UUID id) {
        this(id, "");
    }

    public Report replaceContent(String newContent)
    {
        return new Report(id, newContent);
    }
}
