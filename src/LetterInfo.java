public class LetterInfo {
    private int [][] values = new int [26][2];
    private int tileCount = 100;
    LetterInfo(){
        values[0][0] = 1;
        values[1][0] = 3;
        values[2][0] = 3;
        values[3][0] = 2;
        values[4][0] = 1;
        values[5][0] = 4;
        values[6][0] = 2;
        values[7][0] = 4;
        values[8][0] = 1;
        values[9][0] = 8;
        values[10][0] = 5;
        values[11][0] = 1;
        values[12][0] = 3;
        values[13][0] = 1;
        values[14][0] = 1;
        values[15][0] = 3;
        values[16][0] = 10;
        values[17][0] = 1;
        values[18][0] = 1;
        values[19][0] = 1;
        values[20][0] = 1;
        values[21][0] = 4;
        values[22][0] = 4;
        values[23][0] = 8;
        values[24][0] = 4;
        values[25][0] = 10;
        values[0][1] = 9;
        values[1][1] = 2;
        values[2][1] = 2;
        values[3][1] = 4;
        values[4][1] = 12;
        values[5][1] = 2;
        values[6][1] = 3;
        values[7][1] = 2;
        values[8][1] = 9;
        values[9][1] = 1;
        values[10][1] = 1;
        values[11][1] = 4;
        values[12][1] = 2;
        values[13][1] = 6;
        values[14][1] = 8;
        values[15][1] = 2;
        values[16][1] = 1;
        values[17][1] = 6;
        values[18][1] = 4;
        values[19][1] = 6;
        values[20][1] = 4;
        values[21][1] = 2;
        values[22][1] = 2;
        values[23][1] = 1;
        values[24][1] = 2;
        values[25][1] = 1;
    }//holds the value of the letters in y index 0 and the number of these tiles in y index 1
    public char drawLetter(){
        int selectNumber = (int)(Math.random()*tileCount);
        --tileCount;
        char toReturn = 0;
        for(toReturn = 0; (toReturn < 26) && (selectNumber >= 0); ++toReturn){
            selectNumber-=values[toReturn][1];
        }
        if(toReturn<26) {
            --values[toReturn][1];
            return (char) (toReturn + 65);
        }
        return ' ';
    }

    public int getValue(char toLookup){
        return values[toLookup-65][0];
    }
}
