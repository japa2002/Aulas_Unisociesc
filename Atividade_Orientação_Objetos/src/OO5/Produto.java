package OO5;

import java.util.Date;

public class Produto {
	
	private int codigo;
	private String nome;
	private Date data;
	private double quantidade;
	private String cor;
	private double tamanho;
	private Date vencimento;
	private double qtdeminima;
	private double qtdemaxima;
	private double qtdeseguranca;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public double getQtdeminima() {
		return qtdeminima;
	}
	public void setQtdeminima(double qtdeminima) {
		this.qtdeminima = qtdeminima;
	}
	public double getQtdemaxima() {
		return qtdemaxima;
	}
	public void setQtdemaxima(double qtdemaxima) {
		this.qtdemaxima = qtdemaxima;
	}
	public double getQtdeseguranca() {
		return qtdeseguranca;
	}
	public void setQtdeseguranca(double qtdeseguranca) {
		this.qtdeseguranca = qtdeseguranca;
	}
	
	public void gravar() {
		System.out.println("gravadando...");
	}
	public void excluir() {
		System.out.println("excluindo...");
	}
	public void alterar() {
		System.out.println("alterando...");
	}
	public void entrar() {
		System.out.println("entrando...");
	}
	public void sair() {
		System.out.println("saindo...");
	}
	
}
