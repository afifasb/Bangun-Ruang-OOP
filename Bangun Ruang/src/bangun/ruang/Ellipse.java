/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author AFIFA SALSABILA
 */
public class Ellipse {
    //Atributes declaration
    public float majorRad = 12f;
    public float minorRad = 11.8f;
    public float phi = 3.14f;
    
    //Methods declaration
    public float calculateAreaEll(){
        float area;
        area = this.phi * this.majorRad * this.minorRad;
        return area;
    }
    
    public float calculatePerimeterEll(){
        float perimeter;
        perimeter = this.phi * 2 * this.majorRad;
        return perimeter;
    }
}
