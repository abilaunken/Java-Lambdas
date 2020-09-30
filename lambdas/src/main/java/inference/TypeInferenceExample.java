package inference;

public class TypeInferenceExample {
    public static void main(String[] args) {

        printLambda(s -> System.out.println(s.length()));
    }

    public static void printLambda(TypeInferece t){
        t.exec("Print Lambda");
    }

    interface TypeInferece{
        void exec(String s);
    }
}
