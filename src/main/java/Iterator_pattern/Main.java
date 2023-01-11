package Iterator_pattern;

/**
 * 迭代器模式
 * 支持以不同的方式遍历聚合对象
 */
public class Main {
    public static void main(String[] args) {
        StudentAggregateImpl studentAggregate=new StudentAggregateImpl();

        studentAggregate.addStudent(new Student("张三",12));
        studentAggregate.addStudent(new Student("李四",15));
        studentAggregate.addStudent(new Student("王五",20));
        studentAggregate.addStudent(new Student("赵六",14));

        StudentIterator iterator = studentAggregate.getStudentIterator();
        while (iterator.hasNext()){
            Student stu=iterator.next();
            System.out.println(stu.toString());
        }
    }
}
