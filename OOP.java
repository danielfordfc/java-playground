public class OOP {
    // Static methods are called without creating an instance of the class.
    public static void main(String[] args) {
        System.out.println("Hello World");
        // we create an object, which is an instance of the class
        // new invokes the default constructor of the class

        User u = new User();

        // https://www.youtube.com/watch?v=SulzbcU41kE&list=PL_c9BZzLwBRLW7Kw8bqc_PJqAnjCJI63P&index=2 encapsulation

        // we can access the attributes of the object, including the _name attribute if it is public
        //System.out.println(u._name);
        //System.out.println(u.membership);

        // If the attributes are private, we can only access them through the getter and setter methods
        u.set_name("John");
        System.out.println(u.get_name());

        // We can also use the constructor to set the initial values of the attributes
        UserWithConstructor u_reloaded = new UserWithConstructor("Mark", "Gold");

        // Accessing the attributes will not work because the attributes are privat
        // System.out.println(u_reloaded._name);
        // System.out.println(u_reloaded.membership);

        System.out.println(u_reloaded.get_name());

        // https://www.youtube.com/watch?v=uqRGLMU53LA&list=PL_c9BZzLwBRLW7Kw8bqc_PJqAnjCJI63P&index=3 Method Overloading

    }
}
