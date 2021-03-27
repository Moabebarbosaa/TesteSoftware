package br.edu.ifpb;

import br.edu.ifpb.models.UserManager;

public class Main {

    public static void main(String[] args) {

        UserManager userManager = new UserManager();

        userManager.cadastrar(
                "Moabe Barbosa",
                "02/12/1997",
                false
        );

        userManager.cadastrar(
                "Moabe",
                "02/12/1997",
                true
        );

        userManager.showUsers();
    }
}
