package Bridge_pattern;

/**
 * 扩展抽象化角色
 */
public class Mac extends operatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String FileName) {
        videoFile.decode(FileName);
    }
}
