package model;

public class Assinatura 
{	
	private ILeitorClasseA leitorClasseA;
	
	private ILeitorClasseB leitorClasseB;
	
	private ILeitorClasseC leitorClasseC;
		
	private Livro livro;
	
	public Assinatura(ILeitorClasseA leitorClasseA, ILeitorClasseB leitorClasseB,
						ILeitorClasseC leitorClasseC, Livro livro)
	{	
		this.leitorClasseA = leitorClasseA;
		this.leitorClasseB = leitorClasseB;
		this.leitorClasseC = leitorClasseC;
		this.livro = livro;
	}

	public ILeitorClasseA getLeitorClasseA() 
	{
		return leitorClasseA;
	}

	public void setLeitorClasseA(ILeitorClasseA leitorClasseA) 
	{
		this.leitorClasseA = leitorClasseA;
	}

	public ILeitorClasseB getLeitorClasseB() 
	{
		return leitorClasseB;
	}

	public void setLeitorClasseB(ILeitorClasseB leitorClasseB) 
	{
		this.leitorClasseB = leitorClasseB;
	}

	public ILeitorClasseC getLeitorClasseC() 
	{
		return leitorClasseC;
	}

	public void setLeitorClasseC(ILeitorClasseC leitorClasseC) 
	{
		this.leitorClasseC = leitorClasseC;
	}
	
	public Livro getLivro()
	{
		return livro;
	}
}