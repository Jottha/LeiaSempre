package controller;

import java.util.List;
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
	
	public List<Livro> buscarNome(String nome) 
	{
		return livroDao.buscarNome(nome);
	}

	public Livro buscarAutor(int id) 
	{
		return livroDao.buscarLivro(id);
	}
	
	public List<Livro> buscarDataDaEdicao(String dataDaEdicao) 
	{
		return livroDao.buscarDataDaEdicao(dataDaEdicao);
	}

}
