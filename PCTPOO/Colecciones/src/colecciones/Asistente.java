/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

/**
 *
 * @author ACER
 */
public class Asistente 
{
    private String tipo_documento;
    private String num_documento;
    private String paterno;
    private String materno;
    private String nombre;
    private int celular;
    private String correo;
    private int edad;
    private String categoria;

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) 
    {
        if(tipo_documento.equalsIgnoreCase("DNI") || tipo_documento.equalsIgnoreCase("CE"))
        {
            this.tipo_documento = tipo_documento;
        }
        else
        {
            System.out.println(" ¡Error!");
        }
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) 
    {
        if (this.tipo_documento.equalsIgnoreCase("DNI"))
        {
            if(num_documento.length()== 8)
            {
               this.num_documento = num_documento;
            }
            else
            {
                System.out.println(" ¡Error!");
            }
        }
        else if(this.tipo_documento.equalsIgnoreCase("CE"))
            {
                if(num_documento.length()==9)
                {
                    this.num_documento = num_documento;
                }
                else
                {
                    System.out.println(" ¡Error!");
                }
            }
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) 
    {
        String num_celu = String.valueOf(celular); //convierte un int en String
        if(num_celu.length() == 9)
        {
            this.celular = celular;
        }
        else
        {
            System.out.println(" ¡Error!");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) 
    {
        if (edad >= 0 && edad < 100) {
        this.edad = edad; // Asignamos primero
        this.Categorizar();
        } else {
        System.out.println(" ¡Edad fuera de los parámetros!");
        }
    }

    public void Categorizar()
    {
        if (this.edad <= 10) {
        this.categoria = "Niño";
        } else if (this.edad <= 17) {
        this.categoria = "Adolescente";
        } else {
        this.categoria = "Adulto";
        }
    }
}
