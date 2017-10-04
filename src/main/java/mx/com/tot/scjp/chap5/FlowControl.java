package mx.com.tot.scjp.chap5;

public class FlowControl {

    /**
     *
     * You can have zero or one else for a given if, and it must come after any else if s.
     * You can have zero to many else ifs for a given if and they must come before the (optional) else.
     * Once an else if succeeds, none of the remaining else ifs or else s will be tested.
     */
    public static void  ifElseTest() {
        int x = 3;
        if(x == 3) {
            System.out.println("X == 3");
        }
        else if(x == 4) {
            System.out.println("X == 4");
        }
        //Else block is optional even with else if
    }

    public static void elseTest() {
        class Exam {
            public boolean done() {
                return true;
            }

            public double getScore() {
                return 0.62;
            }
        }
        Exam exam = new Exam();

        if (exam.done())
            if (exam.getScore() < 0.61)
                System.out.println("Try again.");
        // Which if does this belong to?
        else System.out.println("Java master!");
    }

    public static boolean doStuff() {
        return true;
    }

    public static void witchPrints() {
        int y = 5;
        int x = 2;
        if (x > 3 && y < 2 | doStuff()) {
            System.out.println("true");
        }

    }

    public static void main(String[] args) {
        FlowControl.witchPrints();
    }
}
