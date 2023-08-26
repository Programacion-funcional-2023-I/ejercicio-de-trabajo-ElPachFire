package introduccion

import javax.naming.OperationNotSupportedException

class EjercicioListas {
  /*
  * Punto 2 repetir lista
  * @param lista Lista a repetir
  * @param n Número de veces a repetir la lista
  * @return Lista repetida n veces
  * @example repetirLista(List(1, 2, 3), 2) = List(List(1,1),List(2,2),List(3,3))
  * @throws IllegalArgumentException si n es negativo
  */
  def repetirListas(lista: List[Int], n: Int): List[List[Int]] = {
    var listaRepetida : List[List[Int]] = List()
    //Complete el código
    require ( n >= 0, "Solo numeros positivos, no se admiten numeros negativos")
    //Para representar la lista se usa "lista" (valga la rebundancia)
    //También haré uso de .map el cual es un método de las colecciones de Scala el
    //cual se utiliza para transformar cada elemento de una colección aplicando
    // una función a cada uno de ellos.
    //List.fill(n)(element) Esta es la función que se aplica a cada elemento de la lista
    //donde "element) representa a los elementos orignales de la lista que en este caso
    //seria (List(1, 2, 3,),2)

    lista.map(element => List.fill(n)(element))

    throw new UnsupportedOperationException("No implementado aún")
  }
  /*
  * Punto 3: Filtrar listas
  * @param criterioIn Criterio de filtrado que puede ser "mayor", "menor", "mayoroigual", "igual", "diferente" o "menoroigual"
  * @param n Número a comparar
  * @param lista Lista a filtrar
  * @return Lista filtrada de acuerdo al criterio y n
  * @throws IllegalArgumentException si el criterio no es uno de los valores válidos
  */

  def filtrarListas(criterioIn: String, n: Int, lista: List[Int]) : List[Int] = {
    var criterio : String = criterioIn.toLowerCase()
    var listaFiltrada : List[Int] = List()
    //Complete el código
    throw new UnsupportedOperationException("No implementado aún")
  }
}
