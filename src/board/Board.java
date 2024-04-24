package board;

public class Board {
public int size;
public char matrix[][];
public Board(int size,char defaultsymbol){
    this.size=size;
    matrix=new char [size][size];
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            matrix[i][j]=defaultsymbol;
        }
    }
}

public void setDefaultSymbol(char symbol) {  //anotherway to initialise with default symbol
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            matrix[i][j]=symbol;
        }
    }
}

public void printBoardConfig() {
    int sz=this.size;

    for(int i=0;i<sz;i++){
        for(int j=0;j<sz;j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

}
}
