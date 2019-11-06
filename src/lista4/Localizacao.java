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
public class Localizacao {
  int latitude, longitude;

  @Override
  public String toString () {
    return "lat: " + latitude + ", long: " + longitude;
  }
  
  public Localizacao(int latitude, int longitude) {
    this.longitude = longitude;
    this.latitude = latitude;
  }
}
