/*
Andrew Achusim
03/10/25
Purpose: Create a program that reads and organize information that is stored in hr.txt. For PersonImperialSet.java,
it overrides the add method inheritted from PersonSet.java to convert the height measurements from cm. to in. and the
weight measurements from kg. to lbs.
Sources:
*/
class PersonImperialSet extends PersonSet
{
    public void add(Person p){}

    private double convertHeight(double height){return height;}

    private double convertWeight(double weight){return weight;}
}