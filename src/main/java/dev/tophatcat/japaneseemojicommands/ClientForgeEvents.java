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

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.client.Minecraft;
import net.minecraft.commands.CommandSourceStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static dev.tophatcat.japaneseemojicommands.ClientModLifecycleEvents.COMMANDS_DISPATCHER;

@Mod.EventBusSubscriber(modid = JapaneseEmojiCommands.MOD_ID,
    bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeEvents {
    @SubscribeEvent
    public static void onPlayerChat(final ClientChatEvent event) {
        final String message = event.getMessage();
        final var player = Minecraft.getInstance().player;
        if (player != null && message.startsWith("!")) {
            try {
                final ParseResults<CommandSourceStack> parse = COMMANDS_DISPATCHER.parse(
                    event.getMessage().substring(1),
                    Minecraft.getInstance().player.createCommandSourceStack()
                );
                if (parse.getContext().getNodes().size() > 0) {
                    event.setCanceled(true);
                    COMMANDS_DISPATCHER.execute(parse);
                }
            } catch (final CommandSyntaxException ignored) {}
        }
    }
}
