package influenciadoresApplication;

import influenciadoresVo.CanaisYoutubeVO;
import influenciadoresVo.InfluenciadoresVO;

public class InfluenciadoresTeste {
    public static void main(String[] args) {
        CanaisYoutubeVO canal1 = new CanaisYoutubeVO("Canal do fulano", "@canalDoFulano");
        CanaisYoutubeVO canal2 = new CanaisYoutubeVO("Canal do beltrano", "@canalDoBeltrano");
        CanaisYoutubeVO canal3 = new CanaisYoutubeVO("Canal do Joao", "@canalDoJoao");
        CanaisYoutubeVO canal4 = new CanaisYoutubeVO("Canal da Maria", "@canalDaMaria");
        CanaisYoutubeVO canal5 = new CanaisYoutubeVO("Canal do Pedro", "@canalDoPedro");

        InfluenciadoresVO influenciadores = InfluenciadoresVO.getINSTANCE();
        influenciadores.addMembros(canal1);
        InfluenciadoresVO influenciadores2 = InfluenciadoresVO.getINSTANCE();
        influenciadores2.addMembros(canal2);
        InfluenciadoresVO influenciadores3 = InfluenciadoresVO.getINSTANCE();
        influenciadores3.addMembros(canal3);
        InfluenciadoresVO influenciadores4 = InfluenciadoresVO.getINSTANCE();
        influenciadores4.addMembros(canal4);
        InfluenciadoresVO influenciadores5 = InfluenciadoresVO.getINSTANCE();
        influenciadores5.addMembros(canal5);

        System.out.println("Influenciadores 1" + influenciadores);
        System.out.println("--------------------------------");
        System.out.println("Influenciadores 2" + influenciadores2);
        System.out.println("--------------------------------");
        System.out.println("Influenciadores 3" + influenciadores3);
        System.out.println("--------------------------------");
        System.out.println("Influenciadores 4" + influenciadores4);
        System.out.println("--------------------------------");
        System.out.println("Influenciadores 5" + influenciadores5);

    }
}
