package de.andron13.dao;

import de.andron13.data.User;

public class Chat {
    private User[] users;
    private int size;

    public Chat(int capasity) {
        users = new User[capasity];
        size = 0;
    }

    public boolean addUser(User user) {
        if (size < users.length) {
            users[size] = user;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteUser(User user) {
        for (int i = 0; i < size; i++) {
            if (users[i].equals(user)) {
                users[i] = users[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean updateUser (User user){
        for (int i = 0; i < size+1 ; i++) {
            if (users[i].equals(user)){
                users[i] = users[size +1];
                size++;
                return true;
            }
        }
        return false;
    }
}
