// Compile: javac HelloWorld.java
// Usage: java HelloWorld arg1 arg2

// print(f"Hello world! {arg1}") # Pythonic representation

public class HelloWorld{

    public static void main(String[] args){

        System.out.println("Hello World!" + " " + args[0] + " " + args[1]);
        System.out.println(String.format("Hello World! %s %s", args[0],args[1]));
    }
}

