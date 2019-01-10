package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.List;

public class ModelData {
    private boolean displayDeletedUserList;
    private List<User> users;
    private User activeUser;
    private User deleteUser;
    private User changedUser;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public void setDeleteUser(User deleteUser) {
        this.deleteUser = deleteUser;
    }

    public User getDeleteUser() {
        return deleteUser;
    }

    public User getChangedUser() {
        return changedUser;
    }

    public void setChangedUser(User changedUser) {
        this.changedUser = changedUser;
    }
}
