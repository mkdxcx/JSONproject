package conversions.convToJSON.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import conversions.support.FileOperations;

import java.io.File;
import java.io.IOException;

public class ConvUser {

    public void convertUserJson(User user, String fileName) throws IOException {

        FileOperations fileSupport = new FileOperations();

        if (!fileSupport.checkIfFileExists(fileName)) {
            FileOperations mainPath = new FileOperations();
            File destinationFile = new File(mainPath.getPath() + fileName);

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(destinationFile, user);
        } else {
            System.out.println("File with given name already exists.");
        }
    }

    public void addUserToFile(User user, String fileName){

        FileOperations fileSupport = new FileOperations();

        if (fileSupport.checkIfFileExists(fileName)) {

        } else {
            System.out.println("File with given name doesn't exist.");
        }

    }
}
