public class Part implements Cloneable{
    String partName;
    Integer partId;
    Part(String name, int id){
        this.partId=id;
        this.partName=name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return String.format("PartName:%s , PartId:%d",partName,partId);
    }
}
