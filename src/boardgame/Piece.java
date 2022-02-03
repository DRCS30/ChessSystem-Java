package boardgame;

//camanda do tabuleiro
public class Piece {

		protected Position position; //é a posição epecifica de cada peça.
		private Board board; //rows + collomns + pieces (sua posição)
		
		
		public Piece(Board board) {
			
			this.board = board;
		}
		protected Board getBoard() { //de uso interno da camada tabuleiro, acessivel apenas a subclasses
									 //das peças especificas + acessivel a classe dentro do mesmo pacote.
			return board;
		}
		
			
		
}
