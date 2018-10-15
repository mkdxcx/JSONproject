package conversions.convToJSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import conversions.filesPath.FilePath;

import java.io.File;
import java.io.IOException;

public class ConvPoint {

    public void convertPointToJson(int x, int y, String filename) throws IOException {
        Point point = new Point(x, y);
        FilePath mainPath = new FilePath();

        File destinationFile = new File(mainPath.getPath() + filename);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(destinationFile, point);
    }

}
