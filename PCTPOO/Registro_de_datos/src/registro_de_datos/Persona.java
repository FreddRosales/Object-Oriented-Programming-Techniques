/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro_de_datos;

/**
 *
 * @author frosa
 */
public class Persona
{
    private String tipoDoc;
    private String numDoc;
    private String paterno;
    private String materno;
    private String nombres;
    private String numCelul;
    private String correo;
    private String regi_lab;
    private String regi_pen;
    private String codigo;
    private static int ultimcorrel=0;
    

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        if (tipoDoc.equalsIgnoreCase("DNI")|| tipoDoc.equalsIgnoreCase("CE"))
        {
            this.tipoDoc = tipoDoc;
        }
        else
        {
            System.out.println(" Tipo de Documento erróneo");
        }
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        if(this.tipoDoc.equalsIgnoreCase("DNI"))
        {
            if(numDoc.length()==8)
            {
                this.numDoc=numDoc;
            }
        }
        else if(numDoc.length()==9)
            {  
            this.numDoc = numDoc;
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
        return numCelul;
    }

    public void setNumCelul(String numCelul) {
        this.numCelul = numCelul;
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
   
    public Persona() {
    }
    
    
    public Persona(String tipoDoc, String numDoc,String nombres, String paterno,
            String materno, String numCelul, String correo, String regi_lab, String regi_pen) {
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;
        this.numCelul = numCelul;
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
    public void VerDatos()
    {
        System.out.println(" Trabajador TipoDoc: " + this.tipoDoc+" NumDoc: "+this.numDoc+
                " Nombre: "+this.nombres+" "+this.paterno+" "+this.materno+" NumCel: "+this.numCelul+" Correo: "+this.correo+" RegLab: "+this.regi_lab + 
                " RegPen: "+ this.regi_pen + " Código: " + this.codigo);
    }
    
}
