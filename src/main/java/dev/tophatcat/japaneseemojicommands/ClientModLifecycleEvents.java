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

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

@Mod.EventBusSubscriber(modid = JapaneseEmojiCommands.MOD_ID,
    bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModLifecycleEvents {
    private static final Logger LOGGER = LogManager.getLogger();
    static final CommandDispatcher<CommandSourceStack> COMMANDS_DISPATCHER = new CommandDispatcher<>();

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        LOGGER.info(JapaneseEmojiCommands.MOD_ID + " starting up");

        // Initialize commands
        final LiteralArgumentBuilder<CommandSourceStack> emojiCommand = Commands.literal("emoji");
        for (final EmoticonsEnum value : EmoticonsEnum.values()) {
            emojiCommand.then(Commands.literal(value.name().toLowerCase(Locale.ROOT)).executes(ctx -> {
                if (ctx.getSource().getEntity() instanceof final LocalPlayer player) {
                    player.chat(new TranslatableComponent(value.getTranslationKey()).getString());
                }
                return 1;
            }));
        }

        // Register commands
        COMMANDS_DISPATCHER.register(emojiCommand);
    }
}
