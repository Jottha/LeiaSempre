package dao;

import javax.security.auth.login.Configuration;
import javax.transaction.Transaction;
import model.Pagamento;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import antlr.collections.List;

public class PagamentoDao
{	
	public void salvar(Pagamento pagamento) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	session.beginTransaction();
			session.save(pagamento);
			session.beginTransaction().commit();
		} catch (Exception e) 
		{	if (session != null) 
			{	((Transaction) session).rollback();
			}
			throw e;
		} finally 
		{	session.close();
		}
	}

	public void excluir(Pagamento pagamento) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.delete(pagamento);
			session.beginTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				((Transaction) session).rollback();
			}
			throw e;
		} finally {
			session.close();
		}
	}
	
	public void atualizar(Pagamento pagamento) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.update(pagamento);
			session.beginTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				((Transaction) session).rollback();
			}
			throw e;
		} finally {
			session.close();
		}
	
	}
	
	@SuppressWarnings("unchecked")
	public List listar() 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria consulta = session.createCriteria(Pagamento.class);
			List resultado = (List) consulta.list();
			return resultado;
		} catch (RuntimeException erro) 
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public List buscarForma(String forma) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(Pagamento.class);
			crit.add(Restrictions.eq("forma", forma));
			List list = (List) crit.list();
			return list;
		} catch (RuntimeException erro)
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public List buscarValor(double valor) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(Pagamento.class);
			crit.add(Restrictions.eq("valor", valor));
			List list = (List) crit.list();
			return list;
		} catch (RuntimeException erro)
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public Pagamento buscarPagamento(int id) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(Pagamento.class);
			crit.add(Restrictions.eq("idPagamento", id));
			crit.setMaxResults(1);
			Pagamento pagamento = (Pagamento) crit.uniqueResult();
			return (Pagamento) pagamento;
		} catch (RuntimeException erro) 
		{		throw erro;
		} finally 
		{
			session.close();
		}
	}
}
