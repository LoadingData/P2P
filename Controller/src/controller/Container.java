/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;

/**
 *
 * @author Jeroen
 */
public class Container {
    
    // EVT. PUBLIC FINAL? VRAGEN AAN JOS;
    
    private String aankomst_datum;
    private String aankomst_tijd;
    private String aankomst_vervoer;
    private String aankomst_bedrijf;
    
    private String vertrek_datum;
    private String vertrek_tijd;
    private String vertrek_vervoer;
    private String vertrek_bedrijf;
    
    private String eigenaar;
    private int container_nr;
    private int gewicht_leeg;
    private int gewicht_inhoud;
    private String inhoud;
    private  String soort;
    private String gevaar;
    private String ISO;
    
    public int x;
    public int y;
    public int z;
    
    private int dag;
    private int maand;
    private int jaar;
    
    private Date vertrek_date;
    
    public Container(String aankomst_datum, String aankomst_tijd, String aankomst_vervoer, String aankomst_bedrijf, String vertrek_datum, String vertrek_tijd, String vertrek_vervoer, String vertrek_bedrijf,
    String eigenaar, int container_nr, int gewicht_leeg, int gewicht_inhoud, String inhoud, String soort, String gevaar, String ISO, int x, int y, int z, int dag, int maand, int jaar)
    {
        this.aankomst_datum = aankomst_datum;
        this.aankomst_tijd = aankomst_tijd;
        this.aankomst_vervoer = aankomst_vervoer;
        this.aankomst_bedrijf = aankomst_bedrijf;
        
        this.vertrek_datum = vertrek_datum;
        this.vertrek_tijd = vertrek_tijd;
        this.vertrek_vervoer = vertrek_vervoer;
        this.vertrek_bedrijf = vertrek_bedrijf;
        
        this.eigenaar = eigenaar;
        this.container_nr = container_nr;
        this.gewicht_leeg = gewicht_leeg;
        this.gewicht_inhoud = gewicht_inhoud;
        this.inhoud = inhoud;
        this.soort = soort;
        this.gevaar = gevaar;
        this.ISO = ISO;
        
        this.x = x;
        this.y = y;
        this.z = z;
                
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }
    public Container(){
        
    }
    
    public String getAankomst_datum(){ return this.aankomst_datum; }
    public String getAankomst_tijd(){ return this.aankomst_tijd; }
    public String getAankomst_vervoer(){ return this.aankomst_vervoer; }
    public String getAankomst_bedrijf(){ return this.aankomst_bedrijf; }
    
    public String getVertrek_datum(){ return this.vertrek_datum; }
    public String getVertrek_tijd(){ return this.vertrek_tijd; }
    public String getVertrek_vervoer(){ return this.vertrek_vervoer; }
    public String getVertrek_bedrijf(){ return this.vertrek_bedrijf; }
    
    public String getEigenaar(){ return this.eigenaar; }
    public int getContainer_nr(){ return this.container_nr; }
    public int getGewicht_leeg(){ return this.gewicht_leeg; }
    public int getGewicht_inhoud(){ return this.gewicht_inhoud; }
    public String getInhoud(){ return this.inhoud; }
    public String getSoort(){ return this.soort; }
    public String getGevaar(){ return this.gevaar; }
    public String getISO(){ return this.ISO; }
   
    public int getX(){ return this.x; }
    public int getY(){ return this.y; }
    public int getZ(){ return this.z; }
    
       
    public Date getDeparture_date()
    {
        vertrek_date.setDate(dag);
        vertrek_date.setMonth(maand);
        vertrek_date.setYear(jaar);
        return vertrek_date;
        
    }
       
    
}
