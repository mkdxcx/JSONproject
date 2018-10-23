package run.runConvToJSON;

import conversions.convToJSON.point.ConvPoint;
import conversions.convToJSON.user.ConvUser;
import conversions.convToJSON.user.User;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ConvPoint convPoint = new ConvPoint();
        convPoint.convertPointToJson(1,2, "pointTest.json");

        User userTest = new User("mkrzesi","Maciej","Krze",34,"PL","Wrocław");
        ConvUser convUser = new ConvUser();
        convUser.convertUserJson(userTest,"userFull.json");

    }
}
