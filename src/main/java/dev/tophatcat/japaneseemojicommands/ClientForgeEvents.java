/*
 * Japanese-Emoji-Commands - https://github.com/tophatcats-mods/japanese-emoji-commands
 * Copyright (C) 2016-2023 <KiriCattus>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation;
 * Specifically version 2.1 of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 * USA
 * https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 */
package dev.tophatcat.japaneseemojicommands;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Locale;

@Mod.EventBusSubscriber(modid = JapaneseEmojiCommands.MOD_ID,
    bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeEvents {

    @SubscribeEvent
    public static void onRegisterClientCommands(final RegisterClientCommandsEvent event) {
        final var emojiCommand = Commands.literal("emoji");
        for (final EmoticonsEnum emoticon : EmoticonsEnum.values()) {
            emojiCommand.then(Commands.literal(emoticon.name().toLowerCase(Locale.ROOT))
                .executes(ctx -> {
                        final String emote = new TranslatableComponent(emoticon.getTranslationKey()).getString();
                        final var chatScreen = new ChatScreen("");
                        Minecraft.getInstance().pushGuiLayer(chatScreen);
                        chatScreen.sendMessage(emote, false);
                        Minecraft.getInstance().popGuiLayer();

                        return 1;
                    }
                ));
        }
        event.getDispatcher().register(emojiCommand);
    }
}
