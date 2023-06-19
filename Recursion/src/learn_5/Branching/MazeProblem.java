package learn_5.Branching;

import java.util.ArrayList;

public class MazeProblem {
	static ArrayList<String> getAllPaths(int currentRow,int currentCol,int endRow,int endCol){
        // Termination Case

        //Positive Case
        if(currentCol==endCol && currentRow==endRow){
            ArrayList<String>res=new ArrayList<>();
            res.add("");
            return res;
        }

        // Negative Case
        if(currentCol>endCol || currentRow>endRow){
            ArrayList<String>z=new ArrayList<>();
            return z;
        }

        // Store Final Result
        ArrayList<String>finalR=new ArrayList<>();

        // Move right (Branch One)
       ArrayList<String>rightR= getAllPaths(currentRow, currentCol+1, endRow, endCol);
       for (String str : rightR) {
        finalR.add("R"+str);
       }

        // Move down (Branch Two)
        ArrayList<String>downR= getAllPaths(currentRow+1, currentCol, endRow, endCol);
        for (String str : downR) {
        finalR.add("D"+str);
       }

       return finalR;
    }

    public static void main(String[] args) {
      ArrayList<String>ans=  getAllPaths(0, 0, 2, 2);
      System.out.println(ans);
    }

}
