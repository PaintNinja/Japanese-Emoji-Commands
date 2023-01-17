package ga.ozli.minecraftmods.japaneseemojicommands;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(JapaneseEmojiCommands.MOD_ID)
public class JapaneseEmojiCommands {

    private static final Logger LOGGER = LogUtils.getLogger();
    static final String MOD_ID = "japaneseemojicommands";

    public JapaneseEmojiCommands() {
        LOGGER.info(MOD_ID + " starting up");
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> "ANY", (remoteVersion, isFromServer) -> true));
    }
}
