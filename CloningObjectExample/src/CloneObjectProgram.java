public class CloneObjectProgram {
    public static void main(String[] args) throws CloneNotSupportedException {
        Part samsungDisk= new Part("SamsungHd",123);
        Product product= new Product("Laptop",456,samsungDisk);

        System.out.println("Original Copy: "+product);

        Product shallowCopy= (Product) product.clone();
        product.serialNo=111;
        product.part.partName= "HitachiHD";
        product.part.partId=999;
        System.out.println("### After Modification in original copy 1 ###");
        System.out.println("Original Copy: "+product);
        System.out.println("Shallow Copy: "+shallowCopy);

//        Original Copy: ProductName:Laptop , SNo:456 , Part:[PartName:SamsungHd , PartId:123]
//        ### After Modification in original copy 1 ###
//        Original Copy: ProductName:Laptop , SNo:111 , Part:[PartName:HitachiHD , PartId:999]
//        Shallow Copy: ProductName:Laptop , SNo:456 , Part:[PartName:HitachiHD , PartId:999]

        Part WDElementHD= new Part("WDElementHD",123);
        Product product2= new Product("Laptop",786,WDElementHD);
        Product deepCopy= (Product) product2.deepClone();
        product2.serialNo=687;
        product2.part.partName= "Toshiba";
        product2.part.partId=321;
        System.out.println("Original Copy2: "+product2);
        System.out.println("### After Modification in original copy 2 ###");
        System.out.println("Original Copy: "+product);
        System.out.println("Deep Copy: "+deepCopy);

//        Original Copy2: ProductName:Laptop , SNo:687 , Part:[PartName:Toshiba , PartId:321]
//        ### After Modification in original copy 2 ###
//        Original Copy: ProductName:Laptop , SNo:111 , Part:[PartName:HitachiHD , PartId:999]
//        Deep Copy: ProductName:Laptop , SNo:786 , Part:[PartName:WDElementHD , PartId:123]
    }
}