public class Lista {
    private Nodo inicio;
    private int tamanio;

    /**
     * Constructor por defecto.
     */
    Lista(){
        inicio = null;
        tamanio = 0;
    }

    /**
     * Consulta si la lista esta vacia.
     */
    public boolean esVacia(){
        return inicio == null;
    }

    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     */
    public int getTamanio(){
        return tamanio;
    }

    /**
     * Agrega un nuevo nodo al final de la lista.
     */
    public void agregarAlFinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else{
            Nodo aux = inicio;
            while(aux.getApabajo() != null){
                aux = aux.getApabajo();
            }
            aux.setApabajo(nuevo);
        }
        tamanio++;
    }

    /**
     * Insertat en un indice especifico
     */
    public void insrtarPorPosicion(int posicion, int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        Nodo aux = inicio;
        for (int i = 0; i < (posicion); i++) {
            aux = aux.getApabajo();
        }
        while (aux.getApderecha() != null) {
            aux = aux.getApderecha();
        }
        aux.setApderecha(nuevo);

    }

    /**
     * Obtiene el valor de un nodo en una determinada posición.
     */
    public int getValor(int posicion) throws Exception{
        if(posicion>=0 && posicion<tamanio){
            if (posicion == 0) {
                return inicio.getValor();
            }else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getApabajo();
                }
                return aux.getValor();
            }
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }

    /**
     * Elimina la lista
     */
    public void eliminar(){
        inicio = null;
        tamanio = 0;
    }

    /**
     * Mustra en pantalla los elementos de la lista.
     */
    public void listar() {
        if (!esVacia()) {
            StringBuilder out = new StringBuilder();
            boolean pa= false;
            Nodo aux = inicio;
            int i = 0;
            while (aux != null) {
                Nodo aux2 = aux;
                int valor = aux.getValor();
                out.append("[" + valor + "]");
                while (i == valor && aux2.getApderecha() != null) {
                    pa=true;
                    aux2 = aux2.getApderecha();
                    out.append("-> " + aux2.getValor());
                }
                if (pa) System.out.print(out+"-> null\n |\n V\n");
                pa = false;
                out = new StringBuilder();
                aux = aux.getApabajo();
                i++;
            }
        }
        System.out.println("null");
    }

    /**
     * Reeordenar la lista un una nueva
     */
    public Lista transfier() {
        Lista nueva = new Lista();
        Nodo aux = inicio;
        if (!esVacia()) {
            while (aux != null) {
                Nodo aux2 = aux;
                while (aux2.getApderecha() != null) {
                    aux2 = aux2.getApderecha();
                    nueva.agregarAlFinal(aux2.getValor());
                }
                aux = aux.getApabajo();
            }
        }
        return nueva;
    }

    /**
     * Imprimir los datos de cada lista
     */
    public void imprimir(){
        if (!esVacia()) {
            Nodo aux = inicio;
            while(aux != null){
                System.out.print(aux.getValor()+"-> ");
                aux = aux.getApabajo();
            }
            System.out.println("null");
        }
    }
}