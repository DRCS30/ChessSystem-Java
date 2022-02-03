package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

		private Color color;

		
		public ChessPiece(Board board, Color color) {
			super(board);
			this.color = color;
		}


		public Color getColor() { //não haverar setter porque a cor não pode ser modificada, apenas acessada.
			
			return color;
		}
		
		
	}
