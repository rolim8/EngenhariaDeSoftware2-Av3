//Francisco Mateus Santos Pinto
package q5;


public class Listarefatorada {
    private final Object[] elementos = new Object[10];
    private int tamanho = 0;

    public void add(Object[] elemento) {
        if (TesteTamanho(elementos)) {
            tamanho++;

            if (!TesteTamanho(elementos)) {
                PercorrerElementos(elementos);
           }
               elementos[tamanho++] = elemento;
           }
    }
    public boolean TesteTamanho(Object[] elementos) {
        return tamanho < elementos.length;
    }
    public void PercorrerElementos(Object[] elementos){
        Object[] newElementos = new Object[elementos.length + 10];

        for (int i = 0; i < tamanho; i++) {
            newElementos[i] = elementos[i];
            elementos = newElementos;
        }
    }
}

