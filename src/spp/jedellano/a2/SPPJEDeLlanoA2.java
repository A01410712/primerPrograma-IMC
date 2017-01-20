/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jedellano.a2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPJEDeLlanoA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora IMC");
        // Paso 1 Declaración de variables (identificadores)
        double w, l, imc;
        String eIMC;
        Scanner kb = new Scanner (System.in);
        //Paso 2 Asignar valores a las variables
          System.out.println("Introduce el peso");
        w=kb.nextDouble();
        System.out.println("Introduce la estatura");
        l=kb.nextDouble();
        // Paso 3 resolver el problema
        imc= w / Math.pow (l,2);
        //3.1 Evaluamos IMC
        if (imc>25){
            System.out.println("Sobrepeso");
            eIMC="Sobrepeso";
        }else if(imc<19){
           eIMC="Desnutricion";
        }else {
            eIMC="Normal";
        }
        // Paso 4 Mostrar el resultado
        System.out.println("Peso" + w);
        System.out.println("Estatua" + l);
        System.out.println("IMC" + imc);
        System.out.println(eIMC);
    }
    
}
