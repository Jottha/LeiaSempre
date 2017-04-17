package controller;

import model.Livro;
import dao.LivroDao;


public class LivroController 
{	
	private LivroDao livroDao;
	
	public LivroController()
	{
		livroDao = new LivroDao();
	}
	
	public void salvar(Livro livro) throws Exception
	{
		livroDao.salvar(livro);
	}
	
	public void excluir(Livro livro) throws Exception 
	{
		livroDao.excluir(livro);
	}

	public void atualizar(Livro livro) throws Exception 
	{
		livroDao.atualizar(livro);
	}
	
	public antlr.collections.List buscarNome(String nome) throws Exception
	{
		return livroDao.buscarNome(nome);
	}

	public Livro buscarAutor(int id) throws Exception
	{
		return livroDao.buscarLivro(id);
	}
	
	public antlr.collections.List buscarDataDaEdicao(String dataDaEdicao) throws Exception
	{
		return livroDao.buscarDataDaEdicao(dataDaEdicao);
	}

}
