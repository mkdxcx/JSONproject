package conversions.convFromJSON.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import conversions.support.FileOperations;
import conversions.support.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ConvToUser {

    private Logger getNewLogger() {
        return LogManager.getLogger();
    }

    public User convertSingleUserFromJson(String fileName) throws IOException {

        Logger logger = getNewLogger();
        FileOperations fileSupport = new FileOperations();

        FileOperations mainPath = new FileOperations();
        File sourceFile = new File(mainPath.getPath() + fileName);

        if(fileSupport.checkIfFileExists(sourceFile)){
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.readValue(sourceFile,User.class);
            return objectMapper.readValue(sourceFile,User.class);
        }else{
            logger.info("Source file doesn't exist or has different name.");
            return null;
        }
    }

    public User[] convertUserListFromJson(String fileName) throws IOException{
        Logger logger = getNewLogger();
        FileOperations fileSupport = new FileOperations();

        FileOperations mainPath = new FileOperations();
        File sourceFile = new File(mainPath.getPath() + fileName);

        if(fileSupport.checkIfFileExists(sourceFile)){
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(sourceFile, User[].class);
        }else{
            logger.info("Source file doesn't exist or has different name.");
            return null;
        }
    }
}
