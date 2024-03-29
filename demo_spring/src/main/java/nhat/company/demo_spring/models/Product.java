package nhat.company.demo_spring.models;

import org.springframework.expression.ConstructorResolver;

import com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase;

public class Product {
    private String x1;
    private String x2;
    public Product(String x1,String x2){
        this.x1 = x1;
        this.x2 = x2;
    }
    public String AddSum(){
        return x1+x2;
    }
    
}
