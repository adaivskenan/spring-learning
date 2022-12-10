package soundsystem.config;

import org.springframework.context.annotation.Bean;
import soundsystem.CDPlayer;
import soundsystem.CompactDisc;
import soundsystem.SgtPeppers;

/**
 * Created by adaivskenan on 19/07/2017.
 */
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
