public class Nodo {
    private int valor;
    private Nodo Apabajo, Apderecha;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    Nodo(){
        this.valor = 0;
        this.Apabajo = null;
        this.Apderecha = null;
        
    }

    // Métodos get y set para los atributos.

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getApabajo() {
        return Apabajo;
    }

    public Nodo getApderecha() {
        return Apderecha;
    }

    public void setApabajo(Nodo Apabajo) {
        this.Apabajo = Apabajo;
    }

    public void setApderecha(Nodo Apderecha) {
        this.Apderecha = Apderecha;
    }
}
