package aviaoApplication;

import aviaoVo.AviaoVO;

public class AviaoTeste {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("2A");
        agendarAssento("3A");
        agendarAssento("1B");
        agendarAssento("2B");
    }

    public static void agendarAssento(String assento){
        AviaoVO aviaoVO = AviaoVO.getINSTANCE();
        System.out.println(aviaoVO.bookSeat(assento));
    }
}
