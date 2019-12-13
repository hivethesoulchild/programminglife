/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegecourse;

import java.util.Scanner;

/**
 *
 * @author Shower Flower
 */
public class Package {
    private int weight;
    private String shipmethod;
    private double cost;

    public Package(int weight, String shipMtd) {
        this.weight = weight;
        this.shipmethod = shipMtd;
        this.cost = calcuCost();
    }
    
    public double calcuCost(){
        switch(shipmethod.toUpperCase()){
            case "A":
                if(weight >= 1 && weight <= 8){
                    this.cost = (2);
                }else if(weight >= 9 && weight <= 15){
                    this.cost = (3);
                }else if(weight >= 17){
                    this.cost = (4.50);
                }
                break;
            case "T":
                if(weight >= 1 && weight <= 8){
                    this.cost = (1.50);
                }else if(weight >= 9 && weight <= 15){
                    this.cost = (2.35);
                }else if(weight >= 17){
                    this.cost = (3.25);
                }
                break;
            case "M":
                if(weight >= 1 && weight <= 8){
                   this.cost = (0.50);
                }else if(weight >= 9 && weight <= 15){
                    this.cost = (1.50);
                }else if(weight >= 17){
                    this.cost = (2.15);
                }
                break;
            default:
                System.out.println("Please input a valid shipping character.");
        }
        return this.cost;
    }
    
    public void display(){
        System.out.println("Weight: " + weight);
        System.out.println("Shipping Method: " + shipmethod);
        System.out.println("Shipping Cost: " + calcuCost());
    }
}

class InsuredPackage extends Package{
    private double cost;
    
    public InsuredPackage(int weight, String shipMtd) {
        super(weight, shipMtd);
    }
    
    public double calcuInsurance(){
        if(calcuCost() <= 1){
            this.cost = (calcuCost() + 2.45);
        }if(calcuCost() >= 1.01 && calcuCost() <= 3.00){
            this.cost = (calcuCost() + 3.95);
        }if(calcuCost() >= 3.01){
            this.cost = (calcuCost() + 5.55);
        }
        return this.cost;
    }
    
    public void display(){
        super.display();
        System.out.println("Overall Cost: " + calcuInsurance());
    }
}

class UsePackage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert weight: ");
        int wgth = sc.nextInt();
        System.out.println("Shipping method: ");
        String fill = sc.nextLine();
        String mthd = sc.nextLine();
        
        /*Package notebook = new Package(wgth,mthd);
        notebook.display();*/
        
        InsuredPackage tantra = new InsuredPackage(wgth,mthd);
        tantra.display();
    }
}
