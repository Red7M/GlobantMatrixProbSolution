package Generics;

public class GenericsMain {

    /**
     * Generics Problems & Solutions
     *
     * Problem 1:
     * Create two instances from a generic class, where:
     * The first instance is valid with no compiler warnings,
     * The second instance is valid but does throw warnings.
     *
     * Problem 2:
     * Create a generic interface
     *
     * Problem 3:
     * Use a generic method in order to compare if two generic types are similar
     *
     * Problem 4:
     * Create a case of inheritance using generics
     */
    public static void main(String[] args) {
        // Problem One
        GenericsTypeProblemOne<String> genericsTypeProblemOne_One = new GenericsTypeProblemOne<>();
        genericsTypeProblemOne_One.setType("This is generic problem number one, instance one");

        GenericsTypeProblemOne genericsTypeProblemOne_Two = new GenericsTypeProblemOne();
        genericsTypeProblemOne_Two.setType("This is generic problem number one, instance two"); //Raw Type Warning
        genericsTypeProblemOne_Two.setType(2019); //Raw Type Warning

        // Problem Three:
        GenericsTypeProblemOne<String> genericsOne = new GenericsTypeProblemOne<>();
        genericsOne.setType("Problem three generic");

        GenericsTypeProblemOne<String> genericTwo = new GenericsTypeProblemOne<>();
        genericTwo.setType("Problem three generic");

        boolean areGenericsSame = GenericMethod.areGenericsSame(genericsOne, genericTwo);

        System.out.println("are generics in problem 3 the same? " + (areGenericsSame ? "Yes" : "No"));

        // Problem four:
        String problemFourStr = "problem four";
        Object obj = new Object();
        obj = problemFourStr;

        GenericInheritance<String> genericInheritanceStr = new GenericInheritance<>();
        GenericInheritance<Object> genericInheritanceObj = new GenericInheritance<>();

        //genericInheritanceObj = genericInheritanceStr; (compiler error)
        obj = genericInheritanceStr;
    }

    /**
     * Problem 1 (Solution):
     * Parameterize the first instance with a String made the IDE NOT throw a compiler warning.
     * Where in the second instance, we did not pass a parameter, hence being able to set type
     * as String or Integer. The second solution does work, but the downside is that it needs
     * typecasting, otherwise it can produce runtime errors.
     *
     * Problem 2: (Solution):
     * Creating a Generic type interface (GenericInterface)that uses the same type in its
     * parameter method
     *
     * Problem 3: (Solution):
     * Console result: are generics in problem 3 the same? Yes
     *
     * Problem 4: (Solution):
     * In the first instance, we pass a string value to an object, which is a valid operation,
     * since Object class is parent of String class.
     *
     * In the second instance, we pass a GenericInheritance class of instance type String to a
     * GenericInheritance class of instance type object. That does throw a compiler error since
     * GenericInheritance is of type String and not of type Object.
     *
     * In the third and last instance, we pass a GenericInheritance of type String to an Object
     * class. This is valid since Object class is a parent.
     */
}
