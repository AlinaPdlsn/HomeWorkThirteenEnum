package com.company.view;

import com.company.model.Position;
import com.company.model.Store;
import com.company.model.User;

public class UserView {

    public static void getCurrentUserRights(Store store) {

        if (store.getAuthorisedUser() == null){

            System.out.println(" Не авторізован ");
            return;
        }

        User user = store.getAuthorisedUser();

        if (user.getRole() == Position.DIRECTOR) {
            System.out.println("Директор магазина, может управлять кадрами, и ценами");
        }

        if (user.getRole() == Position.ADMINISTRATOR) {
            System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
        }

        if (user.getRole() == Position.MANAGER) {
            System.out.println("Менеджер магазина, может общаться с клиентами");
        }

        if (user.getRole() == Position.CUSTOMER) {
            System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
        }

        if (user.getRole() == Position.ANONYMOUS) {
            System.out.println("Анонимный пользователь, может покупать товары и\\или авторизоваться");
        }
    }
}
