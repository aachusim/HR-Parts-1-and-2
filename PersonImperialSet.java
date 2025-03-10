/*
Andrew Achusim
03/10/25
Purpose: Create a program that reads and organize information that is stored in hr.txt. For PersonImperialSet.java,
it overrides the add method inheritted from PersonSet.java to convert the height measurements from cm. to in. and the
weight measurements from kg. to lbs.
Sources:
    Source 1: I learend what the extends keyword is and does @ https://www.w3schools.com/java/ref_keyword_extends.asp.
    Source 2: I learend what and how to use the super keyword @ https://www.w3schools.com/java/ref_keyword_super.asp.
*/

class PersonImperialSet extends PersonSet
{
    @Override
    public void add(Person p)
    {
        double imperialHeight = convertHeight(p.getHeight());
        double imperialWeight = convertWeight(p.getWeight());

        Person imperialPerson = new Person(p.getName(), imperialHeight, imperialWeight);
        super.add(imperialPerson);
    }

    private double convertHeight(double height){return height / 2.54;}

    private double convertWeight(double weight){return weight / 2.20462;}
}
