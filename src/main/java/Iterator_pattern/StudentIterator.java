package Iterator_pattern;

/**
 * 抽象迭代器角色接口
 */
public interface StudentIterator {

    boolean hasNext();

    Student next();
}
