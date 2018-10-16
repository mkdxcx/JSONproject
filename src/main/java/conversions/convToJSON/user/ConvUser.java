package conversions.convToJSON.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import conversions.filesPath.FilePath;

import java.io.File;
import java.io.IOException;

public class ConvUser {

    public void convertUserJson(User user, String fileName) throws IOException {

        FilePath mainPath = new FilePath();
        File destinationFile = new File(mainPath.getPath() + fileName);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(destinationFile,user);
    }


}
