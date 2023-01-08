package Bridge_pattern;

public class AviFile implements VideoFile{
    @Override
    public void decode(String FileName) {
        System.out.println("avi视频:"+FileName);
    }
}
