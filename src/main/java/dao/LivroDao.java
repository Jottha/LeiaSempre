package dao;

import javax.security.auth.login.Configuration;
import javax.transaction.Transaction;
import model.Livro;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import antlr.collections.List;

public class LivroDao
{	public void salvar(Livro livro) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try
		{	session.beginTransaction();
			session.save(livro);
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
	
	public void excluir(Livro livro) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	session.beginTransaction();
			session.delete(livro);
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
	
	public void atualizar(Livro livro) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	session.beginTransaction();
			session.update(livro);
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
		{	Criteria consulta = session.createCriteria(Livro.class);
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
		{	Criteria crit = session.createCriteria(Livro.class);
			crit.add(Restrictions.eq("nome", nome));
			List list = (List) crit.list();
			return list;
		} catch (RuntimeException erro)
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public Livro buscarLivro(int id) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(Livro.class);
			crit.add(Restrictions.eq("idLivro", id));
			crit.setMaxResults(1);
			Livro livro = (Livro) crit.uniqueResult();
			return (Livro) livro;
		} catch (RuntimeException erro) 
		{		throw erro;
		} finally 
		{
			session.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public List buscarDataDaEdicao(String dataDaEdicao) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(Livro.class);
			crit.add(Restrictions.eq("dataDaEdicao", dataDaEdicao));
			List list = (List) crit.list();
			return list;
		} catch (RuntimeException erro) 
		{	throw erro;
		} finally 
		{	session.close();
		}
	}

}
