package adapter.json_xml;

public class XmlToJsonAdapter implements JsonTarget {

    private EmployeeXml employeeXml;

    public XmlToJsonAdapter(EmployeeXml employeeXml) {
        this.employeeXml = employeeXml;
    }

    @Override
    public String toJson() {
        String elJson="{";
        elJson+="\"name\":\""+employeeXml.name+"\","
        + "\"age\": "+employeeXml.age+"}";
        return elJson;
        
    }
    
}
