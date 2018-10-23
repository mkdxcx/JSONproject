package conversions.convToJSON.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import conversions.support.FileOperations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class ConvUser {

    private Logger getNewLogger(){
        return LogManager.getLogger();
    }

    public void convertUserJson(User user, String fileName) throws IOException {

        Logger logger = getNewLogger();
        FileOperations fileSupport = new FileOperations();

        if (!fileSupport.checkIfFileExists(fileName)) {
            logger.info("Logger doesn't work");
            FileOperations mainPath = new FileOperations();
            File destinationFile = new File(mainPath.getPath() + fileName);

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(destinationFile, user);
        } else {
            logger.info("File with given name already exists");
        }
    }

    public void addNextUserToJson(User user, String fileName) throws IOException{

    }
}
