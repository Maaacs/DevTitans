public class Motor{

	private String modelo;
	private float potencia;
	private boolean ativo;



		// get retorna o valor de um atributo 
	public String getModelo(){
		return this.modelo;
	}
	// set possibilita alteração do valor do atributo
	public void setModelo(String novoValor){
		this.modelo = novoValor;
	}

	public float getPotencia(){
		return this.potencia;
	}
	public void setPotencia(String novoValor){
		this.potencia = novoValor;
	}

	public boolean getAtivo(){
		return this.ativo;
	}
	public void setAtivo(boolean novoValor){
		this.ativo = novoValor;
	}
}