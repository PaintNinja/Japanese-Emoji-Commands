package cat.tophat.japaneseemojicommands;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

@Mod(JapaneseEmojiCommands.MOD_ID)
public class JapaneseEmojiCommands {

    public static final String MOD_ID = "japanese-emoji-commands";

    public JapaneseEmojiCommands() {
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> JapaneseEmojiCommandsClient::clientOnlyModInit);
    }
}
