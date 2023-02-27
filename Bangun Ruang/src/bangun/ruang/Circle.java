/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author AFIFA SALSABILA
 */
public class Circle {
    
    //Atributes declaration
    public float radius = 14f;
    public float phi = 3.14f;
    
    //Methods declarations
    public float calculateAreaCir(){
        float area;
        area = this.phi * this.radius * this.radius;
        return area;
    }
    
    public float calculatePerimeterCir(){
        float perimeter;
        perimeter = this.phi * 2 * this.radius;
        return perimeter;
    }
}
