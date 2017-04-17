package controller;

import model.LeitorClasseC;
import dao.LeitorClasseCDao;

public class LeitorClasseCController 
{	
private LeitorClasseCDao leitorClasseCDao;
	
	public LeitorClasseCController()
	{
		leitorClasseCDao = new LeitorClasseCDao();
	}
	
	public void salvar(LeitorClasseC leitorClasseC) throws Exception
	{
		leitorClasseCDao.salvar(leitorClasseC);
	}
	
	public void excluir(LeitorClasseC leitorClasseC) throws Exception 
	{
		leitorClasseCDao.excluir(leitorClasseC);
	}

	public void atualizar(LeitorClasseC leitorClasseC) throws Exception 
	{
		leitorClasseCDao.atualizar(leitorClasseC);
	}
	
	public antlr.collections.List buscarNome(String nome) throws Exception
	{
		return leitorClasseCDao.buscarNome(nome);
	}

	public LeitorClasseC buscarLeitorClasseC(int id) throws Exception
	{
		return leitorClasseCDao.buscarLeitorClasseC(id);
	}
	
	public LeitorClasseC buscarCpf(String CPF) throws Exception 
	{
		return leitorClasseCDao.buscarCpf(CPF);
	}
	
	public antlr.collections.List buscarSituacao(String situacao) throws Exception
	{
		return leitorClasseCDao.buscarSituacao(situacao);
	}

}
