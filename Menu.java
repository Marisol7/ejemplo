
package grogu;

import java.io.IOException;
import java.util.Scanner;


public class Menu {
    
    public void Menu() throws IOException{
        Scanner sc = new Scanner(System.in);
        Cliente cl=new Cliente(0," "," ");
         Articulo f1= new Articulo(0," ",0,0);
        do {
            System.out.println("\n----Menú ----");
            System.out.println("1-Registrar Cliente");
            System.out.println("2-Ver Clientes Registrados");
            System.out.println("3-Registrar Artículo");
            System.out.println("4-Ver artículos registrados y existencias");
            System.out.println("5-Realizar venta");
            System.out.println("6-Salir");
            System.out.println("\nElige una opción:");
            
            int opc=sc.nextInt();
            
            switch(opc){
               
                case 1:
                  cl.informacion();
                 
                    break;
                case 2:
                     cl.imprimirClien();
 
                    break;
                case 3:
                    f1.Artinfo();
                    break;
                case 4:
                    f1.imprimirArti();
                    break;
                case 5:
                    System.out.println("\n-----GROGU-----");
                    f1.revision3();
                    cl.revision1();
                    System.out.println("\n***************");
                    f1.revision4();
                    f1.revision5();
                    cl.revision2();
                    System.out.println("\nGRACIAS POR SU COMPRA!!");
                    System.out.println("---------------");
                    break;
                case 6:
                    System.exit(0);
                    break;
                }    
            }while(true);
        }

}



  
  
