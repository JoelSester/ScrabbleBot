import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DictionaryTree {
    DictionaryNode root;
    Queue<DictionaryNode> nodes = new LinkedList<>();
    Scanner fin = null;
    FileWriter fout = null;
    public boolean fileRead(String initialFilepath){
        String currentWord;
        fin = new Scanner(initialFilepath);
        while(fin.hasNextLine()){
            currentWord=fin.nextLine();
            addWord(currentWord);
        }
        return true;
    }
    private boolean addWord(String wordToAdd){
        return true;
    }
    public boolean storeTree(String filePath) throws IOException {
        fout = new FileWriter(filePath);
        DictionaryNode current;
        nodes.add(root);
        while(!nodes.isEmpty()){
            current = nodes.remove();
            fout.append(current.data);
            if(current.getLeft()!=null)
                nodes.add(current.getLeft());
            if(current.getRight()!=null)
                nodes.add(current.getRight());
        }
        return true;
    }
}
