package com.company.controller;

import com.company.model.Store;
import com.company.model.User;
import com.company.service.UserService;

public class UserController {

    public static void exequte(Store store) {

        UserService userService = new UserService();
        while (userService.tryLogin(store) == false) {
            System.out.println("Неверный логин и\\или пароль");
        }
    }

}

