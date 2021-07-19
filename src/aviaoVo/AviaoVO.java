package aviaoVo;

import java.util.ArrayList;
import java.util.List;

public class AviaoVO {
    private static AviaoVO INSTANCE;
    public List<String> assentos;

    private AviaoVO(){
        this.assentos = new ArrayList<>();
        assentos.add("1A");
        assentos.add("1B");
        assentos.add("2A");
        assentos.add("2B");
        assentos.add("3A");
    }

    public static AviaoVO getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new AviaoVO();
        }
        return INSTANCE;
    }

    public List<String> bookSeat (String assento){
        assentos.remove(assento);
        return assentos;
    }

    @Override
    public String toString() {
        return "AviaoVO{" +
                "assentos=" + assentos +
                '}';
    }
}
