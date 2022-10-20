package myname;

import com.google.gson.Gson;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person();
        String user = new Gson().toJson(person);
        System.out.println("user => " + user);
    }
}
