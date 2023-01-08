package com.example.imageuploadwithpicasoandglidelibarary;

public class ModelClass {

    private String Name;
    private String Email;
    private String Password;
    private String City;


    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getCity() {
        return City;
    }

    public ModelClass( String name, String email, String password, String city) {

        Name = name;
        Email = email;
        Password = password;
        City = city;
    }
}
