import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> Enumbers = new ArrayList<>();
        ArrayList<Integer> Onumbers = new ArrayList<>();
        int Esum = 0;
        int Ecount = 0;
        int Osum = 0;
        int Ocount = 0;
        int i = 0;

        do {
            System.out.println("please enter number or zero to quit : ");
            int n = input.nextInt();
            numbers.add(n);
            i++;
        } while (!numbers.contains(0));




        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) % 2 == 0) {
                Enumbers.add(numbers.get(j));
            } else if (numbers.get(j) % 2 != 0) {
                Onumbers.add(numbers.get(j));
            }

        }

        for (int k = 0; k < Enumbers.size(); k++) {
            Esum += Enumbers.get(k);
            System.out.println("The even numbers :" + Enumbers.get(k));
        }

        for (int f = 0; f < Onumbers.size(); f++) {
            Osum += Onumbers.get(f);
            System.out.println("The even numbers :" + Onumbers.get(f));

        }


        System.out.println("The even numbers  count " +Ecount + " sum :  " + Esum);
        System.out.println("The odd numbers  count " + Ocount + " sum :  " + Osum);







    }


    }



