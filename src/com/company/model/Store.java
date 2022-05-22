package com.company.model;

public class Store {
    String storeName;
    String storeURL;
    User users[];
    User authorisedUser;

    public Store(String storeName, String storeURL, User[] users) {
        this.storeName = storeName;
        this.storeURL = storeURL;
        this.users = users;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreURL() {
        return storeURL;
    }

    public void setStoreURL(String storeURL) {
        this.storeURL = storeURL;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getAuthorisedUser() {
        return authorisedUser;
    }

    public void setAuthorisedUser(User authorisedUser) {
        this.authorisedUser = authorisedUser;
    }
}
