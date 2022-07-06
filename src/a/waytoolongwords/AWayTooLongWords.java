package a.waytoolongwords;
import java.util.ArrayList;
import java.util.Scanner;
public class AWayTooLongWords{

    public static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        String word = "";
        int count ;
        ArrayList<String> data = new ArrayList<>();
        count = inp.nextInt();
        for(int i = 0 ; i < count ; i++){
            word = inp.next();
            data.add(word);
        }
        for(int i = 0 ; i < data.size() ; i++){
             if(data.get(i).length() > 10){
                String temp = "";
                temp+= data.get(i).charAt(0);
                temp+= (data.get(i).length()-2);
                temp+= (data.get(i).charAt(data.get(i).length()-1));
                System.out.println( temp);
             }
             else{
                 System.out.println(data.get(i));
            }
        }
    }
    
}
