package br.edu.ifpb.models;

import java.util.ArrayList;

public class UserManager {
    ArrayList<User> users = new ArrayList<>();

    private boolean _addUser(User user) {
        users.add(user);
        return true;
    }

    public boolean cadastrar(String name, String date, Boolean riskGroup) {
        if (name.equals("")) return false;
        else if (date.equals("")) return false;
        else if (riskGroup == null) return false;
        return _addUser(new User(name, date, riskGroup));
    }


    public void showUsers() {
        for (User user: users) {
            System.out.println(user);
        }
    }



}
