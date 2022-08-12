import java.util.ArrayList;
import java.util.Iterator;

class Aviao{

	private String modelo;
	private String identificador;
	private boolean emVoo;
	private float altura;
	private float velocidade;
	private Motor motorEsquerdo;
	private Motor motorDireito;
	private ArrayList<Passageiro> listaPassageiros;
	
	
	Aviao(String novoM, String novoId,Motor motorE, Motor motorD){
		this.setModelo(novoM);
		this.setIdentificador(novoId);
		this.setAltura(0.0f);
		this.setVelocidade(0.0f);
		this.setEmVoo(false);
		this.setMotorEsquerdo(motorE);
		this.setMotorDireito(motorD);
		listaPassageiros = new ArrayList<Passageiro>();
		
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String novoValor){
		this.modelo = novoValor;
	}
	
	public String getIdentificador(){
		return this.identificador;
	}
	
	public void setIdentificador(String novoValor){
		this.identificador = novoValor;
	}
	
	private Motor getMotorEsquerdo(){
		return this.motorEsquerdo;
	}
	
	private void setMotorEsquerdo(Motor novoValor){
		this.motorEsquerdo = novoValor;
	}
	
	private Motor getMotorDireito(){
		return this.motorDireito;
	}
	
	private void setMotorDireito(Motor novoValor){
		this.motorDireito = novoValor;
	}

	public boolean getEmVoo(){
		return this.emVoo;
	}
	
	private void setEmVoo(boolean novoValor){
		this.emVoo = novoValor;
	}
	
	public float getAltura(){
		return this.altura;
	}
	
	public void setAltura(float novoValor){
		this.altura = novoValor;
	}
	
	public float getVelocidade(){
		return this.velocidade;
	}
	
	public void setVelocidade(float novoValor){
		this.velocidade = novoValor;
	}

	public void imprimaOk(){
		System.out.println("Ok");
	}
	
	public void ligarMotor(){
		this.getMotorEsquerdo().ligar();
		this.getMotorDireito().ligar();
	}
	
	public void desligarMotor(){
		this.getMotorEsquerdo().desligar();
		this.getMotorDireito().desligar();
	}
	
	public boolean adicionarPassageiro(Passageiro novoPassageiro){
		boolean resp = false;
		if (this.getVelocidade() == 0.0f){
			this.listaPassageiros.add(novoPassageiro);			
			resp = true;
		}
		else{
			System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
		}
			
		return resp;	
	}
	
	public void desembarcaPassageiros(){
		int tamLista = listaPassageiros.size();
		int cont = 0;
		if (this.getVelocidade() == 0.0f){
			System.out.println("Passageiros desembacados:"); 
			while (cont < tamLista) {
	      			System.out.println(listaPassageiros.get(0).toString());
	      			listaPassageiros.remove(0);
	      			cont++;
      			}	
		}
		else{
			System.out.println("Protocolos de segurança não permitem desembarques com a aeronave em movimento");
		}
	}
	
	public void imprimirListaDePassageiros(){
		int cont = 0;
		Iterator<Passageiro> iterator = listaPassageiros.iterator();
		 
		System.out.println("Passageiros embacados:"); 
    		while (iterator.hasNext()) {
      			System.out.printf("%d-%s\n", cont, iterator.next().toString());
      			cont++;
    		}
	}
	
	public Passageiro buscaPassageiroPorCpf(String chaveCpf){
		int tamLista = listaPassageiros.size();
		int cont = 0;
		boolean achou = false;
		Passageiro procurado = null;		
	 	while ((cont < tamLista) && (!achou)) {
      			if(listaPassageiros.get(cont).getCpf() == chaveCpf){
      				procurado = listaPassageiros.get(cont);
      			}
      			cont++;
    		}
		return procurado;
	}
	
	public boolean getEstadoMotor(){
		boolean resp = false;
		if (this.getMotorEsquerdo().getAtivo() || this.getMotorDireito().getAtivo()){
			resp = true;
		}	
		return resp;		
	}
	
	
	public void imprimeEstadoMotor(){
		if (this.getMotorEsquerdo().getAtivo() && this.getMotorDireito().getAtivo()){
			System.out.println("Os motores estao ligados..");
		}
		else{
			if (this.getMotorEsquerdo().getAtivo()){
				System.out.println("Somente o motor esquerdo está ativo..");
			}
			else{
				if (this.getMotorDireito().getAtivo()){
					System.out.println("Somente o motor direito está ativo..");
				}
				else{
					System.out.println("Os motores estao desligados....");
				}					
			}	
		}
	}
	
	
	public void acelerar(){
		float motorEsqPt = 0.0f;
		float motorDirPt = 0.0f;
	
		if (this.getMotorEsquerdo().getAtivo()){
			motorEsqPt = this.getMotorEsquerdo().getPotencia();
		}
		
		if (this.getMotorDireito().getAtivo()){
			motorDirPt = this.getMotorDireito().getPotencia();
		}
			
	
		if(this.getEstadoMotor()){
			this.setVelocidade(this.getVelocidade() + motorEsqPt + motorDirPt);
			System.out.printf("Aviao a %.2f km/h \n",this.getVelocidade());
		}
		else{
			System.out.println("ERRO: Motor desligado");
		}
		this.atualizarStatusVoo();		
	}
	
	public void desacelerar(){
		float motorEsqPt = 0.0f;
		float motorDirPt = 0.0f;
	
		if (this.getMotorEsquerdo().getAtivo()){
			motorEsqPt = motorEsqPt + this.getMotorEsquerdo().getPotencia();
		}
		
		if (this.getMotorDireito().getAtivo()){
			motorDirPt = motorDirPt + this.getMotorDireito().getPotencia();
		}
	
	
		if(this.getEstadoMotor()){
		
			if (this.getVelocidade()> 0.0f){
				this.setVelocidade(this.getVelocidade() - motorEsqPt - motorDirPt);
				if (this.getVelocidade()< 0.0f){
					this.setVelocidade(0.0f);
				}
			}
			System.out.printf("Aviao a %.2f km/h \n",this.getVelocidade());
		}
		else{
			System.out.println("ERRO: Motor desligado");
		}
		this.atualizarStatusVoo();
	}
	
	public void atualizarStatusVoo(){
		if(this.getEmVoo()){	
			if (this.getVelocidade() >= 200.0f){
				System.out.println("Estou voando...");
			}
			else{
				this.setEmVoo(false);
				System.out.println("Estou aterrisando...");
			}
		}
		else{
			if (this.getVelocidade() < 200.0f){
				System.out.println("Estou em solo...");
			}
			else{
				this.setEmVoo(true);
				System.out.println("Estou decolando...");
			}			
		}
	
	}
	
	
	
	

}
