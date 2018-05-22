/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.calculadora.dao;

import br.estacio.calculadora.model.Usuario;

/**
 *
 * @author aluno
 */
public class DaoUsuario {
    
    private Usuario usuarioBanco = new Usuario("admin", "admin");
    
    public Usuario buscarUsuarioPorLogin(Usuario usuario){
        //buscar o usuario no banco
        // e retornar para a aplicação.
        if(usuario.getLogin()==this.usuarioBanco.getLogin()){
            return usuarioBanco;
        }else{
            return null;
        }
    }
    
}
