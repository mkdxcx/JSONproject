package run.runConvToJSON;

import conversions.convToJSON.ConvPoint;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConvPoint convPoint = new ConvPoint();
        convPoint.convertPointToJson(1,2, "pointTest.json");

    }
}
