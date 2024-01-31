public class UserWithConstructor {

    // Attributes
    private String _name;
    private String _membership;

    //Constructor is a special method that is called when an object is created
    //It has the same name as the class
    //It does not have a return type
    //It is used to set initial values for object attributes
    public UserWithConstructor(String name, String membership) {
        // Generally, variables named with an underscore are referring to the attribute of the current object
        _name = name;
        // this is a keyword that refers to the current object
        _membership = membership;
    }

    // Methods
    // I dont need a setter method for name because I set it in the constructor
    // void set_name(String name) {
    //    _name = name;
    // }

    String get_name() {
        return _name;
    }
}
