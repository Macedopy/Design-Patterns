package design.pattern.command;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SmartHouseApp {
    private Map<String, SmartHouseCommand> commands = new ConcurrentHashMap<>();

    private final SmartHouseCommand commandInstance(String key)
    {
        return commands.get(key);
    }

    public void addCommand(String key, SmartHouseCommand command)
    {
        this.commands.put(key, command);
    }

    public void executeCommand(String key)
    {
        commandInstance(key).execute();
    }

    public void undoCommand(String key)
    {
        commandInstance(key).undo();
    }
}
