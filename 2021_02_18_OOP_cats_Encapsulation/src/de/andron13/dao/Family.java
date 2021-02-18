package de.andron13.dao;

import de.andron13.data.Cat;
import de.andron13.data.User;

public class Family {
    User user;
    Cat cat;

    public Family(User user, Cat cat){
        this.user = user;
        this.cat = cat;
    }
}
