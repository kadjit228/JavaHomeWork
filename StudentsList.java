public class studentsList {
    int k;
    String[] stList;
    int[] gradeList;

    studentsList(int kol, String[] studList) {
        this.k = kol;
        this.stList = new String[kol];
        this.stList = studList;
        this.gradeList = new int[kol];
    }

    int randomSt() {
        Boolean fl = false;

        int a;
        for(a = 0; a < this.k; ++a) {
            if (this.gradeList[a] == 0) {
                fl = true;
                break;
            }
        }

        if (!fl) {
            System.out.print("You asked all Students\n");
            return -1;
        } else {
            for(a = (int)(Math.random() * (double)this.k); this.gradeList[a] != 0; a = (int)(Math.random() * (double)this.k)) {
            }

            System.out.print("You asked ");
            System.out.println(this.stList[a]);
            return a;
        }
    }

    void takeMark(int mark, int position) {
        this.gradeList[position] = mark;
    }

    void WhoWithMark() {
        for(int i = 0; i < this.k; ++i) {
            if (this.gradeList[i] != 0) {
                System.out.print(this.stList[i]);
                System.out.print(" ");
                System.out.println(this.gradeList[i]);
            }
        }
    }

    void AllStudents() {
        for(int i = 0; i < this.k; ++i) {
            System.out.println(this.stList[i]);
        }
    }
}
