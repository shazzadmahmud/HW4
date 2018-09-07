package encapsulation;

public class Mobile {
    private int mobileModel;
    private String mobilBrnd;
    private String mobileColor ;
    public String MobileFeatures;
    public int getMobileModel() {
        return mobileModel;
    }
    public void setMobileModel(int mobileModel) {
        this.mobileModel = mobileModel;
    }
    public String getMobilBrnd() {
        return mobilBrnd;
    }
    public void setMobilBrnd(String mobilBrnd) {
        this.mobilBrnd = mobilBrnd;
    }
    public String getMobileColor() {
        return mobileColor;
    }
    public void setMobileColor(String mobileColor) {
        this.mobileColor = mobileColor;
    }
    public String getMobileFeatures() {
        return MobileFeatures;
    }
    public void setMobileFeatures(String mobileFeatures) {
        MobileFeatures = mobileFeatures;
    }
}