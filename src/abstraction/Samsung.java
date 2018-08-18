package abstraction;

public class Samsung extends MordernTelevision implements Television {
    public void off() {
        System.out.println("Press the power botton for ON");
         
    }
    public void on() {
        System.out.println("Press the power botton for OFF");
         
    }
    public void sreeensize() {
        System.out.println("Sreensize is 55 inch ");
     
    }
    public void mordernfeature() {
        System.out.println(" 4K Display Sreen");
         
    }
 
}