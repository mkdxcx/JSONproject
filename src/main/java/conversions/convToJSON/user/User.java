package conversions.convToJSON.user;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private Map<String,String> adress = new HashMap<String, String>();

    public User(String userId, String firstName, String lastName, int age, String country, String city, String postalCode, String street, String number) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        adress.put("city",city);
        adress.put("postalCode",postalCode);
        adress.put("street", street);
        adress.put("number", number);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Map<String, String> getAdress() {
        return adress;
    }

    public void setAdress(Map<String, String> adress) {
        this.adress = adress;
    }
}
