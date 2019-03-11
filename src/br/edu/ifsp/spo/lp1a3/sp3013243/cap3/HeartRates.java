package br.edu.ifsp.spo.lp1a3.sp3013243.cap3;

public class HeartRates {
	
	
	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano){
		this.nome=nome;
        this.sobrenome=sobrenome;
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
	}
	
	
	private String nome;
	
	private String sobrenome;
	
	private int dia;
	
	private int mes;
	
	private int ano;
	
	private int idade;
	
	private double freqMax;
	
	
	 	public String getNome() {
	 		return nome;
	    }

	    public String getSobrenome() {
	    	return sobrenome;
	    }

	    public int getDia() {
	        return dia;
	    }

	    public int getMes() {
	        return mes;
	    }

	    public int getAno() {
	        return ano;
	    }

	    public int getIdade() {
	    	return idade;
	    }
	    
	    public double getFreq() {
	    	return freqMax;
	    }
	
	    public void setNome (String nome) {
	        this.nome=nome;
	    }

	    public void setSobrenome (String sobrenome) {
	        this.sobrenome=sobrenome;
	    }

	    public void setDia (int dia) {
	        this.dia=dia;
	    }

	    public void setMes (int mes) {
	        this.mes=mes;
	    }

	    public void setAno (int ano) {
	        this.ano=ano;
	    }

	    public void setFreq (double freq) {
	        this.freqMax=freq;
	    }
	
	public int calcularIdade(int ano) {
	
	int idade;
	
	idade = 2019 - ano; 
	
	return idade;
}
	
	public double calcularFrequencia(int idade) {
		
		double freqMax;
		
		freqMax = 220 - idade;
		
		return freqMax;
	}
	
	public double mediaFreqMenor(double freqMax) {
		double media1;
		
		media1 = freqMax * 0.5;
		
		return(media1);
	}
	
	public double mediaFreqMaior(double freqMax) {
		double media2;
		
		media2 = freqMax * 0.85;
		
		return(media2);
	}
	
}
