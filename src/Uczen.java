import java.util.ArrayList;

public class Uczen {
    private String imie;
    private ArrayList<Ocena> oceny;

    public Uczen(String imie) {
        this.imie = imie;
        this.oceny = new ArrayList<>();
    }

    // ✔ metoda dodająca ocenę
    public void dodajOcene(String przedmiot, int ocena) {
        this.oceny.add(new Ocena(przedmiot, ocena));
    }

    // ✔ metoda pokazująca oceny z danego przedmiotu
    public void pokazOcenyZPrzedmiotu(String przedmiot) {
        System.out.println("Oceny z przedmiotu " + przedmiot + ":");
        for (Ocena o : oceny) {
            if (o.przedmiot.equals(przedmiot)) {
                System.out.println(o.ocena);
            }
        }
    }

    // ✔ metoda licząca średnią z danego przedmiotu
    public double sredniaZPrzedmiotu(String przedmiot) {
        int suma = 0;
        int licznik = 0;
        for (Ocena o : oceny) {
            if (o.przedmiot.equals(przedmiot)) {
                suma += o.ocena;
                licznik++;
            }
        }
        if (licznik == 0) return 0.0;
        return (double) suma / licznik;
    }
}
