package conversions.support;

import java.io.File;

public class FileOperations {
    private final String PATH = "src/main/resources/";

    public String getPath() {
        return PATH;
    }

    public void createFile(String fileName){
        File destinationFile = new File(getPath() + fileName);
    }

    public boolean checkIfFileExists(File newFile) {
        //File file = new File(getPath() + fileName);
        if (newFile.exists()) {
            return true;
        } else {
            return false;
        }
    }
}
