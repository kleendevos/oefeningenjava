package be.vdab;

/**
 * Created by vdabcursist on 29/06/2017.
 */
public class Truck {

    private String model;
    private String brand;

    public Truck(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return (this.getClass().getSimpleName() + " " + model + " " + brand);
    }


    public void drive (int distance) {
        if (distance > 100){
            System.out.println ("Ga tanken");
        } else {
            System.out.println ("Voldoende brandstof");
        }return;
    }

    public void wash (int distance) {

        if (distance > 100) {
            System.out.println ("Time for a wash");

        }
    }







    }
