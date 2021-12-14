
package grogu;


import java.util.Scanner;

public class Cliente extends DatosComun{
   
private String Apellido;
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

 public Cliente (int ID,String nom,String A){
        super (ID,nom);
        this.Apellido=A;
 }
 String nombre1[]= new String[2];
 String Apellido1[]= new String[2];
 int ID1[]=new int[2];
         
 public void informacion(){
     

     for(int i=0; i<nombre1.length; i++){
         
         Scanner sc = new Scanner(System.in);
         System.out.println("\nEscriba su nombre: ");
         nombre1[i]=nom=sc.nextLine();  
         System.out.println("Escriba su apellido paterno: ");
         Apellido1[i]=Apellido=sc.nextLine();
         System.out.println("Escriba su número de Identificador: ");
         ID1[i]=sc.nextInt();
     }
     
 }
     
  public void imprimirClien(){
      
      System.out.println("-------Lista de Clientes-------");
      
        for(int i=0; i<nombre1.length;i++){
            System.out.println("--*CLEINTE"+(i+1));
            System.out.println("Su nombre es: "+nombre1[i]);
            System.out.println("Apellido Paterno: "+Apellido1[i]);
            System.out.println("Identificador: "+ID1[i]);
            System.out.println("\n");
        }
      
  }
  
    public void revision1(){
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese el Identificador del cliente: ");
         ID=sc.nextInt();
         
      }
      
      public void revision2(){
              for(int i=0; i<ID1.length;i++){
              if(ID==ID1[i]){
                  System.out.println("NOMBRE CLIENTE: "+nombre1[i]+"  "+Apellido1[i]);
              }
          }
      }
    }

