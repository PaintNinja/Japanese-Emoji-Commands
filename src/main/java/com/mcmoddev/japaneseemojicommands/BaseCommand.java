package com.mcmoddev.japaneseemojicommands;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentTranslation;

public class BaseCommand extends CommandBase {

    private final EmoticonsEnum type;

    public BaseCommand(EmoticonsEnum type) {
        this.type = type;
    }

    private String getUsage() {
        return type.getUsage();
    }

    @Override
    public String getName() {
        return type.getName();
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return getUsage();
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        ((EntityPlayerSP) sender).sendChatMessage(new TextComponentTranslation(type.getEmoticons()).getUnformattedText());
    }
}