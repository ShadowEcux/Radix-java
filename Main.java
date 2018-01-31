import java.util.Scanner;

public class Main {
    static int maxi;
    static int aux;
    static int t;

    public static void insertar(Lista lista) {
        //12 12 12 12 12 12 12 12 12 12 12 12 21 0
        Scanner sc = new Scanner(System.in);
        System.out.println("dame los numeros que desea ordenar:");
        String rejilla = sc.nextLine();
        String[] numero = rejilla.split(" ");
        for (String nm : numero) {
            lista.agregarAlFinal(Integer.parseInt(nm));
            if (maxi<nm.length()) maxi=nm.length();
            aux = maxi;
        }
    }

    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        for (int i = 0; i <= 9; i++) {
            lista.agregarAlFinal(i);
        }
        Lista numero = new Lista();
        insertar(numero);
        for (int j = 1; j <= maxi; j++) {
            for (int i = 0; i < numero.getTamanio(); i++) {
                String num = String.valueOf(numero.getValor(i));
                int a = getdifit(Integer.parseInt(num), j);
                lista.insrtarPorPosicion(a, Integer.parseInt(num));
            }
        }
        System.out.println("<<-- Lista -->>");
        lista.listar();
    }


    static int getdifit(int number, int pos){
        int i=1; int x;
        while (number > 0) {
            x = number % 10;
            if(i == pos) return x;
            number = number / 10;
            i++;
        }
        return 0;
    }

}