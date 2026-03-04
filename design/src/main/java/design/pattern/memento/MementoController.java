package design.pattern.memento;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MementoController {

    public boolean createMemento() {
        ImageEditor imageEditor = new ImageEditor("/image.jpg", "jpg");

        ImageEditorBackupManager backupManager = new ImageEditorBackupManager(imageEditor);

        backupManager.backup();
        imageEditor.convertFormatTo("gif");

        backupManager.backup();
        imageEditor.convertFormatTo("png");

        backupManager.backup();
        imageEditor.convertFormatTo("bmp");


        backupManager.undo(); // bpm

        backupManager.undo(); // png

        backupManager.undo(); // gif

        return true;
    }
}
