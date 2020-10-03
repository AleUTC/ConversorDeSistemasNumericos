public class Binarios {

    public void convertirBinario(int numero){
        int digito, exponente = 0;
        double  binario = 0;

        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exponente);
            exponente ++;
            numero = numero / 2;
        }

        System.out.println("La conversión de "+ numero +" a Binario es: "+ binario);
   }
}
