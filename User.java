public class User {
    // Attributes
    // public means that they can be accessed from outside the class
    // private means that they can only be accessed within the same class
    // protected means that they can only be accessed within the same package
    private String _name;
    String _membership;

    // Methods

    // This setter method is used to set the value of the _name attribute
    // This attribute is private, so it cannot be accessed from outside the class, only set through this method
    void set_name(String name) {
        _name = name;
    }

    // This getter method is used to get the value of the _name attribute
    // Although the attribute is private, we can access it from outside the class through this method
    String get_name() {
        return _name;
    }
}
