package com.company.service;

import com.company.model.Store;
import com.company.view.UserView;
import com.company.model.User;
import java.util.Scanner;

public class UserService {

    public boolean tryLogin(Store store) {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        if (this.login(login, password, store)) {
            UserView.getCurrentUserRights(store);
            this.logout(store);
            return true;
        } else {
            return false;
        }
    }
    public boolean login(String login, String password, Store store) {
        for (User user : store.getUsers()) {
            if (user.getLogin().equals(login)) {
                if (user.getPassword().equals(password)) {
                    store.setAuthorisedUser(user);
                    return true;
                }
            }
        }
        return false;
    }

    public void logout(Store store){
        store.setUsers(null);
        System.out.println("Пользователь вышел из системы");
    }
}
