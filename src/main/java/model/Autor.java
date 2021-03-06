package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idAutor;
	@Column
	private String nome;
	
	public int getIdAutor() 
	{
		return idAutor;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
}
