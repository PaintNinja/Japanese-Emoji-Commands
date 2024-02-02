package ga.ozli.minecraftmods.japaneseemojicommands;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Locale;

@Mod.EventBusSubscriber(modid = JapaneseEmojiCommands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeEvents {

    @SubscribeEvent
    public static void onRegisterClientCommands(final RegisterClientCommandsEvent event) {
        final var emojiCommand = Commands.literal("emoji");
        for (final EmoticonsEnum emoticon : EmoticonsEnum.values()) {
            emojiCommand.then(Commands.literal(emoticon.name().toLowerCase(Locale.ROOT))
                .executes(ctx -> {
                        final String emote = Component.translatable(emoticon.getTranslationKey()).getString();

                        if (Minecraft.getInstance().player != null)
                            Minecraft.getInstance().player.connection.sendChat(emote);

                        return 1;
                    }
                ));
        }
        event.getDispatcher().register(emojiCommand);
    }
}
