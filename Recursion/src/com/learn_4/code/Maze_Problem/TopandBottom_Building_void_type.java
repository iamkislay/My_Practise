package com.learn_4.code.Maze_Problem;

import java.util.ArrayList;

public class TopandBottom_Building_void_type {
static void getMazePos(int currentRow , int currentCol, int endRow, int endCol,String Result){
        
        // Termination Case (Positive Case and Negative Case)
        // Positive Case
        if(currentCol == endCol && currentRow == endRow){
            System.out.print(Result+" ");
          //  Result="";
            return;
        }
        // Negative Case
        if(currentCol>endCol || currentRow>endRow){
           // ArrayList<String> result = new ArrayList<>();
        	
            return ;
        }
        
        // All the Right and Down Result Store in Final Result
        ;
        Result=Result+"R";
        // Move to the Right

      getMazePos(currentRow, currentCol+1, endRow, endCol,Result);
       // currentCol++;
        // On BackTrack so we have another choice (Makes Branch)
        // Move to the Down
        Result=Result+"D";
        getMazePos(currentRow+1, currentCol, endRow, endCol,Result);
        
        return ;
    }
    public static void main(String[] args) {
         getMazePos(0,0, 2, 2,"");
    }
}
