package Generics;

class GenericMethod {

    static <T> boolean areGenericsSame(
            GenericsTypeProblemOne<T> genericOne,
            GenericsTypeProblemOne<T> genericTwo) {
        return genericOne.getType().equals(genericTwo.getType());
    }
}
