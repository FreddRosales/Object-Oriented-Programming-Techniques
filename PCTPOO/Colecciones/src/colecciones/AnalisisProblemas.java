/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;
import java.util.Scanner;
/**
 *
 * @author Jhosep
 */
public class AnalisisProblemas {
    Scanner scan = new Scanner(System.in);
        String rpta = "s";
        Controlador ct=new Controlador();
        
        while(rpta.equalsIgnoreCase("s"))
        {
            System.out.println(" Ingrese el nombre del estudiante");
            String n = scan.nextLine();
            System.out.println(" Ingrese el apellido paterno del estudiante");
            String p = scan.nextLine();
            System.out.println(" Ingrese el apellido materno del estudiante");
            String m = scan.nextLine();
            System.out.println(" Ingrese el tipo de documento");
            String td=scan.nextLine();
            System.out.println(" Ingrese el número de documento");
            String nd = scan.nextLine();
            System.out.println(" Ingrese la edad");
            int e = scan.nextInt();
            scan.nextLine();//para que limpie
            System.out.println(" Ingrese el número de celular");
            int cel = scan.nextInt();
            scan.nextLine();
            System.out.println(" Ingrese su correo electrónico");
            String corr = scan.nextLine();
                Asistente asi =new Asistente();
            
            asi.setNombre(n);
            asi.setPaterno(p);
            asi.setMaterno(m);
            asi.setTipo_documento(td);
            asi.setNum_documento(nd);
            asi.setEdad(e);
            asi.setCelular(cel);
            asi.setCorreo(corr);
            asi.VerDatos();
            ct.Agregar(asi);
                System.out.println(" Desea agregar otro estudiante? s/n");
                rpta = scan.nextLine();
            
        }
        System.out.println(" Listando los estudiantes");
        ct.Listar();
}
