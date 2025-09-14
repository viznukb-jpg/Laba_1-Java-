import java.util.Scanner;

/**
 * Main class for running the Fibonacci numbers program.
 * This program prompts the user to enter the number of Fibonacci numbers to generate.
 * It creates an array of Number objects and prints out the numbers which are perfect cubes.
 * The program works with both positive and negative indices.
 */
public class Main {
    public static void main (String[] args){
        System.out.print("Input amount of first Fibonachi numbers:  ");

        int N;
        boolean isPositive = true;

        while(true){
            Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt()){
                N = sc.nextInt();
                if(N < 0){
                    isPositive = false;
                    N = -N;
                }
                break;
            }
            else{
                System.out.print("Input amount of second Fibonachi numbers:  ");
                sc = new Scanner(System.in);
            }
        }

        Number [] fibonachiNumbers = new Number[N];
        System.out.println("Amount of Fibonachi numbers: " + N);
        System.out.print("Numbers which is cubes: ");

        for(int i = 0; i < N; i++){
            fibonachiNumbers[i] = new Number(isPositive ? i : -i);
            if( fibonachiNumbers[i].isCube()) System.out.print(fibonachiNumbers[i].getValue() + " ");
        }

        System.out.println();
    }
}

//Визначити які серед перших N чисел фібоначі є кубами