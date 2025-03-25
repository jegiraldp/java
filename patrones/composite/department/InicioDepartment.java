public class InicioDepartment {

    public static void main(String[] args) {
        
        FinancialDepartment fd = new FinancialDepartment(05, "Financial Department");
        SalesDepartment sd = new SalesDepartment(06, "Sales Department");
        HeadDepartment hd = new HeadDepartment(01, "Head Department");

        fd.printDepartmentName();
        sd.printDepartmentName();
        System.out.println("//////////////");
        hd.addDepartment(fd);
        hd.addDepartment(sd);
        hd.printDepartmentName();
        System.out.println("//////////////");
        hd.removeDepartment(fd);
        hd.printDepartmentName();
        

    }
    
}
