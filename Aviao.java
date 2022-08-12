import java.util.ArrayList;

//atributos
public class Aviao{

	private String modelo;
	private String identificador;
	private Motor motorEsquerdo;// classe do tipo Motor
	private Motor motorDireito;// classe do tipo Motor
	private float altura;
	private float velocidade;
	private boolean emVoo;
	private boolean estadoMotor;
	private float acelerar;
	private float desacelerar;
	private Passageiro[] ListaPassageiros;
	private boolean adicionarPassageiro;
	private String buscarPassageiroPorCPF;
	private int ind;
	private ArrayList<Passageiro> ListaPassageiros2;

	// construtor que inicializa o objeto "Aviao" com os seguintes atributos:
	Aviao(String novoM, String novoId, Motor novoMotorEsquerdo, Motor novoMotorDireito){
		this.setModelo(novoM);
		this.setIdentificador(novoId);
		this.setAltura(0.0f);
		this.setVelocidade(0.0f);
		this.setEmVoo(false);
		this.setMotorEsquerdo(novoMotorEsquerdo);
		this.setMotorDireito(novoMotorDireito);
		this.ind = 0;
		this.ListaPassageiros = new Passageiro[100];
		this.ListaPassageiros2 = new ArrayList<Passageiro>();
	}

	// get retorna o valor de um atributo 
	public String getModelo(){
		return this.modelo;
	}
	// set possibilita alteração do valor do atributo
	public void setModelo(String novoValor){
		this.modelo = novoValor;
	}

	public String getIdentificador(){
		return this.identificador;
	}
	public void setIdentificador(String novoValor){
		this.identificador = novoValor;
	}

	public Motor getMotorEsquerdo(){
		return this.motorEsquerdo;
	}
	public void setMotorEsquerdo(Motor novoValor){
		this.motorEsquerdo = novoValor;
	}

	public Motor getMotorDireito(){
		return this.motorDireito;
	}
	public void setMotorDireito(Motor novoValor){	
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

	public void ligarMotor(){
		this.getMotorEsquerdo().Ligar();//método ligar do objeto do tipo motor
		this.getMotorDireito().Ligar();
	}

	public void desligarMotor(){
		this.getMotorEsquerdo().Desligar();////método desligar do objeto do tipo motor
		this.getMotorDireito().Desligar();
	}

	public boolean getEstadoMotor(){
		if(this.getMotorEsquerdo().getAtivo() & this.getMotorDireito().getAtivo()){
			return true;
		}
		else{
			return false;
		}	
	}
	public void setEstadoMotor(boolean novoValor){
		this.estadoMotor = novoValor;
	}

	public void imprimeEstadoMotor(){ 
		if(this.getMotorEsquerdo().getAtivo() & this.getMotorDireito().getAtivo()){ 
			System.out.println("Os motores estão ligados.."); 
		} else if (this.getMotorEsquerdo().getAtivo()){ 
			System.out.println("Somento o motor Esquerdo está ligado.."); 
		} else if (this.getMotorDireito().getAtivo()){ 
			System.out.println("Somente o motor Direito está ligado.."); 
		} else {
			System.out.println("Os motores estão desligados.."); 
		}
	}


	public void acelerar(){
		if(this.getEstadoMotor()){
				//nao esquecer que tem que inicializar no construtor do Motor.java
				//this.setVelocidade(this.getVelocidade() + (this.getMotorEsquerdo().getPotencia()+this.getMotorDireito().getPotencia()));
				this.setVelocidade(this.getVelocidade() + 100.0f);
				System.out.println("Aviao a "+this.getVelocidade()+" km/h");
		}else if (this.getMotorEsquerdo().getAtivo() || this.getMotorDireito().getAtivo()){
				this.setVelocidade(this.getVelocidade() + 50.f);
				System.out.println("Aviao a "+this.getVelocidade()+" km/h");
		}
		else{
			System.out.println("ERRO: Motor desligado");
		}
		this.atualizarStatusVoo();
	}

	
	public void desacelerar(){
		if(this.getEstadoMotor()){
			if (this.getVelocidade()> 0.0f){
				this.setVelocidade(this.getVelocidade() - 100.0f);
			}
			System.out.println("Aviao a "+this.getVelocidade()+" km/h");
		}else if (this.getMotorEsquerdo().getAtivo() || this.getMotorDireito().getAtivo()){
			if (this.getVelocidade()> 0.0f){
				this.setVelocidade(this.getVelocidade() - 50.f);
			}
			System.out.println("Aviao a "+this.getVelocidade()+" km/h");
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
	
	public boolean adicionarPassageiro(Passageiro novoValor){
		if (this.getVelocidade() > 0.0f){
			System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
			return false;
		}
		else {
			/*int tam = ListaPassageiros2.size();
			for(int i = 0; i < 5; i++){
				System.out.println("Estou imprimindo um cara: "+ListaPassageiros2.get(i).getPrimeiroNome());
				System.out.println("numero do i "+i+" Size da minha lista "+tam);
				System.out.println("eu sou a vez de numero .. "+i);
				System.out.println("\nembarcando: "+ListaPassageiros2.get(i).getPrimeiroNome());
				if(ListaPassageiros2.get(i) != null){
					System.out.println("\n"+ListaPassageiros2.get(i).getPrimeiroNome()+" "+ListaPassageiros2.get(i).getUltimoNome()+"embarcou na aeronave!" );
				}
			}*/
				this.ListaPassageiros2.add(novoValor);
				
				if(ListaPassageiros2.size()==5){
					System.out.println("\nTodos embarcaram :)");
					System.out.println("\n");
				}
			return true;
		}
	}


	public Passageiro getBuscarPassageiroPorCPF(String novoValor){
		for (int i = 0; i < 5;i++){
			//System.out.println("Passageiros"+ListaPassageiros2.get(i).getPrimeiroNome());
			if(novoValor == ListaPassageiros2.get(i).getCPF()){
				System.out.println("\nPassageiro"+" "+ ListaPassageiros2.get(i).getPrimeiroNome()+" "+"à bordo:");
				//return referencia para o objeto passageiro cujo atributo CPF é igual ao valor CPF recebido 
				return this.ListaPassageiros2.get(i);
			}
		}
		System.out.println("Passageiro não encontrado");
		return null;
	}

	public void setBuscarPassageiroPorCPF(String novoValor){
		this.buscarPassageiroPorCPF = novoValor;
	}


	public void imprimirListaDePassageiros(){
		//System.out.println(this.ListaPassageiros2.size());
		System.out.println("\nPassageiros à bordo:");
		for (int i = 0; i < this.ListaPassageiros2.size(); i++){
			//System.out.println("Estrou na posicao: "+i);
			//System.out.println("\n"+ListaPassageiros2.get(i).getPrimeiroNome()+" "+ListaPassageiros2.get(i).getUltimoNome()+" embarcou da aeronave!");
			System.out.println("\nNome: "+ListaPassageiros2.get(i).getPrimeiroNome()+" "+ListaPassageiros2.get(i).getUltimoNome()+ 
							"\nCPF: "+ListaPassageiros2.get(i).getCPF());
		}	
		System.out.println("\n");
	}

	public void desembarcarPassageiros(){
		if (this.getVelocidade() > 0.0f){
			System.out.println("Aviao a "+this.getVelocidade()+" km/h");
			System.out.println("\nProtocolos de segurança não permitem desembarques com a aeronave em movimento");
			System.out.println("\n");
		}
		else {
			int tam = ListaPassageiros2.size();
			for(int i = tam-1; i >= 0; i--){
				//System.out.println("Estou imprimindo um cara: "+ListaPassageiros2.get(i).getPrimeiroNome());
				//System.out.println("numero do i "+i+" Size da minha lista "+tam);
				//System.out.println("eu sou a vez de numero .. "+i);
				//System.out.println("\nDesembarcando: "+ListaPassageiros2.get(i).getPrimeiroNome());
				System.out.println("\n"+ListaPassageiros2.get(i).getPrimeiroNome()+" "+ListaPassageiros2.get(i).getUltimoNome()+" desembarcou da aeronave!");
				ListaPassageiros2.remove(ListaPassageiros2.get(i));
			
				if(ListaPassageiros2.size()==0){
					System.out.println("\nTodos desembarcaram :)");
					System.out.println("\n");
				}
			}
		}
	}

	public void imprimaOk(){
		System.out.println("Ok");
	}

		//Método AdicionarPassageiro usando Get Set
	/*public boolean getAdicionarPassageiro(Passageiro novoValor){
		if(this.getVelocidade() > 0.0f){ //Motores ligados
			System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
			return (false);
		}
		else{
			this.setAdicionarPassageiro(novoValor);
			return (true);
		}
	}
	public void setAdicionarPassageiro(Passageiro novoValor){
		//this.ListaPassageiros[ind++] = novoValor; //serve para inserir no Array
		this.ListaPassageiros2.add(novoValor);
	}*/

}