class chess
{
    public static void main(String args[])
 {  
        int row = 8;
        int col = 8;
        String[][] chess = new String[row][col];


        chess[0][0] = "♜  ";
        chess[0][1] = "♞  ";
        chess[0][2] = "♝  ";
        chess[0][3] = "♛  ";
        chess[0][4] = "♚  ";
        chess[0][5] = "♝  ";
        chess[0][6] = "♞  ";
        chess[0][7] = "♜  ";
        
        chess[1][0] = "♟︎  ";
        chess[1][1] = "♟︎  ";
        chess[1][2] = "♟︎  ";
        chess[1][3] = "♟︎  ";
        chess[1][4] = "♟︎  ";
        chess[1][5] = "♟︎  ";
        chess[1][6] = "♟︎  ";
        chess[1][7] = "♟︎  ";

        chess[2][0] = "⬜  ";
        chess[2][1] = "  ";
        chess[2][2] = "⬜  ";
        chess[2][3] = "  ";
        chess[2][4] = "⬜  ";
        chess[2][5] = "  ";
        chess[2][6] = "⬜  ";
        chess[2][7] = "  ";

        chess[3][0] = "  ";
        chess[3][1] = "⬜  ";
        chess[3][2] = "  ";
        chess[3][3] = "⬜  ";
        chess[3][4] = "  ";
        chess[3][5] = "⬜  ";
        chess[3][6] = "  ";
        chess[3][7] = "⬜  ";

        chess[4][0] = "⬜  ";
        chess[4][1] = "  ";
        chess[4][2] = "⬜  ";
        chess[4][3] = "  ";
        chess[4][4] = "⬜  ";
        chess[4][5] = "  ";
        chess[4][6] = "⬜  ";
        chess[4][7] = "  ";
        
        chess[5][0] = "  ";
        chess[5][1] = "⬜  ";
        chess[5][2] = "  ";
        chess[5][3] = "⬜  ";
        chess[5][4] = "  ";
        chess[5][5] = "⬜  ";
        chess[5][6] = "  ";
        chess[5][7] = "⬜  ";
        
        chess[6][0] = "♙  ";
        chess[6][1] = "♙  ";
        chess[6][2] = "♙  ";
        chess[6][3] = "♙  ";
        chess[6][4] = "♙  ";
        chess[6][5] = "♙  ";
        chess[6][6] = "♙  ";
        chess[6][7] = "♙  ";

        chess[7][0] = "♖  ";
        chess[7][1] = "♘  ";
        chess[7][2] = "♗  ";
        chess[7][3] = "♕  ";
        chess[7][4] = "♔  ";
        chess[7][5] = "♗  ";
        chess[7][6] = "♘  ";
        chess[7][7] = "♖  ";


        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < col; c++)
            {
                System.out.print(chess[r][c]);
            }
           System.out.print("\n");
        }
    }

}