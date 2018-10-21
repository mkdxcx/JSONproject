package conversions.convToJSON.point;

import com.fasterxml.jackson.databind.ObjectMapper;
import conversions.support.FileOperations;

import java.io.File;
import java.io.IOException;

public class ConvPoint {

    public void convertPointToJson(int x, int y, String fileName) throws IOException {

        FileOperations fileSupport = new FileOperations();

        if (!fileSupport.checkIfFileExists(fileName)) {
            Point point = new Point(x, y);
            FileOperations mainPath = new FileOperations();
            File destinationFile = new File(mainPath.getPath() + fileName);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(destinationFile, point);
        } else {
            System.out.println("File with given name already exists.");
        }
    }
}
