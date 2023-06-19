package learn_5.Branching;

import java.util.ArrayList;

public class Dice_board_game {
	static ArrayList<String> printDiceBoardGame(int s,int e){
        if(s==e){
            // Reach at e value 
            ArrayList<String>al=new ArrayList<>();
            al.add(" ");
            return al;
        }else if(s>e){
            //when s value exceed e value
            ArrayList<String>x=new ArrayList<>();
            return x;
        }
        ArrayList<String>result=new ArrayList<>();
        // dice roll 1 to 6
        for (int dice = 1; dice <=6; dice++) {
            int newValue=s+dice;
           ArrayList<String>temp= printDiceBoardGame(newValue, e);
           for (String str : temp) {
            result.add(dice+str);
           }
        }
        return result;
       }
       
    public static void main(String[] args) {
        final int START_NUMBER=0;
        final int END_NUMBER=5;
      System.out.println(printDiceBoardGame(START_NUMBER,END_NUMBER));
        
    }

}
