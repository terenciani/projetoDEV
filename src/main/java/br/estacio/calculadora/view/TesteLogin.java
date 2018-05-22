/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.calculadora.view;

import br.estacio.calculadora.controller.LoginController;

/**
 *
 * @author aluno
 */
// Equivalente a visão - view
public class TesteLogin {
    //Simula um HTML de visão do usuario
    public static void main(String[] args) {
        String login="admin";
        String senha="admin";
        
        LoginController controlador = new LoginController();
        
        String mensagem = controlador.logar(login,senha);
        
        System.out.println(mensagem);
        
    }
    
}
