public class ScrabbleBoard {
    private Tile [][] board = new Tile[15][15];
    ScrabbleBoard(){
        board[0][0].setWordMultiplier(3);
        board[3][0].setLetterMultiplier(2);
        board[7][0].setWordMultiplier(3);
        board[11][0].setLetterMultiplier(2);
        board[14][0].setWordMultiplier(3);
        board[1][1].setWordMultiplier(2);
        board[5][1].setLetterMultiplier(3);
        board[9][1].setLetterMultiplier(3);
        board[13][1].setWordMultiplier(2);
        board[2][2].setWordMultiplier(2);
        board[6][2].setLetterMultiplier(3);
        board[8][2].setLetterMultiplier(3);
        board[12][2].setWordMultiplier(2);
        board[0][3].setLetterMultiplier(2);
        board[3][3].setWordMultiplier(2);
        board[7][3].setLetterMultiplier(2);
        board[11][3].setWordMultiplier(2);
        board[14][3].setLetterMultiplier(2);
        board[4][4].setWordMultiplier(2);
        board[10][4].setWordMultiplier(2);
        board[1][5].setLetterMultiplier(3);
        board[5][5].setLetterMultiplier(3);
        board[9][5].setLetterMultiplier(3);
        board[13][5].setLetterMultiplier(3);
        board[2][6].setLetterMultiplier(2);
        board[6][6].setLetterMultiplier(2);
        board[8][6].setLetterMultiplier(2);
        board[12][6].setLetterMultiplier(2);
        board[0][7].setWordMultiplier(3);
        board[3][7].setLetterMultiplier(2);
        board[11][7].setLetterMultiplier(2);
        board[14][7].setWordMultiplier(3);
        board[0][14].setWordMultiplier(3);
        board[3][14].setLetterMultiplier(2);
        board[7][14].setWordMultiplier(3);
        board[11][14].setLetterMultiplier(2);
        board[14][14].setWordMultiplier(3);
        board[1][13].setWordMultiplier(2);
        board[5][13].setLetterMultiplier(3);
        board[9][13].setLetterMultiplier(3);
        board[13][13].setWordMultiplier(2);
        board[2][12].setWordMultiplier(2);
        board[6][12].setLetterMultiplier(3);
        board[8][12].setLetterMultiplier(3);
        board[12][12].setWordMultiplier(2);
        board[0][11].setLetterMultiplier(2);
        board[3][11].setWordMultiplier(2);
        board[7][11].setLetterMultiplier(2);
        board[11][11].setWordMultiplier(2);
        board[14][11].setLetterMultiplier(2);
        board[4][10].setWordMultiplier(2);
        board[10][10].setWordMultiplier(2);
        board[1][9].setLetterMultiplier(3);
        board[5][9].setLetterMultiplier(3);
        board[9][9].setLetterMultiplier(3);
        board[13][9].setLetterMultiplier(3);
        board[2][8].setLetterMultiplier(2);
        board[6][8].setLetterMultiplier(2);
        board[8][8].setLetterMultiplier(2);
        board[12][8].setLetterMultiplier(2);
    }//marks the locations of letter and word bonuses
    public boolean play(String toPlay, boolean alignmentVertical, int startX, int startY){
        if(startX>14||startX<0||startY>14||startY<0)//if the start location is off the board, the play fails
            return false;
        if(startY+toPlay.length()>14&&alignmentVertical)//if the start is too far along on the y axis, the play fails
            return false;
        if(startX+toPlay.length()>14&&!alignmentVertical)//if the start is too far along on the x axis, the play fails
            return false;
        for(int i=0; i<toPlay.length(); ++i){//tries to step through given string and play each letter of the string on the tiles
            if(alignmentVertical){
                if(!board[startX][startY+i].playLetter(toPlay.charAt(i)))
                    return false;//does not reset play yet
            }
            if(!alignmentVertical){
                if(!board[startX+i][startY].playLetter(toPlay.charAt(i)))
                    return false;//does not reset play yet
            }
        }
        return true;
    }
}
