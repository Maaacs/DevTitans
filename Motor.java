class Motor{

	private String modelo;
	private boolean ativo;
	private float potencia;
	
	
	Motor(String novoM, float novoPot){
		this.setModelo(novoM);
		this.setAtivo(false);
		this.setPotencia(novoPot);
		
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String novoValor){
		this.modelo = novoValor;
	}
		
	public boolean getAtivo(){
		return this.ativo;
	}
	
	private void setAtivo(boolean novoValor){
		this.ativo = novoValor;
	}
	
	public float getPotencia(){
		return this.potencia;
	}
	
	public void setPotencia(float novoValor){
		this.potencia = novoValor;
	}
		
	public void ligar(){
		this.setAtivo(true);
		System.out.println("VRUMMMM");
	}
	
	public void desligar(){
		this.setAtivo(false);
		System.out.println("mmmmm……..");
	}
	
}
