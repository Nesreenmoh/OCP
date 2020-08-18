public class NestedClassesTester {
    public static void main(String[] args) {
        //static variable
        System.out.println(OuterClass.staticField);

        //non-static variable
        OuterClass outerClass=new OuterClass();
        System.out.println(outerClass.instatnceField);

        // static nested class
        OuterClass.staticNestedClass staticNestedClass= new OuterClass.staticNestedClass();

        // non static nested class

        OuterClass.InnerClass innerClass= outerClass.new InnerClass();

        outerClass.instanceMethod();

    }
}
