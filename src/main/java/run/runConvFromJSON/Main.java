package run.runConvFromJSON;

import conversions.convFromJSON.user.ConvToUser;
import conversions.support.User;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ConvToUser convToUser = new ConvToUser();
        //User singleUserFromJson = convToUser.convertSingleUserFromJson("singleUser.json");
        User[] users = convToUser.convertUserListFromJson("usersFromList.json");

        for (int i = 0; i <users.length; i++) {
            System.out.println(users[i].toString());        }
    }
}
