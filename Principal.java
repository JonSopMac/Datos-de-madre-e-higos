
package MayorDeLosHijos;
import javax.swing.JOptionPane;

public class Principal {
  public static void main(String[] args) {
        
     int  telefono = 0, edad=0, edad1=0, edad2=0, abs, opcion, mayor;
     String lugar = null,nombre = null,nombre1 = null, nombre2 = null; 
     
     do{
     opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n "
             + "seleccione una opcion: \n\n"
             + "1. Datos de la madre \n"
             + "2. Datos del primer hijo \n"
             + "3. Datos del segundo hijo\n"
             + "4. comparar edades \n"
             + "5. Elevar la edad al cubo\n"
             + "6. Mostrar todos los datos de la madre\n"
             + "7. Salir"));
    
         switch(opcion){
            case 1: nombre = JOptionPane.showInputDialog("Digite el nombre de la madre: ");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de telefono: "));
                    lugar = JOptionPane.showInputDialog("Digite su lugar de nacimiento: ");
                break;

                 
            case 2: nombre1 = JOptionPane.showInputDialog("Digite el nombre del primer hijo: ");
                    edad1 = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
                    abs = Math.abs(edad1);
                    JOptionPane.showMessageDialog(null, "1. Edad del primer hijo " + abs);
                break;
                 
            case 3: nombre2 = JOptionPane.showInputDialog("Digite el nombre del segundo hijo: ");
                    edad2 = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
                    abs = Math.abs(edad2);
                    JOptionPane.showMessageDialog(null, "1. Edad del segundo hijo " + abs);
                break;
                 
            case 4: if(Math.abs(edad1) > Math.abs(edad2)){
                         JOptionPane.showMessageDialog(null,"El hijo mayor es " + nombre1 + " y tiene " + Math.abs(edad1) + " años");
                     }else{
                         JOptionPane.showMessageDialog(null,"El hijo mayor es " + nombre2 + " y tiene "+ Math.abs(edad2) + " años"); 
                     }
                break;
                 
            case 5: double edadmadre = Math.pow(edad,3);
                    JOptionPane.showMessageDialog(null,"Los " + edad + " años de edad de la madre elevados al cubo es: " + edadmadre);
                break;
                 
            case 6: JOptionPane.showMessageDialog(null,"EL nombre de la madre es:  " + nombre + "\n"
                    + "tiene: " + edad + " años\n"
                    + "su telefono es: " + telefono + "\n"
                    + "nació en: " + lugar);
                break;
                
            case 7: JOptionPane.showMessageDialog(null,"Gracias...");
                break;
         }        
   }while(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5 || opcion == 6 || opcion != 7);
 }
}

