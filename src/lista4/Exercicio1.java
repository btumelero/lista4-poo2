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
public class Exercicio1 {
  
  //***********************************************************CONSTRUTORES*********************************************************************
  
   /*
    *HashMap() {
    *this.loadFactor = DEFAULT_LOAD_FACTOR;
    *threshold = (int)(DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
    *table = new Entry[DEFAULT_INITIAL_CAPACITY];
    *init();
    *}
    */
  
   /*
    *loadFactor: O quão cheio o HashMap pode estar antes de sua capacidade ser aumentada automaticamente (DEFAULT_LOAD_FACTOR: 0.75)
    *threshold: Capacidade (Default: 12)
    *Initial Capacity: A capacidade na hora que o HashMap é criado (16). 
    *table: array de entrys
    *init(): chamado depois da inicialização e antes da inserção de qualquer entrada - não entendi examente o que ele faz, porém
    */
  
   /*
    *HashMap(int initialCapacity) {
    *this(initialCapacity, DEFAULT_LOAD_FACTOR);
    *}
    */
  
   /*
    *Constrói um HashMap com a capacidade inicial igual ao valor do parâmetro na hora da contrução.
    *Valores negativos dão erro
    */
  
   /*
    *HashMap(Map m) {
    *this(Math.max((int) (m.size() / DEFAULT_LOAD_FACTOR) + 1, DEFAULT_INITIAL_CAPACITY), DEFAULT_LOAD_FACTOR);
    *putAllForCreate(m);
    *}
    */
  
   /*
    *Constrói um HashMap com capacidade inicial suficiente e adiciona as mesmas entradas do mapa do parâmetro.
    *putAllForCreate(m): copia as entradas do outro mapa e insere no novo uma a uma
    */
  
   /*HashMap(int initialCapacity, float loadFactor) {
    *if (initialCapacity > MAXIMUM_CAPACITY)
    *initialCapacity = MAXIMUM_CAPACITY;
    *(Find a power of 2 >= initialCapacity)
    *int capacity = 1;
    *while (capacity < initialCapacity)
    *capacity <<= 1;
    *this.loadFactor = loadFactor;
    *threshold = (int)(capacity * loadFactor);
    *table = new Entry[capacity];
    *init();
    *}
    */
  
   /*
    *Constrói um HashMap com initialCapacity e loadFactor iguais aos valores do parâmetro na hroa da construção
    *se a capacidade inicial for maior do que a capacidade máxima, procura por uma potência de 2 com resultado maior que a capacidade inicial
    *while (capacity < initialCapacity) capacity <<= 1: nessa parte ele dá um "Recebe Left Shift" 
    *isso faz com que o valor inicialmente 1(2^0) passe a ser 2(2^1) e assim por diante até a condição do while ser cumprida
    */
  
  
  
  //***********************************************************PUT&GET*****************************************************************************
   /*
    *put(K key, V value) {
    *if (key == null)
    *return putForNullKey(value);
    *int hash = hash(key.hashCode());
    *int i = indexFor(hash, table.length);
    *for (Entry<K,V> e = table[i]; e != null; e = e.next) {
    *Object k;
    *if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
    *V oldValue = e.value;
    *e.value = value;
    *e.recordAccess(this);
    *return oldValue;
    *}
    *}
    *modCount++;
    *addEntry(hash, key, value, i);
    *return null;
    *}
    */
  
   /*
    *
    */
}
