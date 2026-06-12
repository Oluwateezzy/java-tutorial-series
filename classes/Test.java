// Minor Note on Method Invocation & Implicit Narrowing Conversion
// Here is a minor note on method invocation that we missed in the last lecture.

// We know that in the following statements, an int literal is being assigned to b & s. Since int is a larger data type, there is an implicit narrowing conversion [1] that is happening, i.e., from int to byte and int to short. Such implicit narrowing conversion is not possible with method (or constructor) invocation.

// byte b = 65;

// short s = 65;

// If we consider the following class, the overloaded methods go and the constructor have only byte or short parameters. We have compile-time errors in the statements when we are passing int literals. So, there is no implicit narrowing conversion that is happening as in the case of above assignment statements [2]. Java designers have decided to go against implicit narrowing conversion in method (or constructor) invocations as that would add additional complexity when resolving overloaded methods.

public class Test {
    Test(byte a, byte b){}
    static int go(byte a, byte b){
        return a + b;
    }

    static int go(short a, short b) {
        return a - b;
    }

    public static void main(String[] args) {
        byte b1 = 65, b2 = 65;

        System.out.println(go(b1, b2));
        // System.out.println(go(65, 65));

        Test test1 = new Test(b1, b2);
        // Test test2 = new Test(65, 65);
    }
}