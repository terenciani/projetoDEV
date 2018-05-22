/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.calculadora.controller;

import br.estacio.calculadora.service.ServiceUsuario;
import br.estacio.calculadora.model.Usuario;

/**
 *
 * @author aluno
 */
public class LoginController {
    public String logar(String login, String senha){
        Usuario usuario = new Usuario(login, senha);
        
        ServiceUsuario servico = new ServiceUsuario();
        
       return servico.verficaUsuario(usuario);
        
        
    }
}
