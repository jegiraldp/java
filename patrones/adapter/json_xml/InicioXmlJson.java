package adapter.json_xml;

public class InicioXmlJson {

    public static void main(String[] args) {
        EmployeeXml employeeXml = new EmployeeXml("jorge", 12);
        System.out.println("XML Employee");
        System.out.println(employeeXml.toXml());
        System.out.println("JSON Employee");
        JsonTarget xtj = new XmlToJsonAdapter(employeeXml);
        System.out.println(xtj.toJson());
    }
    
}
