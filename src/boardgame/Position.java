package boardgame;

//camada do tabuleiro
public class Position {
	
	//linhas e colunas da posi��o incial da pe�a especifica
	private int row;
	private int collumn;
	
	
	
	public Position() {
		
	}



	public Position(int row, int collumn) {
		
		this.row = row;
		this.collumn = collumn;
	}



	public int getRow() {
		return row;
	}



	public void setRow(int row) {
		this.row = row;
	}



	public int getCollumn() {
		return collumn;
	}



	public void setCollumn(int collumn) {
		this.collumn = collumn;
	}
	
	@Override
	
	public String toString() {
		
		return row + ", " + collumn;
	}

}
