package test;

public class App {
  public static void main(String[] args) {

    ArrayMultiTreeNode<String> Programa = new ArrayMultiTreeNode<>("Programa");
    ArrayMultiTreeNode<String> definiciones = new ArrayMultiTreeNode<>("definiciones");
    ArrayMultiTreeNode<String> definicion = new ArrayMultiTreeNode<>("definicion");
    ArrayMultiTreeNode<String> e = new ArrayMultiTreeNode<>("e");
    ArrayMultiTreeNode<String> defuntion = new ArrayMultiTreeNode<>("defuntion");
    ArrayMultiTreeNode<String> tipo = new ArrayMultiTreeNode<>("tipo");
    ArrayMultiTreeNode<String> identacion = new ArrayMultiTreeNode<>("identacion");
    ArrayMultiTreeNode<String> parentesisAbierto = new ArrayMultiTreeNode<>("(");
    ArrayMultiTreeNode<String> parametros = new ArrayMultiTreeNode<>("parametros");
    ArrayMultiTreeNode<String> parentesisCerrado = new ArrayMultiTreeNode<>(")");
    ArrayMultiTreeNode<String> blockfuntion = new ArrayMultiTreeNode<>("blockfuntion");

    Programa.add(definiciones);
    definiciones.add(definicion);
    // definiciones.add(definiciones);
    definiciones.add(e);
    definicion.add(defuntion);
    defuntion.add(tipo);
    defuntion.add(identacion);
    defuntion.add(parentesisAbierto);
    defuntion.add(parametros);
    defuntion.add(parentesisCerrado);
    defuntion.add(blockfuntion);

    System.out.println(Programa);
  }
}
