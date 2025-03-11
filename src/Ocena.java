public class Ocena{
    String przedmiot;
    int ocena;
    public Ocena(String przedmiot, int ocena){
        this.przedmiot = przedmiot;
        this.ocena = ocena;
    }
    public String toString(){
        return przedmiot + ":" + ocena;
    }
}
