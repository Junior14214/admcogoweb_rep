package br.com.admcogo;

import br.com.admcogo.persistencia.entidade.Usuario;
import br.com.admcogo.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		testeExcluir();
	}
	
	public static void testeExcluir(){
		//criando usuário
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("Elias");
		usu.setLogin("alves");
		usu.setSenha("123");

		//Cadastrando usuário no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluido com Sucesso!");

	}
	
	public static void testeAlterar(){
		//criando usuário
		Usuario usu = new Usuario();
		usu.setId(2);
		usu.setNome("Elias");
		usu.setLogin("alves");
		usu.setSenha("123");

		//Cadastrando usuário no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com Sucesso!");

	}
	
	public static void testeCadastrar(){
		//criando usuário
		Usuario usu = new Usuario();
		usu.setNome("Elias Alves da silva");
		usu.setLogin("pastor elias alves");
		usu.setSenha("123");

		//Cadastrando usuário no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com Sucesso!");

	}
	

}
