package introduccion


class ListaFactoriales {
    def objListaFactoriales(n : Int): List[BigInt] = {
        var listaFactoriales : List[BigInt] = List()
        val objFactorial: Factorial = new Factorial()
        //Complete el código
        for (i <-0 to n){
            val factorial: bigInt = objFactorial.calculateFactorial(i)
            listafactoriales = listaFactoriales + listaFactoriales

        }
        listaFactoriales
    }
}

