package dao;

import javax.security.auth.login.Configuration;
import javax.transaction.Transaction;
import model.LeitorClasseB;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import antlr.collections.List;

public class LeitorClasseBDao 
{	
	public void salvar(LeitorClasseB leitorClasseB) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	session.beginTransaction();
			session.save(leitorClasseB);
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

	public void excluir(LeitorClasseB leitorClasseB) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.delete(leitorClasseB);
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
	
	public void atualizar(LeitorClasseB leitorClasseB) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.update(leitorClasseB);
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
		{	Criteria consulta = session.createCriteria(LeitorClasseB.class);
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
		{	Criteria crit = session.createCriteria(LeitorClasseB.class);
			crit.add(Restrictions.eq("nome", nome));
			List list = (List) crit.list();
			return list;
		} catch (RuntimeException erro)
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public LeitorClasseB buscarLeitorClasseB(int id) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(LeitorClasseB.class);
			crit.add(Restrictions.eq("idLeitorB", id));
			crit.setMaxResults(1);
			LeitorClasseB leitorClasseB = (LeitorClasseB) crit.uniqueResult();
			return (LeitorClasseB) leitorClasseB;
		} catch (RuntimeException erro) 
		{		throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public LeitorClasseB buscarCpf(String CPF) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(LeitorClasseB.class);
			crit.add(Restrictions.eq("CPF", CPF));
			crit.setMaxResults(1);
			LeitorClasseB leitorClasseB = (LeitorClasseB) crit.uniqueResult();
			return (LeitorClasseB) leitorClasseB;
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
		{	Criteria crit = session.createCriteria(LeitorClasseB.class);
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
