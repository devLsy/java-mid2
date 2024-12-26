package generic.hero;

public class HeroMainV1 {

    public static void main(String[] args) {
        CaptinAmericaBox captinAmericaBox = new CaptinAmericaBox();
        IronManBox ironManBox = new IronManBox();

        CaptinAmerica captinAmerica = new CaptinAmerica("캡아2세대", 40);
        IronMan ironMan = new IronMan("아이언맨", 50);

        //캡아 전용 박스
        captinAmericaBox.set(captinAmerica);
        captinAmericaBox.printInfo();

        //아이언맨 전용 박스
        ironManBox.set(ironMan);
        ironManBox.printInfo();
        //캡아 전용 박스에는 다른 영웅을 담을 수 없음
        //captinAmericaBox.set(ironMan);
        
        /*타입 안정성은 지켜지지만 재사용성은 없음
        토르, 헐크, 블랙 위도우 같은 영웅을 더 추가하려면?
        Thor class, ThorBox와 같이 계속 클래스를 추가해야 된다.*/

        CaptinAmerica biggerCaptin = captinAmericaBox.bigger(new CaptinAmerica("캡아1세대", 300));
        System.out.println("biggerCaptin = " + biggerCaptin);
    }
}
