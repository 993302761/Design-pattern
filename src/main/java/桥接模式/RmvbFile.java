
package 桥接模式;

public class RmvbFile implements VideoFile{
    @Override
    public void decode(String FileName) {
        System.out.println("rmvb视频:"+FileName);
    }
}
