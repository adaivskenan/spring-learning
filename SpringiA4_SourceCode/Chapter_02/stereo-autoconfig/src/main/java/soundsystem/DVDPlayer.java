/**
 * Created by adaivskenan on 19/07/2017.
 */
package soundsystem;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;

/**
 * 如果MediaPlayer有多继承，那么使用自动装配的测试类CDPlayerTest将会出现异常
 * org.springframework.beans.factory.NoUniqueBeanDefinitionException
 * */
@Component
public class DVDPlayer {
//    public class DVDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public DVDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
