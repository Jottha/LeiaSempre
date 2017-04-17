package dao;

import javax.security.auth.login.Configuration;
import javax.transaction.Transaction;
import model.LeitorClasseC;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import antlr.collections.List;

public class LeitorClasseCDao
{	
	public void salvar(LeitorClasseC leitorClasseC) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	session.beginTransaction();
			session.save(leitorClasseC);
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

	public void excluir(LeitorClasseC leitorClasseC) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.delete(leitorClasseC);
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
	
	public void atualizar(LeitorClasseC leitorClasseC) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.update(leitorClasseC);
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
	
	@SuppressWarnings("unchecked")
	public List listar() 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria consulta = session.createCriteria(LeitorClasseC.class);
			List resultado = (List) consulta.list();
			return resultado;
		} catch (RuntimeException erro) 
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public List buscarNome(String nome) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(LeitorClasseC.class);
			crit.add(Restrictions.eq("nome", nome));
			List list = (List) crit.list();
			return list;
		} catch (RuntimeException erro)
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public LeitorClasseC buscarLeitorClasseC(int id) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(LeitorClasseC.class);
			crit.add(Restrictions.eq("idLeitorC", id));
			crit.setMaxResults(1);
			LeitorClasseC leitorClasseC = (LeitorClasseC) crit.uniqueResult();
			return (LeitorClasseC) leitorClasseC;
		} catch (RuntimeException erro) 
		{		throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public LeitorClasseC buscarCpf(String CPF) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(LeitorClasseC.class);
			crit.add(Restrictions.eq("CPF", CPF));
			crit.setMaxResults(1);
			LeitorClasseC leitorClasseC = (LeitorClasseC) crit.uniqueResult();
			return (LeitorClasseC) leitorClasseC;
		} catch (RuntimeException erro) 
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public List buscarSituacao(String situacao) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(LeitorClasseC.class);
			crit.add(Restrictions.eq("situacao", situacao));
			List list = (List) crit.list();
			return list;
		} catch (RuntimeException erro)
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
}
