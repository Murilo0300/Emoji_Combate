package EmojiCombate;



public class Main {

	public static void main(String[] args) {
		
		Lutador L[] = new Lutador[6]; // Lutador L é um vetor de 6 posições
		
		L[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 125.3f,11,2,1);
		 //nome, nacionalidade, idade, altura, peso, vitória, derrotas, empates
		L[1] = new Lutador("PutsCript", "Brasil", 29,1.68f,80.8f,14,2,3);
		
		L[2] = new Lutador("Snapshot","EUA", 35, 1.65f, 80.9f,12,2,1);
		
		L[3] = new Lutador("Dead Shot","Austrália", 28, 1.93f,81.6f,13,0,2);
		
		L[4] = new Lutador("Ufo Cobol","Brasil",37,1.70f,119.3f,5,4,3);
		
		L[5] = new Lutador("Nerdad","EUA",30,1.81f,105.7f,12,2,4);
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(L[1], L[2]);
		UEC01.lutar();
		
		L[1].status();
		L[2].status();
		


	}

}
