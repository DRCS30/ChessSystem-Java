package boardgame;

public class Piece {

		protected Position position;
		private Board board; //rows + collomns + pieces (sua posi��o)
		
		
		public Piece(Board board) {
			
			this.board = board;
		}
		public Board getBoard() {
			return board;
		}
			
		
}
