/*
Andrew Achusim
<<<<<<< HEAD
03/10/25
Purpose: Create a program that reads and organize information that is stored in hr.txt. For Person.java,
a person's name, height, and weight will be stored and returns the data in a database-ready String format.
=======
02/24/25
Purpose: Create a program that reads and organize information that is stored in hr.txt. For Person.java,
a person's name, height, and weight will be stroed and returns the data in a database-ready String format.
>>>>>>> 30da546ff4880359e847e568d1402580677b3d38
Sources:
	Source 1: I reviewed encapsulation @ https://www.w3schools.com/java/java_encapsulation.asp.
    Source 2: I reviewed how to override methods @ https://www.geeksforgeeks.org/overriding-in-java/.
    Source 3: I learned about the instanceof keyword @ https://www.w3schools.com/java/ref_keyword_instanceof.asp.
    Source 4: I learned abouth type casting @ https://www.baeldung.com/java-type-casting.
    Source 5: I learned about the equals method @ https://www.w3schools.com/java/ref_string_equals.asp.
<<<<<<< HEAD
    Source 6: I learned how to implement Comparable to a class @ https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/.
*/

public class Person implements Comparable<Person>
=======
*/

public class Person
>>>>>>> 30da546ff4880359e847e568d1402580677b3d38
{
    // Private variables
    private String name;
    private double height;
    private double weight;

    // constructor
    public Person(String name, double height, double weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // getters
    public String getName(){return name;}
    public double getHeight(){return height;}
    public double getWeight(){return weight;}

    // setters
    public void setName(String name){this.name = name;}
    public void setHeight(double height){this.height = height;}
    public void setWeight(double weight){this.weight = weight;}

    // toString method
<<<<<<< HEAD
    public String toString(){return "Name: " + name + "\tHeight: " + height + "\tWeight: " + weight;}
=======
    public String toString(){return "Name: " + name + "\tHeight: " + height + " cm" + "\tWeight: " + weight + " kg";}
>>>>>>> 30da546ff4880359e847e568d1402580677b3d38

    // Equals method outline
    @Override
    public boolean equals(Object o)
    {
        // if Object o is null then return false.
        if(o == null){return false;}
        // if Object o == this then return true.
        if(this == o){return true;}
        // if Object o is not an instance of Person then return false.
        if(!(o instanceof Person)){return false;}
        // Declare a veriable of type Person and assign it to Object o cast as type Person.
        Person p = (Person) o;
        // if Person p has the same name, height, and weight as this then return true.
        // else return false.
        return this.name.equals(p.name) && this.height == p.height && this.weight == p.weight;
    }

<<<<<<< HEAD
    @Override
    public int compareTo(Person p){return this.name.compareTo(p.name);}
=======
>>>>>>> 30da546ff4880359e847e568d1402580677b3d38

}