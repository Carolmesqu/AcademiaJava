
public class Moto {
	public String marca;
	public String modelo;
	public String cilindradas;
	
	//fun��o escrever nas variavais
	public void configuraDados(String marcaMoto, String modeloMoto, String cilindradasMoto) {
	this.marca = marcaMoto;
	this.modelo = modeloMoto;
	this.cilindradas = cilindradasMoto;
		
	}
	
//Crie uma classe chamada Moto com tr�s atributos (marca, modelo e cilindradas)
//	e dois m�todos (atribuir valores e retornar valores). 
	
	public void exibirDados() {
		System.out.println("Dados da moto: " + marca + ", " + modelo + " de " + cilindradas + " cilindradas.");
		
	}
		
}
