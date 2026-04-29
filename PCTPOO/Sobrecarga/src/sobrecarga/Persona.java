/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author ACER
 */
public class Persona 
{
    private String tipodoc;
    private String numdoc;
    private String paterno;
    private String materno;
    private String nombres;
    private String numcel;
    private String correo;
    private String regi_lab;
    private String regi_pen;
    private String codigo;
    private static int ultimcorrel=0;

    public String getTipoDoc() {
        return tipodoc;
    }

    public void setTipoDoc(String tipoDoc) {
        if (tipoDoc.equalsIgnoreCase("DNI")|| tipoDoc.equalsIgnoreCase("CE"))
        {
            this.tipodoc = tipoDoc;
        }
        else
        {
            System.out.println(" Tipo de Documento erróneo");
        }
    }

    public String getNumDoc() {
        return numdoc;
    }

    public void setNumDoc(String numDoc) {
        if(this.tipodoc.equalsIgnoreCase("DNI"))
        {
            if(numDoc.length()==8)
            {
                this.numdoc=numDoc;
            }
        }
        else if(numDoc.length()==9)
            {  
            this.numdoc = numDoc;
            }
        else
        {
            System.out.println(" Error");
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNumCelul() {
        return numcel;
    }

    public void setNumCelul(String numCelul) {
        this.numcel = numCelul;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRegi_lab() {
        return regi_lab;
    }

    public void setRegi_lab(String regi_lab) {
        this.regi_lab = regi_lab;
        if (this.regi_lab.equalsIgnoreCase("CAS") || this.regi_lab.equalsIgnoreCase("276"))
        {
            this.regi_lab=regi_lab;
        }
        else if(this.regi_lab.equalsIgnoreCase("728"))
        {
            this.regi_lab=regi_lab;
        }
        else
        {
            System.out.println(" Error!!");
        }
    }

    public String getRegi_pen() {
        return regi_pen;
    }

    public void setRegi_pen(String regi_pen) {
        this.regi_pen = regi_pen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static int getUltimcorrel() {
        return ultimcorrel;
    }

    public static void setUltimcorrel(int ultimcorrel) {
        Persona.ultimcorrel = ultimcorrel;
    }
    public class ValidarDatos {

    public static boolean esNumeroEntero(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean esTextoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean esEdadValida(int edad) {
        return edad > 0 && edad < 120;
    }

    public static boolean esCorreoValido(String correo) {
        return correo != null && correo.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$");
    }
}
   
    public Persona() {
    }
    
    
    public Persona(String tipoDoc, String numDoc,String nombres, String paterno,
            String materno, String numCelul, String correo, String regi_lab, String regi_pen) {
        this.tipodoc = tipoDoc;
        this.numdoc = numDoc;
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;
        this.numcel = numCelul;
        this.correo=correo;
        this.regi_lab = regi_lab;
        this.regi_pen = regi_pen;
    }
    
    public static String Generar_codigo()
    {
        ultimcorrel = ultimcorrel + 1;
        String codigogen = String.format("T%05d", ultimcorrel);
        return codigogen;
        
    }
    
}
