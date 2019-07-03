package com.sofiqul54.sqliteinsert;

public class User {
    private int id;
    private String name;
    private  String age;

    public User(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(int id, int name, int age) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void add(User user) {
    }
}
