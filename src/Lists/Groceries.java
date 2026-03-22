package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Groceries {
    public static void menu(){
        System.out.println("AVAILABLE ACTIONS:\n");
        System.out.println("0 - To shutdown\n");
        System.out.println("1 - To add item(s) in the list (Comma delimited list)");
        System.out.println("2 - To remove any item(s) from the list (Comma delimited list)\n");
        System.out.println("Enter a number for which action you wanna take: ");
    }
    public static void addItem(String[] item, ArrayList<String> lists){
        StringBuilder missing = new StringBuilder();
        StringBuilder found = new StringBuilder();
        for(String el : item){
            if(lists.contains(el)){
                lists.add(el);
                found.append(el).append(" ");
            }
            else{ //fixing grammar
                missing.append(el).append(" ");
                if (missing.indexOf(" ") >= 0){System.out.println(missing + " are not in the groceries list! ");}
                else{System.out.println(missing + " is not in the groceries list");}
            }
        }
        System.out.println(found.toString() + " have been added!");
        System.out.println("Updated groceries list:\n" + lists);
    }
    public static void removeItem(String[] item, ArrayList<String> lists){
        StringBuilder missing = new StringBuilder();
        StringBuilder found = new StringBuilder();
        for(String el : item){
            if(lists.contains(el)){
                lists.remove(el);
                found.append(el).append(" ");
            }
            else{ //fixing grammar
                missing.append(el).append(" ");
                if (missing.indexOf(" ") >= 0){System.out.println(missing + " are not in the groceries list! ");}
                else{System.out.println(missing + " is not in the groceries list");}
            }
        }
        System.out.println(found.toString() + " have been removed!");
        System.out.println("Updated groceries list:\n" + lists);
    }


    static void main() {
        ArrayList<String> groceries = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        menu();
    }
}
