/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

/**
 *
 * @author bruno.191196
 */
public class Lista4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Mapa mapa = new Mapa();
    mapa.usuarios.add(new Usuario("Bruno"));
    mapa.usuarios.add(new Usuario("Tumelero"));
    mapa.usuarios.get(0).adicionarLocal("Restaurante", 1, 1);
    mapa.usuarios.get(0).adicionarLocal("Pizzaria", 2, 2);
    mapa.usuarios.get(0).adicionarLocal("Cafeteria", 3, 3);
    mapa.usuarios.get(1).adicionarLocal("Restaurante", 1, 1);
    mapa.usuarios.get(1).adicionarLocal("Restaurante", 2, 2);
    mapa.usuarios.get(1).adicionarLocal("Churrascaria", 3, 3);
    mapa.listaLocaisPublicos(0, 10, 0, 10);
    System.out.println(mapa.pesquisaLocal("Restaurante"));
    System.out.println(mapa.pesquisaLocal("Pizzaria"));
  }
  
}
