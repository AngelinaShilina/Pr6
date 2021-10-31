package Lab6;

public class Student{
    private int ball;
    private String name;
    public int[] IDNumber = {30,40,50,10,90};
    public Student(int ball, String name) {
        this.ball = ball;
        this.name = name;
    }
    public void InsertSort() {
        for (int left = 0; left < IDNumber.length; left++) {
            // Вытаскиваем значение элемента
            int value = IDNumber[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < IDNumber[i]) {
                    IDNumber[i + 1] = IDNumber[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            IDNumber[i + 1] = value;
        }
    }
    public void mergeArrays(Student[] a1, Student[] a2) {
        int[] a3 = new int[a1.length + a2.length];

        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {

            if (i > a1.length-1) {
                int a = a2[j].ball;
                a3[k] = a;
                j++;
            }
            else if (j > a2.length-1) {
                int a = a1[i].ball;
                a3[k] = a;
                i++;
            }
            else if (a1[i].ball > a2[j].ball) {
                int a = a1[i].ball;
                a3[k] = a;
                i++;
            }
            else if (a1[i].ball < a2[j].ball) {
                int b = a2[j].ball;
                a3[k] = b;
                j++;
            }
        }
        System.out.print("[ ");
        for (int l = 0; l < a3.length; l++){
            System.out.print("[ id=");
            System.out.print(a3[l]);
            System.out.print(" ]");
        }
        System.out.print(" ]");
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[id=" + this.ball + ", name=" + this.name + "]";
    }



}
