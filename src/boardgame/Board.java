package boardgame;

public class Board {
	
	//contem linhas, colunas e o objeto pe�a que ocupar� linha e coluna do tabuleiro especifica da pe�a (board).
	//o objeto pe�a contem o tabuleiro e o objeto posi��o, que corresponde a pe�a especifica
	//por sua vez o objeto posi��o contem linhas e colunas para a jogada
	
	private Integer rows;
	private Integer Collumns;
	private Piece[][] pieces;
	
	
	
	
	public Board() {
		
	}


	public Board(Integer rows, Integer collumns) {
		
		this.rows = rows;
		this.Collumns = collumns;
		pieces=new Piece[rows][collumns]; //posi��o inicial da pe�a
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
