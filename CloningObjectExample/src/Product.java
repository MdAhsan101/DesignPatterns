public class Product implements Cloneable{
    String name;
    Integer serialNo;
    Part part;

    Product(String name, int sn, Part part){
        this.name= name;
        this.serialNo=sn;
        this.part= part;
    }

    //Shallow Cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Deep cloning
    protected  Product deepClone() throws CloneNotSupportedException {
        Product clonedProd= (Product) super.clone();
        clonedProd.part= (Part) this.part.clone();
        return clonedProd;
    }

    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("ProductName:"+name+" , "+"SNo:"+serialNo+" , "+"Part:["+part+"]");
        return sb.toString();
    }
}
