package cat.tophat.japaneseemojicommands;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(JapaneseEmojiCommands.MODID)
public class JapaneseEmojiCommands {


    public static final String NAME = "Japanese Emoji Commands";
    public static final String MODID = "japaneseemojicommands";
    public static final Logger LOGGER = LogManager.getLogger(NAME);


    public JapaneseEmojiCommands(){
        LOGGER.info("Spawning in the kitty's...");
        LOGGER.info("Getting the kitty's dressed up...");
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> JapaneseEmojiCommandsClient::clientOnlyModInit);
    }

}