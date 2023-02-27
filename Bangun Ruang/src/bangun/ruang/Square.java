/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author AFIFA SALSABILA
 */
public class Square {
    
    //Atribute Declaration
    public int lengthOfSquare = 10;
    
    //Methods declaration
    public int calculateAreaSq(){
        int area;
        area = this.lengthOfSquare * this.lengthOfSquare;
        return area;
    }
    
    public int calculatePerimeterSq(){
        int perimeter;
        perimeter = this.lengthOfSquare * 4;
        return perimeter;
    }
}
