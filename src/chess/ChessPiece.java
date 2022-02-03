package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

		private Color color;

		
		public ChessPiece(Board board, Color color) {
			super(board);
			this.color = color;
		}


		public Color getColor() { //n�o haverar setter porque a cor n�o pode ser modificada, apenas acessada.
			
			return color;
		}
		
		
	}
