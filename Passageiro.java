class Passageiro{

	//atributos
	private String primeiroNome;
	private String ultimoNome;
	private String CPF;

	//construtores
	Passageiro(String NovoPrimeiroNome, String NovoUltimoNome, String NovoCPF){
		this.setPrimeiroNome(NovoPrimeiroNome);
		this.setUltimoNome(NovoUltimoNome);
		this.setCPF(NovoCPF);
	}
	Passageiro(String NovoCPF){
		this.setCPF(NovoCPF);
	}

	//Get Set dos atributos
	public String getPrimeiroNome(){
		return this.primeiroNome;
	}
	public void setPrimeiroNome(String novoValor){
		this.primeiroNome = novoValor;
	}

	public String getUltimoNome(){
		return this.ultimoNome;
	}
	public void setUltimoNome(String novoValor){
		this.ultimoNome = novoValor;
	}

	public String getCPF(){
		return this.CPF;
	}
	public void setCPF(String novoValor){
		this.CPF = novoValor;
	}

}