package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public abstract class Livro 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idLivro;
	@Column
	private String nome;
	@Column
	private String dataDaEdicao;
	@Column
	private Autor autor;
	
	public int getIdLivro() 
	{
		return idLivro;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getDatadaEdicao() 
	{
		return dataDaEdicao;
	}
	
	public void setDatadaEdicao(String datadaEdicao) 
	{
		this.dataDaEdicao = datadaEdicao;
	}
	
	public Autor getAutor() 
	{
		return autor;
	}
	
	public void setAutor(Autor autor) 
	{
		this.autor = autor;
	}
	
}
