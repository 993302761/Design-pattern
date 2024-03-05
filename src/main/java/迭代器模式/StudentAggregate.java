package 迭代器模式;

/**
 * 抽象聚合角色接口
 */
public interface StudentAggregate {

    void addStudent(Student student);

    void removeStudent(Student student);

    //获取迭代器对象
    StudentIterator getStudentIterator();
}
