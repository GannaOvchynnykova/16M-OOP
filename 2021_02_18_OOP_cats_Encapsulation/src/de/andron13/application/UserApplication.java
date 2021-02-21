package de.andron13.application;

import de.andron13.dao.Chat;
import de.andron13.data.User;

public class UserApplication {
    public static void main(String[] args) {
        User user1 = new User("Victor", "vici", "ggg@hh.hh", 200.0, 100.0,
                "02.08.1990", "Ukraine", 123456789, "23-87-45");
        User user2 = new User("Oleg", "olly", "hhhhh@com", 176.0, 67.0,
                "10.04.1986", "Russia", 123456789, "45-78-99");
        User user3 = new User("Martin", "mart", "fffL@com", 134.0, 67.0,
                "09.06.1967", "USA", 123456789, "65-78-32");
        User user4 = new User("Victoria", "vit", "ghg@hh.com", 180.0, 86.0,
                "09.10.1976", "Chili", 123456789, "13-17-15");
        User user5 = new User("Matilda", "motty", "mmmm@com", 156.0, 97.0,
                "11.09.1956", "Roma", 123456789, "42-18-29");
        User user6 = new User("Rocky", "rocky", "uzt@com", 184.0, 107.0,
                "29.02.1987", "Australia", 123456789, "55-28-31");

        User[] user = new User[]{user1, user2, user3, user4, user5};

        System.out.println(user1.toDisplay());
        User.printArray(User.bubbleSort(user));
        User.printArray(User.coctailSort(user));
        User.printArray(User.updateElement(user, 2, user6));
        User.printArray(User.addElement(user, 3, user5));
        User.printArray(User.deleteElement(user, 4));

        Chat telegram = new Chat(20);

        System.out.println(telegram.addUser(user1));
        System.out.println(telegram.deleteUser(user1));
        System.out.println(telegram.updateUser(user3));


        System.out.println(user2.getBodyMassIndex());
        System.out.println(user1.getBodyMassIndex());
        System.out.println(user1.getGeneratorPassword());
        user1.setName("Pedro");
        System.out.println(user1.getName());
        user1.setDateOfBirth("03.04.1995");
        System.out.println(user1.getDate());
        user1.setCountry("Kanada");
        System.out.println(user1.getCountry());
        user1.setMobilNumber("87-44-58");
        System.out.println(user1.getMobilNumber());
        user1.setEmail("gfj@com");
        System.out.println(user1.getEmail());

        User.arrayToDisplay(user);
        //User.myPrint(user);
        User.coctailSort(user);

    }
}

