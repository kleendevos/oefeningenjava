package be.vdab.bees;

public class Beeworker extends bee {

    //FIELD - MEMBER VARIABLE - INSTANCE VARIABLE

    private int capacity;  //bijna altijd PRIVATE!!!!
    // werker kan zelf zijn eigen capaciteit controleren maar kan niet van buitenaf gecontroleerd worden
    // indien public staat kan capaciteit ook van buitenaf aangepast worden
    // nadeel is wel dat niet kan uitgelezen worden
    private int carriage;
    public String name;

    //CONSTRUCTOR
    public Beeworker(String name,int capacity, int carriage) {
        super(name); // manier om constructor aan te roepen van de superklasse bij!
        this.capacity = capacity;
        this.carriage = carriage;

    }
    
    public Beeworker (String name){
        super(name);

    }


    public boolean gatherNectar (int howMuch){
        // static moet hierin niet vermeld worden!!!!
        System.out.println("be.vdab.bees.Beeworker "+ name + " is gathering some nectar");
        carriage += howMuch;

        if (carriage == capacity) {
            System.out.println (name + "is full" );
            return false;
        } else {
            System.out.println(name + "has "+ (capacity - carriage)+ "left over" );
            return true;

        }

    }

    public boolean gatherNectarFlower (int amount){
        carriage = carriage + amount;

        if (carriage < 9){
            System.out.println (name + " 's carriagelevel " + carriage + ". He keeps on gathering nectar from" );
            return false;
        } else {
            System.out.println(name);
            return true;
        }
    }

    // PROPERTY

    public int getCapacity (){
        return capacity;
        // om ervoor te zorgen dat velden naar buiten toe leesbaar zijn!
    }

    public void setCapacity (int newcapacity){
        capacity = newcapacity;
        // om ervoor te zorgen dat velden naar buiten toe ook aanpasbaar zijn!
    }

    public int getCarriage (){
        return carriage;
    }

    public void setCarriage (int newcarriage){
        carriage = newcarriage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; //this - verwijst naar varriable bovenaan andere manier ipv gebruik te maken van new name en name
    }

    // kan automatisch door op code te klikken en op code - Generate - getters en setters
}
