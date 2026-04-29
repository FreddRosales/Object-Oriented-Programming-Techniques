/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registro_de_datos;

/**
 *
 * @author frosa
 */
public class Registro_de_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        p1.setCodigo(Persona.Generar_codigo());
        p1.VerDatos();
        Persona p2 = new Persona("DNI","71298915","Alfonso Roberto","Arnulfo","Rodriguez",
                "946250712","fro216@gmail.com","CAS","AFP");
        p2.setCodigo(Persona.Generar_codigo());
        p2.VerDatos();
        
    }
    
}
