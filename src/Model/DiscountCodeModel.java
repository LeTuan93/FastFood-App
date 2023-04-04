package Model;

public class DiscountCodeModel {

    private int numbericalOrder;
    private String name;
    private String code;
    private String discount;
    private String minimumOrder;
    private String expiry;

    public DiscountCodeModel(int numbericalOrder, String name, String code, String discount, String minimumOrder, String expiry) {
        this.numbericalOrder = numbericalOrder;
        this.name = name;
        this.code = code;
        this.discount = discount;
        this.minimumOrder = minimumOrder;
        this.expiry = expiry;
    }

    public int getNumbericalOrder() {
        return numbericalOrder;
    }

    public void setNumbericalOrder(int numbericalOrder) {
        this.numbericalOrder = numbericalOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getMinimumOrder() {
        return minimumOrder;
    }

    public void setMinimumOrder(String minimemOrder) {
        this.minimumOrder = minimumOrder;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
        @Override
    public String toString() {
        return "DiscountCodeModel{" + "numbericalOrder=" + numbericalOrder + ", name=" + name + ", code=" + code + ", discount=" + discount + ", minimumOrder=" + minimumOrder + ", expiry=" + expiry + '}';
    }
}
