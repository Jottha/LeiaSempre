package controller;

import model.LeitorClasseA;
import dao.LeitorClasseADao;


public class LeitorClasseAController 
{	
	private LeitorClasseADao leitorClasseADao;
	
	public LeitorClasseAController()
	{
		leitorClasseADao = new LeitorClasseADao();
	}
	
	public void salvar(LeitorClasseA leitorClasseA) throws Exception
	{
		leitorClasseADao.salvar(leitorClasseA);
	}
	
	public void excluir(LeitorClasseA leitorClasseA) throws Exception 
	{
		leitorClasseADao.excluir(leitorClasseA);
	}

	public void atualizar(LeitorClasseA leitorClasseA) throws Exception 
	{
		leitorClasseADao.atualizar(leitorClasseA);
	}
	
	public antlr.collections.List buscarNome(String nome) throws Exception
	{
		return leitorClasseADao.buscarNome(nome);
	}

	public LeitorClasseA buscarLeitorClasseA(int id) throws Exception
	{
		return leitorClasseADao.buscarLeitorClasseA(id);
	}
	
	public LeitorClasseA buscarCpf(String CPF) throws Exception 
	{
		return leitorClasseADao.buscarCpf(CPF);
	}
	
	public antlr.collections.List buscarSituacao(String situacao) throws Exception
	{
		return leitorClasseADao.buscarSituacao(situacao);
	}
}
