import java.util.Random;
public class DoacaoMidia {
    public static void main(String[] args) {
       Midia midia = pegarMidiaAleatoria();
       System.out.println("Nome: " + midia.getNome() + "\n");
       midia.darPlay();
       System.out.println(midia);

    }

    public static Midia pegarMidiaAleatoria(){
        Midia[] listaMidias = new Midia[5];
        listaMidias[0] = new Cd("12345", 15.00, "Midnights", "Taylor Swift", 13);
        listaMidias[1] = new Dvd("999", 50.00, "Harry Potter e a pedra filosofal", "Inglês", true, "Pt-Br");
        listaMidias[2] = new Cd("9876", 20.0, "The Wall", "Pink Floyd", 26);
        listaMidias[3] = new Dvd("abcde", 75.90, "O Diabo Veste Prada", "Inglês", true, "Pt-Br");
        listaMidias[4] = new Cd("1bde34", 35.78, "Superache", "Conan Gray", 12);

        Random gerador = new Random();
        int valorAleatorio = gerador.nextInt(5);
        return listaMidias[valorAleatorio];
    }

    static public void assistirFilme(Dvd dvd){
        dvd.legenda(true, "Pt-Br");
        dvd.legenda(false);
    }
}