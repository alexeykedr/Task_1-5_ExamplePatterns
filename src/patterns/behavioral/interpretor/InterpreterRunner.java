package patterns.behavioral.interpretor;

public class InterpreterRunner {
    public static void main(String[] args) {
        Explanation isClear  = getExplanation1();
        Explanation isClear2 = getExplanation2();

        System.out.println("Explanation is clear: " +getExplanation1().interpret("1"));
        System.out.println("Explanation2 is clear: " +getExplanation2().interpret("12"));


    }
    public static Explanation getExplanation1(){
        Explanation explain0 = new TermExplanation("0");
        Explanation explain1 = new TermExplanation("1");

        return new  OrExplanation(explain0, explain1);
    }
    public static Explanation getExplanation2(){
        Explanation explain01 = new TermExplanation("01");
        Explanation explain12 = new TermExplanation("12");

        return new  OrExplanation(explain01, explain12);
    }

}
