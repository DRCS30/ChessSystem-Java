package boardgame;

public class Board {
	
	//contem linhas, colunas e o objeto peça que ocupará linha e coluna do tabuleiro especifica da peça (board).
	//o objeto peça contem o tabuleiro e o objeto posição, que corresponde a peça especifica
	//por sua vez o objeto posição contem linhas e colunas para a jogada
	
	private Integer rows;
	private Integer Collumns;
	private Piece[][] pieces;
	
	//são linhas e colunas totais do tabuleiro + as peças que a compoe.
	
	
	public Board() {
		
	}


	public Board(Integer rows, Integer collumns) {
		
		this.rows = rows;
		this.Collumns = collumns;
		pieces=new Piece[rows][collumns]; //posição inicial de cada peça da matriz peça
	}


	public Integer getRows() {
		return rows;
	}


	public void setRows(Integer rows) {
		this.rows = rows;
	}


	public Integer getCollumns() {
		return Collumns;
	}


	public void setCollumns(Integer collumns) {
		Collumns = collumns;
	}

		public Piece piece(Integer row,Integer collumn) {
			
			return pieces[row][collumn];
		}
		
		public Piece piece(Position position) {
			
			return pieces[position.getRow()][position.getCollumn()];
		}
}
