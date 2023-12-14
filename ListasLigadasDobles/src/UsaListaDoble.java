public class UsaListaDoble {
    public static void main(String[] args) {
        ListaDoble listaD = new ListaDoble();
        listaD.insertaPrimerNodo("P");
        listaD.insertaAlFinal("H");
        listaD.insertaAntesPrimerNodo("S");
        listaD.insertaAntesPrimerNodo("E");
        listaD.insertaAntesPrimerNodo("M");
        listaD.insertaAlFinal("E");
        System.out.println(listaD);
        System.out.println(listaD.buscarNodoPorValor("E"));
        listaD.insertarDespuesDeNodo("H","A");
        System.out.println(listaD);
        listaD.intercambiarNodos("P","M");
        System.out.println(listaD);
    }
}