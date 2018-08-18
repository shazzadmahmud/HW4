package encapsulation;

public class TestMobile {
	 
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.setMobilBrnd("Iphone");
        mb.setMobileFeatures("Ratina Display");
        mb.setMobileColor("Gold");
        mb.setMobileModel(6);
         
        System.out.println( mb.getMobilBrnd()+ " "+ mb.getMobileFeatures()+ " " + mb.getMobileColor() + " " + mb.getMobileModel());
                    
 
    }
}