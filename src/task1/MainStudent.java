package task1;

public class MainStudent {
    public static void main(String[] args){
        Student student1 = new Student("Vlad","Karpovich","6467476589htr56","C32");
        Student student2 = new Student("Oleg","Savitsky","7358566375ert26","C32");
        Student student3 = new Student("Marina","Yadevich","2785477564hdy83","C32");
        Student student4 = new Student(" Kate","Rublevskaya","485748747ksu29","C32");
        Student student5 = new Student("Dmitry","Hmara","395839585rth23","C32");
Student[] students = {student1,student2,student3,student4,student5};
    for(int i = 0; i < students.length;i++){
        students[i].showStudent();
    }

        }



    }

