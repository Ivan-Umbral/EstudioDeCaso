/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudioDeCaso;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class EstudioDeCaso
 {

    public static void main(String[] args) {
        ListaCantantesFamosos listaDeCantantes1=new ListaCantantesFamosos();
       
        String opcion=new String();
        Scanner sc =new Scanner(System.in);
        char continuar;
       
        do{
            
            System.out.println("Introducir los datos de otro cantante:");

            System.out.println("Nombre:");
            EntradaTeclado entradaTeclado1=new EntradaTeclado();
            System.out.println("Disco con más ventas: ");
            EntradaTeclado entradaTeclado2=new EntradaTeclado();
           
            CantanteFamoso cantante=new CantanteFamoso();
            cantante.setNombre(entradaTeclado1.getEntradaTeclado());
            cantante.setDiscoConMasVentas(entradaTeclado2.getEntradaTeclado());
           
            listaDeCantantes1.setCantanteFamoso(cantante);
           
            System.out.println("----La lista actualizada----");
            listaDeCantantes1.listarCantantesFamosos();
            System.out.println("¿Introducir los datos de otro cantante o grupo(s/n)?");
            opcion=sc.nextLine();
             continuar = opcion.charAt(0);
        }while(continuar=='s' || continuar=='S');
    }
    
}
