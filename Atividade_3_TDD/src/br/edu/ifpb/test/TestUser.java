package br.edu.ifpb.test;

import br.edu.ifpb.models.UserManager;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUser {

    UserManager userManager = new UserManager();

    // Aqui faremos casos que teste um comportamento que o usuário seja adicionado ao BD.
    @Test
    void test1() {
        boolean TESTE1 = userManager.cadastrar("Moabe Barbosa", "02/12/1997", false);
        Assertions.assertTrue(TESTE1);
    }

    @Test
    void test2() {
        boolean TESTE2 = userManager.cadastrar("Moabe Barbosa", "20/03/2021", true);
        Assertions.assertEquals(true, TESTE2);
    }

    @Test
    void test3() {
        boolean TESTE3 = userManager.cadastrar("Moabe Barbosa", "20/03/2021", true);
        Assert.assertEquals(true, TESTE3);
    }


    // Aqui faremos um caso que teste um comportamento que o usuário não deveria ser adicionado ao BD.

    // Aqui simula o usuário que não preencheu o campo do grupo de risco.
    @Test
    void test4(){
        boolean TESTE4 = userManager.cadastrar("Moabe Barbosa", "21/03/2021", null);
        Assertions.assertFalse(TESTE4);
    }

    // Aqui simula o usuário que não preencheu o campo do nome.
    @Test
    void test5(){
        boolean TESTE5 = userManager.cadastrar("", "21/03/2021", true);
        Assert.assertEquals(false, TESTE5);
    }


    // Aqui simula o usuário que não preencheu o campo da data.
    @Test
    void test6(){
        boolean TESTE6 = userManager.cadastrar("Moabe Barbosa", "", false);
        Assert.assertEquals(false, TESTE6);
    }






}
