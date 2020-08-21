
/*
? pass any type arguments with the wildcard
 */

interface Fly{}
class Animal<T>
    /*
    when the Generic class itself has Bounded type T parameters declared
    we can only use Type arguments that are related to bounded types
     */
{}

class Bird implements Fly{
    /*
    we use here unbounded wildcard and in the main class we use bounded wildcard
    there might be a problem if we pass any type of argument
     */
    public void add(Animal<?> animalType){}
}

class Eagle extends Bird{

    /*
    to allow only type which is related to Bird hierarchy ONLY
     */
    public void addEagle(Animal<? extends Bird> animalType){}
}

class Rabbit{}

public class UnBoundedWildCard {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Rabbit rabbit= new Rabbit();
        bird.add(new Animal<Object>());

        Eagle eagle=new Eagle();
        /*
        it accepts here inside <> A class Name NOT an Object of a class
        So Bird, Eagle will work
        and Fly interface will not work and Animal they are not extends Bird
         */
        eagle.addEagle(new Animal<Bird>());
    }
}
