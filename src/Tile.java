public class Tile {
    int letterMultiplier = 1;
    int wordMultiplier = 1;
    char value = 0;
    LetterInfo lookup = new LetterInfo();

    public void setLetterMultiplier(int letterMultiplier) {
        this.letterMultiplier = letterMultiplier;
    }

    public void setWordMultiplier(int wordMultiplier) {
        this.wordMultiplier = wordMultiplier;
    }

    public boolean playLetter(char letter){
        if(value == 0){//the tile has no letter
            value = letter;
            return true;
        }
        if(value == letter)// the letter attempting to be added is already present, currently treated as if the letter was played
            return true;
        return false;
    }

    public int getValue(){
        if(value==0)
            return 0;
        return lookup.getValue(value)*letterMultiplier;
    }
}
