package OO4;

import java.util.Date;

public class Animal {
	
	private int id;
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private char sexo;
	private String especie;
	private String raca;
	private int quantidadePatas;
	private String tipoPelo;
	private double peso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getQuantidadePatas() {
		return quantidadePatas;
	}
	public void setQuantidadePatas(int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}
	public String getTipoPelo() {
		return tipoPelo;
	}
	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void andar() {
		System.out.println("adando...");
	}
	public void dormir() {
		System.out.println("dormindo...");
	}
	public void comer() {
		System.out.println("comendo...");
	}
	public void respirar() {
		System.out.println("respirando...");
	}
	public void brincar() {
		System.out.println("brincando...");
	}
}
