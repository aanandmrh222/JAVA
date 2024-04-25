/*
1. They allow you to write flexible and reusable code by enabling types (classes and
   interfaces) to be parameters when defining classes, interfaces, and methods.
2. Generics provide compile-time type safety by allowing you to enforce that certain
   objects are of a specific type.
3. With generics, you don’t need to cast objects because the type is known.
4. Generics are denoted by angle brackets <>, e.g., List<String> means a list of strings.
5. Diamond Operator: Introduced in Java 7, the diamond operator <> allows you to infer the
   type parameter from the context, simplifying instantiation of generic classes.

 */

class SpecificClass {
    private String things;

    public String getThings() {
        return things;
    }

    public void setThings(String things) {
        this.things = things;
    }
}

class GenericClass<T> {
    private T thing;

    public T getThing() {
        return thing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }
}
