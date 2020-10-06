public class Decimal {

    public long binarioDecimal(long numeroIni){
        long digito, decimal = 0;
        int exponente = 0;

        digito = numeroIni % 10;

         while (numeroIni != 0) {
             digito = numeroIni % 10;
             decimal = decimal + digito * (int) Math.pow(2, exponente);
             exponente++;
             numeroIni = numeroIni / 10;
         }
         return decimal;
         //System.out.println("Decimal: "+ decimal);
    }

    public long octalDecimal(String octal) {
        long decimal = 0;
        int potencia = 0;
        for (int x = octal.length()- 1; x >= 0; x--) {
            int valorActual = Character.getNumericValue(octal.charAt(x));
            long elevado = (long) Math.pow(8, potencia) * valorActual;
            decimal += elevado;
            potencia++;
        }
        return decimal;
    }

    public int hexadecimalDecimal(String numHexa) {
        String hstring = "0123456789ABCDEF";
        int num = 0;
        numHexa = numHexa.toUpperCase();

        for (int i = 0; i < numHexa.length(); i++) {
            char ch = numHexa.charAt(i);
            int n = hstring.indexOf(ch);
            num = 16*num + n;
        }
        return num;
    }
}
