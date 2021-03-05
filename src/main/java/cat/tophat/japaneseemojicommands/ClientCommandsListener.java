package cat.tophat.japaneseemojicommands;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandSource;
import net.minecraftforge.client.event.ClientChatEvent;

public class ClientCommandsListener {
    public static void playerChat(ClientChatEvent event) {
        if (event.getMessage().startsWith("/")) {
            try {
                ParseResults<CommandSource> parse = JapaneseEmojiCommandsClient.getCommandsDispatcher().parse(event.getMessage().substring(1), Minecraft.getInstance().player.getCommandSource());
                if (parse.getContext().getNodes().size() > 0) {
                    event.setCanceled(true);
                    JapaneseEmojiCommandsClient.getCommandsDispatcher().execute(parse);
                }
            } catch (CommandSyntaxException e) {
            }
        }
    }
}
