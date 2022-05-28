public class Question5 {
    static int mark;

    public void grade() {
        if((mark>=91) && (mark<=100)) {
            System.out.println("AA");
        }
        else if((mark>=81) && (mark<=90)) {
            System.out.println("AB");
        }
        else if((mark>=71) && (mark<=80)) {
            System.out.println("BB");
        }
        else if((mark>=61) && (mark<=70)) {
            System.out.println("BC");
        }
        else if((mark>=51) && (mark<=60)) {
            System.out.println("CD");
        }
        else if((mark>=41) && (mark<=50)) {
            System.out.println("DD");
        }
        else if(mark<=40) {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        mark = 100;
        Question5 enterMark = new Question5();
        enterMark.grade();
    }

}
