package boardgame;

//camanda do tabuleiro
public class Piece {

		protected Position position; //� a posi��o epecifica de cada pe�a.
		private Board board; //rows + collomns + pieces (sua posi��o)
		
		
		public Piece(Board board) {
			
			this.board = board;
		}
		protected Board getBoard() { //de uso interno da camada tabuleiro, acessivel apenas a subclasses
									 //das pe�as especificas + acessivel a classe dentro do mesmo pacote.
			return board;
		}
		
			
		
}
