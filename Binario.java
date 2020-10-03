public class Binario {

    public void convertirBinario(int numeroIni){
        int numero = numeroIni, digito, exponente = 0;
        double  binario = 0;

        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exponente);
            exponente ++;
            numero = numero / 2;
        }

        System.out.printf("La conversión del numero "+ numeroIni +" a Binario es: %.0f %n", binario);
   }
}
