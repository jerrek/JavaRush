package com.javarush.task.task36.task3608.model;

public interface Model {
    public ModelData getModelData();

    public void loadUsers();

    public void loadDeletedUsers();

    public void loadUserById(long userId);

    public void deleteUserById(long id);

    public void changeUserData(String name, long id, int level);
}
