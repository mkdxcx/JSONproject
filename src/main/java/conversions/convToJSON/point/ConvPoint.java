package conversions.convToJSON.point;

import com.fasterxml.jackson.databind.ObjectMapper;
import conversions.support.FileOperations;
import conversions.support.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class ConvPoint {

    private Logger getNewLogger() {
        return LogManager.getLogger();
    }

    public void convertPointToJson(int x, int y, String fileName) throws IOException {

        Logger logger = getNewLogger();
        FileOperations fileSupport = new FileOperations();

        FileOperations mainPath = new FileOperations();
        File destinationFile = new File(mainPath.getPath() + fileName);

        if (!fileSupport.checkIfFileExists(destinationFile)) {
            Point point = new Point(x, y);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(destinationFile, point);
        } else {
            logger.info("File with given name already exists.");
        }
    }
}
