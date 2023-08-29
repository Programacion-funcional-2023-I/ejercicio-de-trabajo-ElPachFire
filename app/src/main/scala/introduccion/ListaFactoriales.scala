package introduccion


class ListaFactoriales {
    def objListaFactoriales(n : Int): List[BigInt] = {
        var listaFactoriales : List[BigInt] = List()
        val objFactorial: Factorial = new Factorial()
        //Complete el código
        for (i <-0 to n){
            val factorial: BigInt = objFactorial.calculateFactorial(i)
            listaFactoriales = listaFactoriales :+ factorial
        }
        listaFactoriales
    }
}

