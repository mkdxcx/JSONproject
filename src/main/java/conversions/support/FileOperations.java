package conversions.support;

import java.io.File;

public class FileOperations {
    private final String PATH = "src/main/resources/";

    public String getPath() {
        return PATH;
    }

    public boolean checkIfFileExists(String fileName) {
        File file = new File(getPath() + fileName);
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }
}
