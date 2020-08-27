import java.util.function.Predicate;

/*
predicate<T> return boolean
has one obstract method boolean test(Object)
has methods test(), and,or, negate
retrun only boolean (primitive)
 */
public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("090790000"));

//        boolean valid = isPhoneNumberValidByPredicate.test("07000000000");
//        System.out.println(valid);

        // we can use and / or
        boolean valid = isPhoneNumberValidByPredicate.or(isPhoneHas3).test("07000000030");
        System.out.println(valid);


    }

    // Predicate Interface has one obstract method test()
    static Predicate<String> isPhoneNumberValidByPredicate = phone->
            phone.startsWith("07") && phone.length()==11;




    static Predicate<String> isPhoneHas3 =
            phone->phone.contains("3");

    //imperative approach of validate a phone Number
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }
}
