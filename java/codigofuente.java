


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barah
 */
public class codigofuente {
    
     public static String Codifica(String palabra, int llave) {
        int codificar =0;
        String Resultado = "";
        
        for (int x = 0; x < palabra.length(); x++){//que x sea hasta la palabra que se ingresa.
            codificar = (int) palabra.charAt(x);//nos salteamos el codigo AS
            codificar = codificar + llave;//tomamos el codigo As y le sumamos posiciones dependiendo la llave quue ingrese el usuario
            char caracter = (char) codificar;//aqui solo colcamos lo que nos ha dado en codificar, en caracter.
            Resultado = Resultado + caracter;//hacemos que nos devuelva el resultado
        }
        
        return Resultado;
     }
     public static String descodifica (String palabra, int llave) {
        int codificar =0;
        String Resultado = "";
        
        for (int x = 0; x < palabra.length(); x++){
            codificar = (int) palabra.charAt(x);
            codificar = codificar - llave;
            char caracter = (char) codificar;
            Resultado = Resultado + caracter;
        }
        
        return Resultado;
     }
        
}
