package Gale_Shapley;
import Linked_List.*;

public class Gale_Shapley {
    public static int[] Gale_Shapley_Employer(int[][] MenPref,int[][] Ranking) {
        int n = MenPref.length;
        Linked_List FreeMen=new Linked_List();
        int [] CurrentMan = new int[n];
        int [] NextWomen = new int[n];

        int[] Return = new int[n];

        for(int i=0;i<n;i++){
            Linked_Node Man = new Linked_Node(i);
            FreeMen.Push(Man);
            NextWomen[i]=0;
            CurrentMan[i]=-1;
        }
        while(!FreeMen.IsEmpty()){
            int men = FreeMen.Pull().getValue();
            int women = NextWomen[men];

            if(CurrentMan[women]==-1){
                Return[women]=men;
                CurrentMan[women]=men;
            }
            else{
                int currentMen = CurrentMan[women];
                if(Ranking[women][men]>Ranking[women][currentMen]){
                    FreeMen.Push(new Linked_Node(men));
                    Return[women]=men;
                    CurrentMan[women]=men;
                }
            }
        }

        return Return;
    }
    public static void main(String[] args) {

    }
}
