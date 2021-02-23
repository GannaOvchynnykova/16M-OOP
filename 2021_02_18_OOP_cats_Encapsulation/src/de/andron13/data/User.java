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

    public User() {

    }

    public User(String name, String nick, String email, double height, double weight,
                String dateOfBirth, String country, int password, String mobilNumber) {
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

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setMobilNumber(String newNomberMob) {
        this.mobilNumber = newNomberMob;
    }

    public String getMobilNumber() {
        return mobilNumber;
    }

    public void setCountry(String newCountry) {
        this.country = newCountry;
    }

    public String getCountry() {
        return country;
    }

    public void setDateOfBirth(String newDate) {
        this.dateOfBirth = newDate;
    }

    public String getDate() {
        return dateOfBirth;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    private int setGeneratorPassword() {
        for (int i = (int) (Math.random() * 10); i < 9; i++) {
            password += i;
        }
        return password;
    }

    public int getGeneratorPassword() {
        return password;
    }

    private void setBodyMassIndex() {
        double h = height / 100;
        bodyMassIndex = weight / (h * h);
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public String toDisplay() {
        return "{ " + "Name = " + name + "; Nick = " + nick + "; Email = " + email + "; Height = " + height + "; Weight = " +
                weight + "; Date of birth = " + dateOfBirth + "; Country = " + country + "; Password = " +
                password + "; Mobile Number = " + mobilNumber + "}";
    }

    public static void arrayToDisplay(User[] users) {
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].toDisplay());
        }
    }

    public static void printArray(User[] users) {
        System.out.print("[ ");
        for (int i = 0; i < users.length - 1; i++) {
            System.out.print(users[i].height + " , ");
        }
        System.out.println(" ]");
    }

    public static User[] coctailSort(User[] users) {
        int start = 0;
        int end = users.length - 1;
        while (start <= end) {
            boolean swap = false;
            for (int i = start; i < end; i++) {
                if (users[i].height > users[i + 1].height) {
                    double temp = users[i].height;
                    users[i].height = users[i + 1].height;
                    users[i + 1].height = temp;
                    swap = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (users[i].height < users[i - 1].height) {
                    double temp = users[i].height;
                    users[i].height = users[i - 1].height;
                    users[i - 1].height = temp;
                    swap = true;
                }
            }
            start++;
            if (!swap) {
                break;
            }
        }
        return users;
    }

    public static User[] addElement(User[] users, int index, User user) {
        User[] result = new User[users.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = users[i];
        }
        result[index] = user;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = users[i - 1];
        }
        return result;
    }

    public static User[] deleteElement(User[] users, int index) {
        User[] result = new User[users.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = users[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = users[i + 1];
        }
        return result;
    }

    public static User[] updateElement(User[] users, int index, User user) {
        User[] result = new User[users.length];
        for (int i = 0; i < index; i++) {
            result[i] = users[i];
        }
        result[index] = user;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = users[i];
        }
        return result;
    }

    public static User[] bubbleSort(User[] users) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < users.length - 1; i++) {
                if (users[i].height > users[i + 1].height) {
                    User temp = users[i];
                    users[i] = users[i + 1];
                    users[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
        return users;
    }


}