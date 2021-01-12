
public class CEP {
	
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	private String sigla;
	private long cep;
	
	
	public CEP(String logradouro, String bairro, String cidade,
			String uf, String sigla, long cep) {
		
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.sigla = sigla;
		this.cep = cep;
	}
	
	
	public long getCep() {
		
		return this.cep;
	}
	
	
	@Override
	public String toString() {
		
		return "Logradouro: " + logradouro + "\nBairro: " + bairro +
				"\nCidade: " + cidade + "\nUF: " + uf +
				"\nSigla: " + sigla + "\nCEP: " + cep;
	}
}