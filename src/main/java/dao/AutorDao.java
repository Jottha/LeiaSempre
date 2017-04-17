package dao;

import javax.security.auth.login.Configuration;
import javax.transaction.Transaction;
import model.Autor;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import antlr.collections.List;

public class AutorDao 
{	
	public void salvar(Autor autor) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(autor);
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

	public void excluir(Autor autor) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.delete(autor);
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

	public void atualizar(Autor autor) throws Exception 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.update(autor);
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
	public List<Autor> listar() 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria consulta = session.createCriteria(Autor.class);
			List<Autor> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) 
		{	throw erro;
		} finally {
			session.close();
		}
	}

	public List<Autor> buscarNome(String nome) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(Autor.class);
			crit.add(Restrictions.eq("nome", nome));
			List list = (List) crit.list();
			return list;
		} catch (RuntimeException erro)
		{	throw erro;
		} finally 
		{	session.close();
		}
	}
	
	public Autor buscarAutor(int id) 
	{	SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try 
		{	Criteria crit = session.createCriteria(Autor.class);
			crit.add(Restrictions.eq("idAutor", id));
			crit.setMaxResults(1);
			Autor autor = (Autor) crit.uniqueResult();
			return (Autor) autor;
		} catch (RuntimeException erro) 
		{		throw erro;
		} finally 
		{
			session.close();
		}
	}

}
