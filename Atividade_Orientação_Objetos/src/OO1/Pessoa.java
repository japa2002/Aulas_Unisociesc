package OO1;

public class Pessoa {
	
	private int id;
	private String nome;
	private String sobrenome;
	private String telefone;
	private String cpf;
	private String email;
	private String endereco;
	private String dataNascimento;
	private char sexo;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public void andar() {
		System.out.println("andando...");
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
	public void pagarImposto() {
		System.out.println("pagandando Imposto...");
	}
	
}
