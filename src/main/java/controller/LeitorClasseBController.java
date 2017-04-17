package controller;

import model.LeitorClasseB;
import dao.LeitorClasseBDao;

public class LeitorClasseBController 
{	
	private LeitorClasseBDao leitorClasseBDao;
	
	public LeitorClasseBController()
	{
		leitorClasseBDao = new LeitorClasseBDao();
	}
	
	public void salvar(LeitorClasseB leitorClasseB) throws Exception
	{
		leitorClasseBDao.salvar(leitorClasseB);
	}
	
	public void excluir(LeitorClasseB leitorClasseB) throws Exception 
	{
		leitorClasseBDao.excluir(leitorClasseB);
	}

	public void atualizar(LeitorClasseB leitorClasseB) throws Exception 
	{
		leitorClasseBDao.atualizar(leitorClasseB);
	}
	
	public antlr.collections.List buscarNome(String nome) throws Exception
	{
		return leitorClasseBDao.buscarNome(nome);
	}

	public LeitorClasseB buscarLeitorClasseB(int id) throws Exception
	{
		return leitorClasseBDao.buscarLeitorClasseB(id);
	}
	
	public LeitorClasseB buscarCpf(String CPF) throws Exception 
	{
		return leitorClasseBDao.buscarCpf(CPF);
	}
	
	public antlr.collections.List buscarSituacao(String situacao) throws Exception
	{
		return leitorClasseBDao.buscarSituacao(situacao);
	}

}
