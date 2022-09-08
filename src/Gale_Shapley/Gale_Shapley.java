package Gale_Shapley;
import Linked_List.*;

public class Gale_Shapley {
    public static int[][] Gale_Shapley_Employer(int[][] MenPref,int[][] Ranking) {
        int n = MenPref.length;
        Linked_List FreeMen=new Linked_List();
        int [] CurrentMan = new int[n];
        int [] NextWomen = new int[n];

        for(int i=0;i<n;i++){
            Linked_Node Man = new Linked_Node(i);
            FreeMen.Push(Man);
            NextWomen[i]=0;
            CurrentMan[i]=-1;
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
