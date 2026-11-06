//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06a
{
    public static void main( String args[] ) throws IOException
    {
        ArrayList<Word> words = new ArrayList<>();
        File data = new File("lab06a.dat");
        Scanner scan = new Scanner(data);
        while(scan.hasNext()){
            words.add(new Word(scan.nextLine()));
        }
        Collections.sort(words);
        for(Word w : words){
            out.println(w);
        }
    }
}
