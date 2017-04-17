package dao;

import javax.security.auth.login.Configuration;
import javax.transaction.Transaction;
import model.LeitorClasseA;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import antlr.collections.List;

public class LeitorClasseADao
{	
	public void salvar(LeitorClasseA leitorClasseA) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	session.beginTransaction();
			session.save(leitorClasseA);
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

	public void excluir(LeitorClasseA leitorClasseA) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.delete(leitorClasseA);
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
	
	public void atualizar(LeitorClasseA leitorClasseA) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.update(leitorClasseA);
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
		{	Criteria consulta = session.createCriteria(LeitorClasseA.class);
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
		{	Criteria crit = session.createCriteria(LeitorClasseA.class);
			crit.add(Restrictions.eq("nome", nome));
			List list = (List) crit.list();
			return list;
		} catch (RuntimeException erro)
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public LeitorClasseA buscarLeitorClasseA(int id) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(LeitorClasseA.class);
			crit.add(Restrictions.eq("idLeitorA", id));
			crit.setMaxResults(1);
			LeitorClasseA leitorClasseA = (LeitorClasseA) crit.uniqueResult();
			return (LeitorClasseA) leitorClasseA;
		} catch (RuntimeException erro) 
		{		throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public LeitorClasseA buscarCpf(String CPF) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(LeitorClasseA.class);
			crit.add(Restrictions.eq("CPF", CPF));
			crit.setMaxResults(1);
			LeitorClasseA leitorClasseA = (LeitorClasseA) crit.uniqueResult();
			return (LeitorClasseA) leitorClasseA;
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
		{	Criteria crit = session.createCriteria(LeitorClasseA.class);
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
