import org.w3c.dom.ls.LSOutput;

public class OuterClass {
   public static int  staticField;
    int instatnceField;

    OuterClass(){
        instatnceField =1;
        System.out.println("Hello from OuterClass constructor");
    }
    // static nested class
    public static class staticNestedClass{

       public staticNestedClass(){
           System.out.println("Hello from static Nested class constructor");
           System.out.println(staticField);
        }
    }

    //inner nested class
    public class InnerClass{
        //is associated with an instance of the enclosing class
        // can access static and non-static members of the outerclass
        int instanceField;

        // constructor
        public InnerClass(){
            instanceField=100;
            System.out.println("Hello from innerClass constructor");
            System.out.println("Static Field "+ staticField);
            System.out.println("Instatnce Field "+ instanceField);
            System.out.println("OuterClass instanceField "+ OuterClass.this.instatnceField);

        }
    }

    // local innerClass

    public void instanceMethod(){
        final int localVar=300;



        class LocalClass{
            //constructor
            public LocalClass(){
                System.out.println("Local Class constructor");
                System.out.println("localVars "+ localVar);
            }
        }
        // instance of the local class
        LocalClass localClass=new LocalClass();

        // anonymous class
        Object anonymousClass= new Object(){


            @Override
            public String toString(){

                System.out.println(localVar);
                return "Hello Anonymous class";

            }
        };
        System.out.println(anonymousClass);
    }
}
