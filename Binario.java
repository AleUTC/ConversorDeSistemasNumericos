public class Binario {

    public double decimalBinario(int numeroIni){
        int numero = numeroIni, digito, exponente = 0;
        double  binario = 0;

        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exponente);
            exponente ++;
            numero = numero / 2;
        }
        //System.out.printf("La conversión del numero "+ numeroIni +"Decimal a Binario es: %.0f %n", binario);
        //System.out.printf("Binario: %.0f %n",binario);
        return binario;
   }


}
