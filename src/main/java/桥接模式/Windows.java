package 桥接模式;

/**
 * 扩展抽象化角色
 */
public class Windows extends operatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String FileName) {
        videoFile.decode(FileName);
    }
}
