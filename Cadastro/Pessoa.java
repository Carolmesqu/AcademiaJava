package CincoCinco;
		
public class Pessoa {
	public String nome;
	public String idade;
	public String telefone;
	
	public void configuraDadosPessoa(String nomePessoa, String idadePessoa, String telefonePessoa) {
		this.nome = nomePessoa;
		this.idade = idadePessoa;
		this.telefone = telefonePessoa;
			
		}
	
	public void exibirDadosPessoa() {
		System.out.print("Nome: " + nome);
		System.out.print("Idade: " + idade);
		System.out.print("Telefone: " + telefone);
		
	}
	
	

}


//Uma empresa est� cadastrando seus funcion�rios em sua base de dados. 
//Sabendo que Funcionario � uma Pessoa, e que pessoas possuem (nome, idade e telefone), 
//e que seus funcion�rios s�o divididos por (setor, cargo e fun��o). Crie uma classe execut�vel, 
//e cadastre 3 funcion�rios, preferencialmente solicitando as informa��es via console ao usu�rio. 
//Ap�s esse cadastro, exiba esses funcion�rios na tela. A classe Funcionario deve herdar as caracter�sticas da classe Pessoa. 