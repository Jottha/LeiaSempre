package controller;

import java.util.List;
import model.Autor;
import dao.AutorDao;

public class AutorController 
{	
	private AutorDao autorDao;
	private Autor autor;
	
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
	
	public List<Autor> buscarNome(String nome) 
	{
		return autorDao.buscarNome(nome);
	}

	public Autor buscarAutor(int id) 
	{
		return autorDao.buscarAutor(id);
	}

}
