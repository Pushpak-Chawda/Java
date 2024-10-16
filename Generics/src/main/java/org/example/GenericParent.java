package org.example;

public class GenericParent<T>{
    private T data;

    public GenericParent(T data){
        this.data=data;
    }

}
class GenericSubClass<T> extends GenericParent<T> {

    public GenericSubClass(T data) {
        super(data);
    }
}

class SpecificSubClass extends GenericParent<String>{

    public SpecificSubClass(String data) {
        super(data);
    }
}
