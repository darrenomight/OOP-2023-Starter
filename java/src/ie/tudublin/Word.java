package ie.tudublin;

import java.util.ArrayList;

import javax.swing.AbstractCellEditor;

import processing.data.Table;
import processing.data.TableRow;



public class Word 
{
    Table t;
    Follow f;
    ArrayList<Follow> followArrL = new ArrayList<Follow>();
    
    public Word(Table t, Follow f)
    {
        this.t = t;
        this.f = f;
    }

    public Table getT() {
        return t;
    }

    public void setT(Table t) {
        this.t = t;
    }

    public Follow getF() {
        return f;
    }

    public void setF(Follow f) {
        this.f = f;
    }

    public ArrayList<Follow> getFollowArrL() {
        return followArrL;
    }

    public void setFollowArrL(ArrayList<Follow> followArrL) {
        this.followArrL = followArrL;
    }

    void loadwords()
    {
        t= loadTable("shakespere.txt", "header");
        for(TableRow r:t.rows())
        {
            Follow f = new Follow(r);
            followArrL.add(f);
        }
    }

    private Table loadTable(String string, String string2) {
        return null;
    }

    public String toString()
    {
        String str;
        str = "followArrL" ;
        return str;
    }


    public void findFollow(str)
    {

        return null;
    }

    public String render(String followArrL )
    {   
        followArrL = "Abc";
        return followArrL;
    }
}

