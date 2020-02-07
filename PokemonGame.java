import java.util.Scanner;

public class PokemonGame {
    public static String catchPokemon;
    public static void main(String[] args) {
        Pokemon obj = new Pokemon();
        Scanner kb = new Scanner(System.in);
        System.out.println("#######################################");
        System.out.println("!       WELCOME TO POKEMON GAME       !");
        System.out.println("#######################################");
        System.out.print("Do you want to cath Pokemon (Y) Yes , (N) No =>  ");
        catchPokemon = kb.nextLine();
        obj.pokemonCatch(catchPokemon);
        kb.close();
    }
}