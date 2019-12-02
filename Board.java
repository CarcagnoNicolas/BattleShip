class Board {
    private int         mLength ;
    private String[][]  mBoard ;

    public Board(int pLength) {
        setLength(pLength) ;
        init() ;
    }

    private void setLength(int pLength) {
        mLength = pLength ;
    }

    private void init() {
        mBoard = new String[mLength][mLength] ;
        for (int i = 0 ; i < mLength ; ++i)
            for (int j = 0 ; j < mLength ; ++j)
                mBoard[i][j] = " " ;
    }

    public void displayBoard() {
        Character rowValue = 'A' ;
        System.out.print("  ");
        for (int columnValue = 0 ; columnValue < mLength ; ++columnValue)
            System.out.print(columnValue + " ") ;
        System.out.print("\n");
        for (int i = 0 ; i < mLength ; ++i) {
            System.out.print(" ") ;
            for(int k = 0 ; k < mLength*2-1 ; ++k)
                System.out.print("-") ;
                System.out.print("\n") ;
            for (int j = 0 ; j < mLength ; ++j) {
                if (j == 0) {
                    System.out.print(rowValue++) ;
                    System.out.print("|") ;
                }
                System.out.print(mBoard[i][j]) ;
                System.out.print("|") ;
            }
            System.out.print("\n") ;
        }
    }

}
