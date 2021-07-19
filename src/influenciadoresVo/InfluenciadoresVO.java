package influenciadoresVo;

import java.util.ArrayList;
import java.util.List;

public class InfluenciadoresVO {
    private static InfluenciadoresVO INSTANCE;
    private List<CanaisYoutubeVO> membros = new ArrayList<>();

    private InfluenciadoresVO() {

    }

    public static InfluenciadoresVO getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new InfluenciadoresVO();
        }
        return INSTANCE;
    }

    public void addMembros(CanaisYoutubeVO membro){
        membros.add(membro);
    }

    @Override
    public String toString() {
        return "[" +
                "membros = " + membros +
                ']';
    }
}
