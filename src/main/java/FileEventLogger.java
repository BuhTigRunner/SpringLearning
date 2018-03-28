import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private final String fileName;

    public void init() throws IOException {
        File file = new File(fileName);
        if (file.exists() && !file.canWrite()) {
            throw new IOException("File can't be write.");
        }
    }

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    public void logEvent(Event event) {
        try {
            //noinspection deprecation
            FileUtils.writeStringToFile(new File(fileName), event.toString(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
