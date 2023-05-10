import java.util.ArrayList;

public class Variaveis {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 43: \n");
        ArrayList<Dados> dado = new ArrayList<>();
        dado.add(new Dados(a: 1, b: 2, c: 3));
        dado.add(new Dados(a: 2, b: 4, c: 5));
        dado.add(new Dados(a: 3, b: 2, c: 4));
        dado.add(new Dados(a: 4, b: 4, c: 4));
        dado.add(new Dados(a: 5, b: 3, c: 3));

        for (Dados l : dado) {
            int a = l.a;
            int b = l.b;
            int c = l.c;
            String mens = "";
            if ((a < b + c) && (b < a + c) && (c < a + b)) {
                if ((a == b) && (b == c)) {
                    mens = "Triangulo Isoceles.";
                } else {
                    mens = "Triangulo Escaleno.";
                }
            } else {
                mens = "Não é possível formar um triangulo.";
            }
            System.out.println(a +", "+ b +", "+ c +"= "+mens);
        }
    }
}