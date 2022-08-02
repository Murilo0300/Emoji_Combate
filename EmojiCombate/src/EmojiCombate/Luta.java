package EmojiCombate;
import java.util.Random;


public class Luta {
	
	private Lutador desafiado; // tipo abstrato de dado
	private Lutador desafiante; // desafiado e desafiado é uma instância da classe lutador
	private int round;
	private boolean aprovada;
	
	//metodos especias
	
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	//metodos feitos
	
	/* regras das lutas
	 * 1 - Só podem ser marcadas entre lutadores da mesma categoria
	 * 2 - Desafiado e desafiante devem ser lutadores diferentes
	 * 3 - Só podem acontecer, se a luta estiver aprovada
	 * 4 - Só pode ter resultado com vitória ou empate de um dos lutadores*/
	
	
	
	public void marcarLuta(Lutador L1 , Lutador L2) {
		if((L1.getCategoria() == L2.getCategoria())&&(L1 != L2)) {
			
			this.setAprovada(true);
			this.setDesafiado(L1);
			this.setDesafiante(L2);	
			
		}else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar() {
		
		if (this.isAprovada() == true ) {
			System.out.print("desafiante: ");
			this.desafiado.status();
		
			System.out.print("\n desafiado: ");
			this.desafiante.status();

			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
	
			
			switch(vencedor) {
			case 0:
				System.out.println("\nEMPATOU");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				
				System.out.print(desafiado + " ganhou a luta");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2:
				System.out.print(desafiante + " ganhou a luta");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;

			}	
			
		}
		else {
			System.out.println("Não pode haver luta");
		}
		
	}

}
