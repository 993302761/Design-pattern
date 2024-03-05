package 迭代器模式;

import java.util.List;

/**
 * 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> students;
    //用来记录遍历时的位置
    private int position=0;

    public StudentIteratorImpl(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return position< students.size();
    }

    @Override
    public Student next() {
        return students.get(position++);
    }
}
