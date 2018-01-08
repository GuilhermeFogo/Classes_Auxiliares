package Pacotes;

public class Contatos {
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private long id;
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return getNome();
	}
}
