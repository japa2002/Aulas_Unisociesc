package OO2;

import java.util.Date;

public class Conta {
	
	private int numero;
	private int digito;
	private double saldo;
	private double limite;
	private String cliente;
	private int agencia;
	private int banco;
	private String tipo;
	private boolean cheque;
	private Date dataAbertura;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getBanco() {
		return banco;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isCheque() {
		return cheque;
	}
	public void setCheque(boolean cheque) {
		this.cheque = cheque;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public void sacar() {
		System.out.println("sacandando...");
	}
	public void depositar() {
		System.out.println("depositando...");
	}
	public void tranferir() {
		System.out.println("tranferindo...");
	}
	public void constarSaldo() {
		System.out.println("consultando...");
	}
	public void pagarBoleto() {
		System.out.println("pagandando boleto...");
	}
}
