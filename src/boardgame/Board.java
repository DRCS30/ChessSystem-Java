package boardgame;

public class Board {
	
	//contem linhas, colunas e o objeto peça que ocupará linha e coluna do tabuleiro especifica da peça (board).
	//o objeto peça contem o tabuleiro e o objeto posição, que corresponde a peça especifica
	//por sua vez o objeto posição contem linhas e colunas para a jogada
	
	private Integer rows;
	private Integer Collumns;
	private Piece[][] pieces;
	
	
	
	
	public Board() {
		
	}


	public Board(Integer rows, Integer collumns) {
		
		this.rows = rows;
		this.Collumns = collumns;
		pieces=new Piece[rows][collumns]; //posição inicial da peça
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

}
