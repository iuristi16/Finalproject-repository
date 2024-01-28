package DataObject;

import com.github.javafaker.Faker;

public class LoginData {
    static Faker faker1 = new Faker();


    public  static

    String


            correctnameData= "standard_user",
            correctpasswordData="secret_sauce",
            incorrectnameData = faker1.bothify("????##"),
            incorrectpasswordData = faker1.bothify("???##??##");

}


