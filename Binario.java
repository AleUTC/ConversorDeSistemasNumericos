public class Binario {

    public void decimalBinario(int numeroIni){
        int numero = numeroIni, digito, exponente = 0;
        double  binario = 0;

        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exponente);
            exponente ++;
            numero = numero / 2;
        }
        //System.out.printf("La conversión del numero "+ numeroIni +"Decimal a Binario es: %.0f %n", binario);
        System.out.printf("Binario: %.0f %n",binario);
   }

   public void binarioDecimal(long numeroIni){
       long digito, decimal = 0;
       int exponente = 0;

       digito = numeroIni % 10;

        while (numeroIni != 0) {
            digito = numeroIni % 10;
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            exponente++;
            numeroIni = numeroIni / 10;
        }
        System.out.println("Decimal: "+ decimal);
   }
}
