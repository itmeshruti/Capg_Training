class Trainee {
    int rollno;
    String name;
    float[] marks;   // n subjects

    Trainee(int rollno, String name, float[] marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

public class NMarksBubble {
    public static void main(String[] args) {

        Trainee[] t = {
            new Trainee(1, "Aman", new float[]{80, 75, 70, 60}),
            new Trainee(2, "Ravi", new float[]{80, 75, 85, 50}),
            new Trainee(3, "Neha", new float[]{85, 60, 90, 70}),
            new Trainee(4, "Sita", new float[]{80, 70, 60, 90})
        };

        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - i - 1; j++) {

                if (shouldSwap(t[j], t[j + 1])) {
                    Trainee temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }

        for (Trainee tr : t) {
            System.out.print(tr.rollno + " " + tr.name + " ");
            for (float m : tr.marks) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    static boolean shouldSwap(Trainee a, Trainee b) {
        for (int i = 0; i < a.marks.length; i++) {
            if (a.marks[i] < b.marks[i])
                return true;
            else if (a.marks[i] > b.marks[i])
                return false;
        }
        return false;
    }
}