package de.andron13.data;

public class User {
    private String name;
    private String nick;
    private String email;

    private String dateOfBirth;
    private String country;
    private int password;
    private String mobilNumber;
    private int generatorPassword;

    private double bodyMassIndex;
    private double height;
    private double weight;


    User(String name, String nick, String email, double height, double weight,
         String dateOfBirth, String country, int password, String mobilNumber){
        this.name = name;
        this.nick = nick;
        this.email = email;
        this.height = height;
        this.weight = weight;

        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.password = password;
        this.mobilNumber = mobilNumber;
        setBodyMassIndex();
        setGeneratorPassword();

    }
    private int setGeneratorPassword(){
        for (int i = (int) (Math.random()*10); i < 9; i++) {
            }
        return password;
    }

    private void setBodyMassIndex(){
        double h = height / 100;
        bodyMassIndex = weight/(h * h);
    }

    public double getBodyMassIndex(){
        return bodyMassIndex;
    }
    public int getRandomPassword(){
        return password;
    }
}

class TestUser{
    public static void main(String[] args) {
        User myLovelyUser = new User("Victor", "vici", "ggg@hh.hh", 200.0, 100.0,
                "02.08.1990", "Ukraine", 5555555, "23-87-45");
        System.out.println(myLovelyUser.getBodyMassIndex());
        System.out.println(myLovelyUser.getRandomPassword());
    }
}
