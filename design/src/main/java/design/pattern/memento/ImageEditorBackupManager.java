package design.pattern.memento;

import java.util.List;

public class ImageEditorBackupManager {
    private List<Memento> mementos;
    private ImageEditor imageEditor;

    public ImageEditorBackupManager
    (
        final ImageEditor imageEditor
    ) 
    {}

    public void backup()
    {
        System.out.println("Backup: Saving state of ImageEditor");
        this.mementos.add(this.imageEditor.save());
    }

    public void undo()
    {
        Memento memento = this.mementos.get(-1);
        
        if (memento == null) {
            return;
        }

        this.imageEditor.restore(memento);
        System.out.println("Undo: Restoring state of ImageEditor to " + memento.getName());
    }

    public List<Memento> showMementos()
    {
        return this.mementos;
    }
}
