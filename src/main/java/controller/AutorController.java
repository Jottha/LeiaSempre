package controller;

import model.Autor;
import dao.AutorDao;

public class AutorController 
{	
	private AutorDao autorDao;
	
	public AutorController()
	{
		autorDao = new AutorDao();
	}
	
	public void salvar(Autor autor) throws Exception
	{
		autorDao.salvar(autor);
	}
	
	public void excluir(Autor autor) throws Exception 
	{
		autorDao.excluir(autor);
	}

	public void atualizar(Autor autor) throws Exception 
	{
		autorDao.atualizar(autor);
	}
	
	public antlr.collections.List buscarNome(String nome) throws Exception
	{
		return autorDao.buscarNome(nome);
	}

	public Autor buscarAutor(int id) throws Exception
	{
		return autorDao.buscarAutor(id);
	}

}
