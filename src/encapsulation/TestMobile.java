package encapsulation;

public class TestMobile {
	 
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.setMobilBrnd("iphone");
        mb.getMobilBrnd();
        mb.setMobileColor("White");
        mb.getMobileColor();
         
        System.out.println( mb.getMobilBrnd()+ " "+  mb.getMobileColor());
                    
 
    }
}