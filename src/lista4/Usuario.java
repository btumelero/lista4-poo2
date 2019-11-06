/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bruno.191196
 */
public class Usuario {
  Map<String, Localizacao> meusLocais;
  String nome;

  public void adicionarLocal (String nome, int latitude, int longitude) {
    meusLocais.put(nome.toLowerCase(), new Localizacao(latitude, longitude));
  }

  public Usuario(String nome) {
    this.meusLocais = new HashMap<>();
    this.nome = nome;
  }
}
