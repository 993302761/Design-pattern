package 迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> students=new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(students);
    }
}
