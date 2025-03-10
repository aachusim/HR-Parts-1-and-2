/*
Andrew Achusim
<<<<<<< HEAD
03/10/25
Purpose: Create a program that reads and organize information that is stored in hr.txt. For PersonList.java,
it acts as an interface for PersonSet.java.
=======
02/24/25
Purpose: Create a program that reads and organize information that is stored in hr.txt.
>>>>>>> 30da546ff4880359e847e568d1402580677b3d38
Sources:
	Source 1: I learned about interface @ https://www.w3schools.com/java/java_interface.asp.
*/

interface PersonList
{
    // A void method that adds a person and their data to the list.
    public void add(Person p);
    // A Person object that gets data from a specified index value.
    Person get(int index);
}