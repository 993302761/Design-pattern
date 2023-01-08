package Bridge_pattern;

/**
 * 操作系统类
 */
public abstract class operatingSystem {

    protected VideoFile videoFile;

    public operatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String FileName);
}
