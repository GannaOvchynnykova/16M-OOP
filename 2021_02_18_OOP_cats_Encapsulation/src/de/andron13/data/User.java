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
    void setEmail (String newEmail){
        this.email = newEmail;
    }
    public String getEmail (){
        return email;
    }
    void setMobilNumber(String newNomberMob){
        this.mobilNumber = newNomberMob;
    }
    public String getMobilNumber(){
        return mobilNumber;
    }
    void setCountry (String newCountry){
        this.country = newCountry;
    }
    public String getCountry (){
        return country;
    }
    void setDateOfBirth (String newDate){
        this.dateOfBirth = newDate;
    }
    public String getDate (){
        return dateOfBirth;
    }
    void setName (String newName){
        this.name = newName;
    }
    public String getName (){
        return name;
    }
    private int setGeneratorPassword(){
        for (int i = (int) (Math.random()*10); i < 9; i++) {
            password += i;
            }
        return password;
    }
    public int getGeneratorPassword(){
        return password;
    }

    private void setBodyMassIndex(){
        double h = height / 100;
        bodyMassIndex = weight/(h * h);
    }

    public double getBodyMassIndex(){
        return bodyMassIndex;
    }
}

class TestUser{
    public static void main(String[] args) {
        User myLovelyUser = new User("Victor", "vici", "ggg@hh.hh", 200.0, 100.0,
                "02.08.1990", "Ukraine", 5555555, "23-87-45");
        System.out.println(myLovelyUser.getBodyMassIndex());
        System.out.println(myLovelyUser.getGeneratorPassword());
        myLovelyUser.setName("Martin");
        System.out.println(myLovelyUser.getName());
        myLovelyUser.setDateOfBirth("03.04.1995");
        System.out.println(myLovelyUser.getDate());
        myLovelyUser.setCountry("Kanada");
        System.out.println(myLovelyUser.getCountry());
        myLovelyUser.setMobilNumber("8-054-6784858");
        System.out.println(myLovelyUser.getMobilNumber());
        myLovelyUser.setEmail("gfj@com");
        System.out.println(myLovelyUser.getEmail());

    }
}
