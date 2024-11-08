package connectfour;

public class Board {
	private int rows;
	private int cols;
	private char[][] table;
	
	public Board(int rows,int cols) {
		this.rows=rows;
		this.cols=cols;
		this.table=new char[rows][cols];
		arxikopoihshboard();
	}
	
	
	
	public int getRows() {
		return rows;
	}



	public void setRows(int rows) {
		this.rows = rows;
	}



	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}



	public char[][] getTable() {
		return table;
	}



	public void setTable(char[][] table) {
		this.table = table;
	}



	private void arxikopoihshboard() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				table[i][j]='-';
			}
		}
	}
	
	public boolean putchip(int cols,char chip) {
		for(int i=rows-1;i>=0;i--) {
			if(table[i][cols]=='-') {
				table[i][cols]=chip;
				return true;
			}
		}
		return false;
	}
	
	public boolean fullColumn(int cols) {
		return table[0][cols]!='-';
	}
	
	public boolean fulltable() {
		for(int i=0;i<cols;i++) {
			if(fullColumn(i)) {
				return true;
			}
		}
		return false;
	}
	
	public void printtable() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print("|"+table[i][j]+"|");
			}
			System.out.println("|");
		}
		for(int j=1;j<=cols;j++) {
			System.out.println(" "+ j + " ");
		}
		System.out.println();
		
	}
	
	public boolean horizontalwin(char chip) {
		for(int i=0;i<rows;i++) {
			int count=0;
			for(int j=0;j<cols;j++) {
				if(table[i][j]==chip) {
					count++;
					if(count==4) {
						return true;
					}
				}else {
					count=0;
				}
			}
		}
		return false;
	}
	
	public boolean verticalwin(char chip) {
		for(int j=0;j<cols;j++) {
			int count=0;
			for(int i=0;i<rows;i++) {
				if(table[i][j]==chip) {
					count++;
					if(count==4) {
						return true;
					}
				}else {
					count=0;
				}
			}
		}
		return false;
	}
	
	public boolean  diagonallefttorigth(char chip) {
		for(int i=0;i<=rows-4;i++) {
			for(int j=0;j<=cols-4;j++) {
				if(table[i][j]==chip && table[i+1][j+1]==chip && table[i+2][j+2]==chip && table[i+3][j+3]==chip) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean diagonalrighttoleft(char chip) {
		for(int i=0;i<=rows-4;i++) {
			for(int j=3;j<=cols-4;j++) {
				if (table[i][j] == chip && table[i+1][j-1] == chip && table[i+2][j-2] == chip && table[i+3][j-3] == chip) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean generalwin(char chip) {
		return horizontalwin(chip) || verticalwin(chip) || diagonallefttorigth(chip) || diagonalrighttoleft(chip);
	}
}

