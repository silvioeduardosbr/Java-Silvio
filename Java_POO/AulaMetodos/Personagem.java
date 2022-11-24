package Java_POO.AulaMetodos;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus(){
        System.out.format("\n%s, lvl %d e força %d\n", nome,nivel,forca);

    }
}
