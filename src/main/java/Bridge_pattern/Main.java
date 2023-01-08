package Bridge_pattern;

/**
 * 桥接模式
 *
 * 提高了可扩展性，实现细节透明
 *
 * 当一个系统不希望使用继承或者因为多层次继承导致系统类的个数急剧增加时可以考虑使用
 */
public class Main {
    public static void main(String[] args) {
        operatingSystem op=new Mac(new RmvbFile());

        op.play("战狼");
    }
}
