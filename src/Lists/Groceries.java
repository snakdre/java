package Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Groceries {
    public static void menu(){
        System.out.println("AVAILABLE ACTIONS:\n");
        System.out.println("0 - To shutdown\n");
        System.out.println("1 - To add item(s) in the list (Comma delimited list)\n");
        System.out.println("2 - To remove any item(s) from the list (Comma delimited list)\n");
        System.out.println("Enter a number for which action you wanna take: ");
    }
    public static void addItem(String[] item, ArrayList<String> lists){
        StringBuilder duplicate = new StringBuilder();
        StringBuilder found = new StringBuilder();
        for(String el : item){
            if(!lists.contains(el)){
                lists.add(el);
                found.append(el).append(" ");
            }
            else{ //fixing grammar
                duplicate.append(el).append(" ");
            }
        }
        if(!found.isEmpty()){
            System.out.println("Groceries have been added!");
            lists.sort(Comparator.naturalOrder());
            System.out.println(lists);

        }
        if(!duplicate.isEmpty()){
            System.out.println(duplicate.toString() + "found already in the groceries list! ");
            System.out.println("No update...:\n");
        }
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
            }
        }
        if(!found.isEmpty()) {System.out.println("Groceries have been removed!");}
        if(!missing.isEmpty()){System.out.println(missing.toString() + "not found in the groceries list! ");}
        lists.sort(Comparator.naturalOrder());
    }


    static void main() {
        ArrayList<String> groceries = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String choice = "";
        boolean quit = true;
        do{
            menu();
            choice = input.nextLine();
            switch (choice){
                case "0":
                    quit = false;
                    break;
                case  "1":
                    System.out.println("Enter the groceries list: ");
                    String[] inputs = input.nextLine().split(",");
                    addItem(inputs, groceries);
                    break;
                case "2":
                    System.out.println("Enter the groceries list to remove: ");
                    String[] inputs2 = input.nextLine().split(",");
                    removeItem(inputs2, groceries);
                    break;
            }
        }while(quit);
    }
}
