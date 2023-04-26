package ie.tudublin;

import java.util.ArrayList;

import processing.data.Table;
import processing.data.TableRow;



public class Word 
{
    public ArrayList<Follow> followArrL = new ArrayList<Follow>();
    
    public Word()
    {

    }

    void loadwords()
    {
        Table table = loadTable("shakespere.txt", "header");
        for(TableRow r:table.rows())
        {
            Star s = new Star(r);
            Word.add(s);
        }
    }

    
}
    













    private Table loadTable(String string, String string2) {
        return null;
    }

    public void findFollow(str)
    {

        return null;
    }
}

