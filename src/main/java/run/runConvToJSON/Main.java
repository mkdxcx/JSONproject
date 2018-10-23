package run.runConvToJSON;

import conversions.convToJSON.user.ConvUser;
import conversions.convToJSON.user.User;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<User> usersList = new LinkedList<User>();

        //ConvPoint convPoint = new ConvPoint();
        //convPoint.convertPointToJson(1,2, "pointTest.json");

        User userTest1 = new User("mkrzesi1","Mac1","Krze1",34,"PL","Wro","55-330","Ostr1","5a");
        User userTest2 = new User("mkrzesi2","Mac2","Krze2",34,"PL","Wro","55-330","Ostr2","5a");
        User userTest3 = new User("mkrzesi3","Mac3","Krze3",34,"PL","Wro","55-330","Ostr3","5a");

        usersList.add(userTest1);
        usersList.add(userTest2);
        usersList.add(userTest3);

        ConvUser convUser = new ConvUser();
        convUser.converUsersListToJson(usersList,"dupa.json");
    }
}
