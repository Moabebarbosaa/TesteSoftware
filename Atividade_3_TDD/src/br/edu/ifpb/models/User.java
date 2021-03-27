package br.edu.ifpb.models;

public class User {
    public String name;
    public String date;
    public Boolean riskGroup;

    public User(String name, String date, Boolean riskGroup) {
        this.name = name;
        this.date = date;
        this.riskGroup = riskGroup;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", riskGroup=" + riskGroup +
                '}';
    }
}
