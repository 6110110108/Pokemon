import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Pokemon {
    Scanner kb = new Scanner(System.in);  
    public static int ball = 10;
    public static Double pokemonPower = 1000.0;
    public static String pokemonAttack;
    public static String pokemonSleep;
    public static String pokemonFood;

    public void pokemonCatch(String pokemonC) {
        if("Y".equals(pokemonC) || "y".equals(pokemonC) || "YES".equals(pokemonC) || "yes".equals(pokemonC)) {
            Double rand = Math.random();
            rand = rand*100;
            System.out.println("Chance to catch = " + new DecimalFormat("0.00").format(rand) + " %");
                if(rand >= 50){
                    System.out.print(">> SUCSESS << You got ");
                    pokemonList(rand);
                    ball--;
                    System.out.println("Your ball = " + ball);
                    pokemonAtk();
                }
                else {
                    System.out.println(">> FAIL << Try again, Good luck.");
                    System.out.print("Do you want to play again? (Y) YES (N) NO => ");
                    pokemonC = kb.nextLine();
                    pokemonCatch(pokemonC);
                }
            }
        else
            System.out.println("See you later.");
    }

    public void pokemonList(Double randPokemon) {
        if(randPokemon >= 90 && randPokemon <= 100) {
            System.out.println(" 'Pikachu' Power: " + pokemonPower);
        }
        if(randPokemon >= 80 && randPokemon < 90) {
            System.out.println(" 'Raichu' Power: " + pokemonPower);
        }
        if(randPokemon >= 70 && randPokemon < 80) {
            System.out.println(" 'Sandshrew' Power: " + pokemonPower);
        }
        if(randPokemon >= 60 && randPokemon < 70) {
            System.out.println(" 'Sandslash' Power: " + pokemonPower);
        }
        if(randPokemon >= 50 && randPokemon < 60) {
            System.out.println(" 'Charmander' Power: " + pokemonPower);
        }
    }

    public void pokemonAtk() {
        Double rand2 = Math.random();
        Double rand3;
        rand3 = rand2*100;
        System.out.print("Do you want to Pokemon attack another player? (Y) Yes , (N) No => ");
        pokemonAttack = kb.nextLine();
        if("Y".equals(pokemonAttack) || "y".equals(pokemonAttack) || "YES".equals(pokemonAttack) || "yes".equals(pokemonAttack)) {
            System.out.println("Your Pokemon loses power = " + new DecimalFormat("0.00").format(rand3) + " %");
            pokemonPower = (pokemonPower - (pokemonPower * rand2));
            System.out.println("Your Pokemon power = " + new DecimalFormat("0.0").format(pokemonPower));
        }
        else{
            System.out.println("Your Pokemon power = " + pokemonPower);
        }
        pokemonSlp(pokemonPower);
    }

    public void pokemonSlp(double sleepPower) {
        System.out.print("Do you want Pokemon to sleep? (Y) Yes , (N) No => ");
        pokemonSleep = kb.nextLine();
        if("Y".equals(pokemonSleep) || "y".equals(pokemonSleep) || "YES".equals(pokemonSleep) || "yes".equals(pokemonSleep)) {
            pokemonPower = 1000.0;
            System.out.println("Your Pokemon power = " + pokemonPower);
        }
        else{
            pokemonPower = sleepPower;
            System.out.println("Your Pokemon power = " + new DecimalFormat("0.0").format(pokemonPower));
        }
        pokemonFd(pokemonPower);
    }

    public void pokemonFd(double foodPower) {
        System.out.print("Do you want to feed the pokemon? (Y) Yes , (N) No => ");
        pokemonFood = kb.nextLine();
        if("Y".equals(pokemonFood) || "y".equals(pokemonFood) || "YES".equals(pokemonFood) || "yes".equals(pokemonFood)) {
            pokemonPower += 50;
            System.out.println("Berry give energy for Pokemon = 50");
            System.out.println("Your Pokemon eat Berry, total power = " + pokemonPower);
        }
        else{
            pokemonPower = foodPower;
            System.out.println("Your Pokemon power = " + new DecimalFormat("0.0").format(pokemonPower));
        }
    }
}