import java.util.ArrayList;

Public

class ex {
    //String name;
    
    Public static void main(String[] args) {
        //city c =new City("Dallal");
        ArrayList<String> animals= new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("snake");
        System.out.println(animals);
        animals.set(2, "lizard");
        animals.add(1, "fish");
        System.out.println(animals);
        animals.remove(3);
        System.out.println(animals);
        // c.printName();
    }
}