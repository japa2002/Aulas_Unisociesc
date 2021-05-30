package OO3;

import java.util.Date;

public class Carro {
	
	private int id;
	private String marca;
	private String motor;
	private String modelo;
	private Date dataFabricante;
	private double peso;
	private int quantidadeMarcha;
	private int quantidadePorta;
	private String placa;
	private String cor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getDataFabricante() {
		return dataFabricante;
	}
	public void setDataFabricante(Date dataFabricante) {
		this.dataFabricante = dataFabricante;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getQuantidadeMarcha() {
		return quantidadeMarcha;
	}
	public void setQuantidadeMarcha(int quantidadeMarcha) {
		this.quantidadeMarcha = quantidadeMarcha;
	}
	public int getQuantidadePorta() {
		return quantidadePorta;
	}
	public void setQuantidadePorta(int quantidadePorta) {
		this.quantidadePorta = quantidadePorta;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void ligar() {
		System.out.println("ligando...");
	}
	public void desligar() {
		System.out.println("desligando...");
	}
	public void acelerar() {
		System.out.println("acelerando...");
	}
	public void frear() {
		System.out.println("freando...");
	}
	public void abastecer() {
		System.out.println("abastecendo...");
	}
	
}
