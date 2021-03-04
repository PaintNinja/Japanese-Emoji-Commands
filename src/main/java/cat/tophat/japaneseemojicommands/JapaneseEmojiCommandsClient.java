package cat.tophat.japaneseemojicommands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class JapaneseEmojiCommandsClient {
	private static LiteralArgumentBuilder<CommandSource> EMOJI_COMMAND;

	// Initialize commands
	static{
		EMOJI_COMMAND = Commands.literal("emoji");
		for(EmoticonsEnum value : EmoticonsEnum.values())
			EMOJI_COMMAND.then(Commands.literal(value.getName()).executes(ctx -> {
				if(ctx.getSource().getEntity() instanceof ClientPlayerEntity){
					ClientPlayerEntity player = (ClientPlayerEntity) ctx.getSource().getEntity();
					player.sendChatMessage(new TranslationTextComponent(value.getEmoticons()).getString());
				}
				return 1;
			}));
	}

	//Register Commands
	public static void clientOnlyModInit() {
		if (ModList.get().isLoaded("clientcommands")) {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(JapaneseEmojiCommandsClient::enqueueIMC);
		} else {
			COMMANDS_DISPATCHER.register(EMOJI_COMMAND);
			Mod.EventBusSubscriber.Bus.FORGE.bus().get().addListener(ClientCommandsListener::playerChat);
		}
	}

	/* Register Commands to ClientCommands mod*/
	private static void enqueueIMC(InterModEnqueueEvent event){
		InterModComms.sendTo("clientcommands", "client_commands", () -> EMOJI_COMMAND);
	}

	/* Fallback if ClientCommands is not Available*/
	private static CommandDispatcher<CommandSource> COMMANDS_DISPATCHER;
	public static CommandDispatcher<CommandSource> getCommandsDispatcher() {
		return COMMANDS_DISPATCHER == null ? COMMANDS_DISPATCHER = new CommandDispatcher() : COMMANDS_DISPATCHER;
	}
}
