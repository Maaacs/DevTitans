class AguiaGigante implements Motorizavel{
	float peso;
	String nome;
	float forca;
	boolean acordada;


	AguiaGigante (float NovoPeso, String NovoNome, float NovoForca, boolean NovoAcordada){
		this.setPeso(NovoPeso);
		this.setNome(NovoNome);
		this.setForca(NovoForca);
		this.setAcordada(true);
	}

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public float getForca() {
        return forca;
    }

    private void setForca(float forca) {
        this.forca = forca;
    }

    public boolean getAcordada() {
        return acordada; // o método getAtivo() deve retornar o valor recebido pelo getAcordada()
    }

    private void setAcordada(boolean acordada) {
        this.acordada = acordada;
    }

    public boolean getAtivo(){
    	return this.getAcordada();
    }

    /*if this.getAcordada(){
    	return this.getForca(); // sem tempo pra corrigir esse problem irmão rsrs
    }else {
    	return 0;
    }*/

    public float getPotencia(){
    	return (this.getAcordada() == true ? this.getForca() : 0); //com operador ternário foi mais liso rs
    }

    public void ligar(){
    	setAcordada(true);
    	System.out.println("GRAUINNNNN");
    } 
    public void desligar(){
    	setAcordada(false);
    	System.out.println("Zzzzzz");
    }


}