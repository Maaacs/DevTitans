class Passageiro{

<<<<<<< HEAD
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
=======
        private String primeiroNome;
        private String ultimoNome;
        private String cpf;
        
        Passageiro(String pNome, String uNome, String novoCpf){
        	this.setPrimeiroNome(pNome);
        	this.setUltimoNome(uNome);
        	this.setCpf(novoCpf);  	
        }

        public String getPrimeiroNome(){
		return this.primeiroNome;	
	}
		
	public void setPrimeiroNome(String novoNome){
		this.primeiroNome = novoNome;	
	}
	
	public String getUltimoNome(){
		return this.ultimoNome;	
	}
		
	public void setUltimoNome(String novoNome){
		this.ultimoNome = novoNome;	
	}
	
	public String getCpf(){
		return this.cpf;	
	}
		
	public void setCpf(String novoNome){
		this.cpf = novoNome;	
	}
	
	public String toString(){
		return ("Nome Completo: " + this.getPrimeiroNome() 
		                    + " " + this.getUltimoNome() 
		               + " CPF: " + this.getCpf());
	}
	
}	
>>>>>>> LAB03
