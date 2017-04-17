package controller;

import model.Pagamento;
import dao.PagamentoDao;


public class PagamentoController 
{	
	private PagamentoDao pagamentoDao;
	
	public PagamentoController()
	{
		pagamentoDao = new PagamentoDao();
	}
	
	public void salvar(Pagamento pagamento) throws Exception
	{
		pagamentoDao.salvar(pagamento);
	}
	
	public void excluir(Pagamento pagamento) throws Exception 
	{
		pagamentoDao.excluir(pagamento);
	}

	public void atualizar(Pagamento pagamento) throws Exception 
	{
		pagamentoDao.atualizar(pagamento);
	}
	
	public antlr.collections.List buscarValor(double valor) throws Exception
	{
		return pagamentoDao.buscarValor(valor);
	}

	public Pagamento buscarPagamento(int id) throws Exception
	{
		return pagamentoDao.buscarPagamento(id);
	}

}
