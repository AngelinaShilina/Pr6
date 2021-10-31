package Lab6;
import java.util.Arrays;
public class TestLab6 {
    public static void main(String[] agrs){
        Student student = new Student(10,"Koly");
        student.InsertSort();
        System.out.println(Arrays.toString(student.IDNumber));

        Student[] spisok = new Student[6];
        spisok[0]=new Student(67,"Polina"); //p
        spisok[1]=new Student(45,"Nastya");
        spisok[2]=new Student(30,"Kate");
        spisok[3]=new Student(60,"Misha");
        spisok[4]=new Student(78,"Angelina");
        spisok[5]=new Student(40,"Mary");

        int[] x = {39,39,999,11,0,-2};
        String[] strs = {"sdfsdf","3333","aaaa"};
        Arrays.sort(x);
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        Arrays.sort(spisok, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(spisok));

        Student[] spisok2 = new Student[4];
        spisok2[0]=new Student(67,"Miy");
        spisok2[1]=new Student(98,"Albina");
        spisok2[2]=new Student(15,"Tanya");
        spisok2[3]=new Student(34,"Tom");

        Student[] allspisok = new Student[10];

        //System.arraycopy(spisok,0,allspisok,0,spisok.length);
        //System.arraycopy(spisok2,0,allspisok,spisok.length,spisok2.length);
        //Arrays.sort(allspisok,new SortingStudentsByGPA());
        //student.mergeArrays(spisok, spisok2);
        Arrays.sort(spisok2, new SortingStudentsByGPA());
        Arrays.sort(spisok2, new SortingStudentsByGPA());
        student.mergeArrays(spisok, spisok2);
        //System.out.println(student.mergeArrays(spisok, spisok2););


    }
}
