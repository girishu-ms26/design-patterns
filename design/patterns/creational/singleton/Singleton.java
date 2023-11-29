package design.patterns.creational.singleton;

public class Singleton {

   private static Singleton singletonObject;

   public static Singleton getInstance() {
       if(singletonObject == null) {
           synchronized (Singleton.class) {
               if(singletonObject == null) {
                   singletonObject = new Singleton();
               }
           }
       }
       return singletonObject;
   }
}
