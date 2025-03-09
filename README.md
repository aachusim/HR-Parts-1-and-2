# HR-Parts-1-and-2

Instructions for Part 1
For part 1 you need to create three classes: Person, PersonList, and PersonSet. A mostly-blank Main.java has been provided, but you’ll need to fill it in AND you must answer the five questions at the top of the document.

    1. Write a class named Person. This will be a very basic class with three attributes for storing name, height, and weight information. This class should also have a toString method that returns the Person data in a database-ready String format.
    2. Write an interface named PersonList. The interface should have two abstract methods:
        A. add – This method takes a Person as input and returns void. 
        B. get – This method takes an int as input and returns a Person at the corresponding index of the input int.
    3. Write a class named, PersonSet, that implements the interface PersonList. Use an ArrayList and fill in the add and get methods. You may not use any built in Set-type Java classes.
    4. In addition to implementing add and get methods, PersonSet must make sure that no duplicate Persons are added. If you want to use the ArrayList’s built-in contains method to make this easier, you will need to add an equals method to Person. See below for more details.
    5. In the main method in Main:
        A. Instantiate a single Person object as a test. You can make up the data passed to the constructor.
        B. Instantiate a PersonSet object as a test.
        C. Read data in from the file hr.txt and display it on the command prompt.

Instructions for Part 2
You need to write two new classes for part 2: PersonImperialSet and PersonOrderedSet.

    1. Add a toString method to PersonSet that loops through the ArrayList, concatenating the Persons data to a String variable, which is then returned. The format needs to match the format of hr.txt.
    2. Write a class named, PersonOrderedSet. This class should extend PersonSet and override the add method to add Persons in alphabetical order by name.
    3. Write a class named, PersonImperialSet. This class should extend PersonSet and override the add method to convert the height measurement from centimeters to inches and the weight from kilograms to pounds. (Look up the conversions online.)
    4. Modify Main to 
        A. instantiate a PersonOrderedSet and a PersonImperialSet, instead of the PersonSet.
        B. Read in the data from the file, use it to populate both set objects with Persons, and then write out the data into two separate output files (one ordered and one imperial).
        C. I recommend adding methods to the classes to get the data in a text format for writing to file. You should think about which class is most appropriate for this method (or methods) to be implemented in order to reduce code duplication.
        D. Output the formatted data with header to two separate files named: hr_imperial_set_output.txt and hr_ordered_set_output.txt
        E. Lastly, output the ordered data and the imperial data to the screen/console, nicely formatted in rows and labeled columns (this nice formatting should already be in use if you wrote your toString methods well).
