package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "leitorClasseB")
public class LeitorClasseB extends Pagamento implements ILeitorClasseB
{	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idLeitorB;
	@Column
	private String nome;
	@Column
	private String CPF;
	@Column
	private String situacao;
		
	public LeitorClasseB(int idPagamento, double valor, String forma, 
							int idLeitorB, String nome, String CPF, String situacao) 
	{	
		super(idPagamento, valor, forma);
		this.idLeitorB = idLeitorB;
		this.nome = nome;
		this.CPF = CPF;
		this.situacao = situacao;
	}

	@Override
	public void Pagar(double valor, String forma)
	{
		efetuarPagamento();		
	}

	public int getIdLeitorB() 
	{
		return idLeitorB;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCPF() 
	{
		return CPF;
	}

	public void setCPF(String cpf)
	{
		CPF = cpf;
	}

	public String getSituacao() 
	{
		return situacao;
	}

	public void setSituacao(String situacao) 
	{
		this.situacao = situacao;
	}

	
}
