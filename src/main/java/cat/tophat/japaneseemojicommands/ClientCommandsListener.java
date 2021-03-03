package cat.tophat.japaneseemojicommands;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JapaneseEmojiCommands.MODID, value = Dist.CLIENT)
public class ClientCommandsListener {

	@SubscribeEvent
	public static void playerChat(ClientChatEvent event){
		if(event.getMessage().startsWith("/")){
			try{
				ParseResults<CommandSource> parse = JapaneseEmojiCommands.getCommandsDispatcher().parse(event.getMessage().substring(1), Minecraft.getInstance().player.getCommandSource());
				if(parse.getContext().getNodes().size() > 0){
					event.setCanceled(true);
					JapaneseEmojiCommands.getCommandsDispatcher().execute(parse);
				}
			} catch (CommandSyntaxException e) {}
		}
	}
}
