/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bruno.191196
 */
public class Mapa {
  ArrayList<Usuario> usuarios;

  public void listaLocaisPublicos (int latitudeInicial, int latitudeFinal, int longitudeInicial, int longitudeFinal) {
    Map<String, ArrayList<Localizacao>> subMapa = new HashMap<>();
    usuarios.forEach((usuario) -> {
      usuario.meusLocais.entrySet().forEach((entry) -> {
        if ((entry.getValue().latitude >= latitudeInicial && entry.getValue().latitude <= latitudeFinal) &&
            (entry.getValue().longitude >= longitudeInicial && entry.getValue().longitude <= longitudeFinal)) {
          if (subMapa.containsKey(entry.getKey()) == false) {
            subMapa.put(entry.getKey(), new ArrayList<>());
          }
          if (subMapa.get(entry.getKey()).contains(entry.getValue()) == false) {
            subMapa.get(entry.getKey()).add(entry.getValue());
          }
        }
      });
    });
    subMapa.entrySet().forEach((entry) -> {
      System.out.println(entry.getKey() + " " + entry.getValue().toString());
    });
  }
  
  public ArrayList<Localizacao> pesquisaLocal (String nome) {
    ArrayList<Localizacao> localizacoes = new ArrayList<>();
    nome = nome.toLowerCase();
    for (int i = 0; i < usuarios.size(); i++) {
      if (usuarios.get(i).meusLocais.containsKey(nome)) {
        localizacoes.add(usuarios.get(i).meusLocais.get(nome));
      }
    }
    if (localizacoes.isEmpty() == false) {
      return localizacoes;
    }
    return null;
  }
  
  public Mapa() {
    this.usuarios = new ArrayList<>();
  }
}
