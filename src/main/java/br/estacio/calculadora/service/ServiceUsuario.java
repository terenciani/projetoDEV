/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.calculadora.service;

import br.estacio.calculadora.dao.DaoUsuario;
import br.estacio.calculadora.model.Usuario;

/**
 *
 * @author aluno
 */
public class ServiceUsuario {
    public String verficaUsuario(Usuario usuario){
        DaoUsuario daoUsuario = new DaoUsuario();
        
        Usuario usuBanco = daoUsuario.buscarUsuarioPorLogin(usuario);
        if(usuBanco == null)
            return "Usuário não encontrado";
        else if (usuBanco.getSenha()==usuario.getSenha())
            return "index";
        else
            return "Senha Inválida";
    }
}
