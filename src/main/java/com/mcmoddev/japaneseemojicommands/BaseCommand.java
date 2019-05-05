package com.mcmoddev.japaneseemojicommands;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentTranslation;

public class BaseCommand extends CommandBase {

    private final EmoticonsEnum type;

    public BaseCommand(EmoticonsEnum type) {
        this.type = type;
    }

    private String getUsage() {
        return type.getUsage();
    }

    @Override
    public String getCommandName() {
        return type.getName();
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return getUsage();
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        ((EntityPlayerSP) sender).sendChatMessage(new ChatComponentTranslation(type.getEmoticons()).getUnformattedText());
    }
}