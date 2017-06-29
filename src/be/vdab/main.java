package be.vdab;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by vdabcursist on 29/06/2017.
 */
public class main {

    @SuppressWarnings(value = "unchecked")
    public static void main(String[] args) {

        Truck car = new Truck("X1", "BMW");
        System.out.println(car);

        Class clazz = car.getClass();

        car.drive(150);
        car.wash(600);

       // System.out.println(Arrays.toString(clazz.getMethods()));

        System.out.println(" ");
        System.out.println("Fields ");

        Field [] f = clazz.getDeclaredFields();
        for (int i = 0; i<f.length; i++){
            Field f1 = f[i];
            System.out.print(f[i].getName()+" ");
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Methods");


        Method[] m = clazz.getMethods();
        for (int i = 0; i<m.length;i++){
            Method m1 = m[i];
            System.out.print(m[i].getName() + " / ");
        }


        }




    }





