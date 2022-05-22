package com.company;

import com.company.controller.UserController;
import com.company.model.Position;
import com.company.model.User;
import com.company.model.Store;

public class Main {

    public static void main(String[] args) {
        User users[] = {
                new User("Vasy", "FDS098", "Vasy", Position.CUSTOMER),
                new User("Ylia", "S098", "Ylia", Position.DIRECTOR),
                new User("Sveta", "FDS8", "Sveta", Position.MANAGER),
                new User("Pety", "nbv098", "Pety", Position.ANONYMOUS),
                new User("Ivan", "234", "Ivan", Position.ADMINISTRATOR),
        };

        Store store = new Store("Pokupochki", "Pokupochki.ua", users);
        UserController.exequte(store);
    }

}
