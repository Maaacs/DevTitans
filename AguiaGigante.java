class AguiaGigante{
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
        return acordada;
    }

    private void setAcordada(boolean acordada) {
        this.acordada = acordada;
    }


}