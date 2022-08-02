 package EmojiCombate;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	//metodos especiais
	
	public Lutador(String no, String na, int id, float al, float pe, 
			int vi, int de,int em ) {
		
		nome = no;
		nacionalidade = na;
		idade = id;
		altura = al;
		setPeso(pe);
		vitorias = vi;
		derrotas = de;
		empates = em;

	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int id) {
		this.idade = id;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float al) {
		this.altura = al;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {

		if(this.peso <52.2) {
			this.categoria ="Inválido";
			
		}else if((this.peso >= 70.3) && (this.peso < 83.9)){
			this.categoria = "Peso Leve";
			
		}else if((this.peso >= 83.9) && (this.peso < 120.2) ) {
			this.categoria = "Peso Médio";
			
		}else if(this.peso >= 120.2) {
			this.categoria = "Peso Pesado";
			
		}else {
			this.categoria = "inválido";
		}

	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	// metodos construídos  // 
	
	public void apresentar() {
		System.out.println("----APRESENTAÇÃO-----");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Categoria " + this.getCategoria());
		System.out.println("Cartel: "+ this.getVitorias() + "V, " + this.getDerrotas() + "D, " + this.getEmpates() + "E");
		
	}

	public void status() {
		
		System.out.println("\n------RESUME-----");
		System.out.print("Cartel de " + this.getNome()+ ": ");
		System.out.print(this.getVitorias() + " Vitórias, ");
		System.out.print(this.getDerrotas() + " Derrotas e ");
		System.out.print(this.getEmpates() + " Empates ");
		
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1 );	
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);

	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

}
