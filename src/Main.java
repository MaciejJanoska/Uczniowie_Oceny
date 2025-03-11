import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        Uczen uczen = new Uczen("Ania");

        uczen.dodajOcene("Matematyka", 5);
        uczen.dodajOcene("Matematyka", 4);
        uczen.dodajOcene("Polski", 3);

        uczen.pokazOcenyZPrzedmiotu("Matematyka");
        System.out.println("Średnia z Matematyki: " + uczen.sredniaZPrzedmiotu("Matematyka"));
    }
}