/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author AFIFA SALSABILA
 */
public class Rectangle {
    
    //Atributes declaration
    public int length = 10;
    public int width = 7;
    
    //Methods declaration
    public int calculateAreaRec(){
        int area;
        area = this.length * this.width;
        return area;
    }
    
    public int calculatePerimeterRec(){
        int perimeter;
        perimeter = 2 * (this.length + this.width);
        return perimeter;
    }
    
}
