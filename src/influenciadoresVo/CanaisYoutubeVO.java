package influenciadoresVo;

public class CanaisYoutubeVO {
    public String name;
    public String username;

    public CanaisYoutubeVO(String name, String username) {
        this.name = name;
        this.username = username;
    }

    @Override
    public String toString() {
        return  name + ", " + username;
    }
}
