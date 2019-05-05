package com.mcmoddev.japaneseemojicommands;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        name = JapaneseEmojiCommands.NAME,
        modid = JapaneseEmojiCommands.MODID,
        version = JapaneseEmojiCommands.VERSION,
        updateJSON = JapaneseEmojiCommands.UPDATE_JSON,
        certificateFingerprint = "@FINGERPRINT@",
        acceptedMinecraftVersions = JapaneseEmojiCommands.MC_VERSION,
        clientSideOnly = true)
public class JapaneseEmojiCommands {

    public static final String NAME = "Japanese Emoji Commands";
    public static final String MODID = "japaneseemojicommands";
    public static final String VERSION = "1.2.0";
    public static final String UPDATE_JSON = "https://raw.githubusercontent.com/MinecraftModDevelopmentMods/Japanese-Emoji-Commands/master/update.json";
    public static final String MC_VERSION = "[1.11, 1.11.2]";
    public static final Logger LOGGER = LogManager.getLogger(NAME);

    @Mod.EventHandler
    public void onFingerprintViolation(FMLFingerprintViolationEvent event) {
        LOGGER.warn("Invalid fingerprint detected! The file " + event.getSource().getName() + " may have been tampered with. This version will NOT be supported! Please download the mod from CurseForge for a supported and signed version of the mod.");
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Spawning in the kitty's...");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        LOGGER.info("Getting the kitty's dressed up...");
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.ANGRY));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.LOVE));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.HAPPY));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.BLUSH));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SYMPATHY));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.NOTAMUSED));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SAD));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.DEAD));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SCARED));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.INDIFFERENT));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.CONFUSED));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.DOUBT));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SURPRISED));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.WAVE));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.HUG));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.WINK));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SORRY));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.NOSEBLEED));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.HIDING));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.WRITING));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.RUNS));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SLEEP));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.CAT));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.BEAR));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.DOG));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.RABBIT));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.PIG));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.BIRD));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.FISH));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SPIDER));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.FRIENDS));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.ENEMIES));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.WEAPONS));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.MAGIC));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.FOOD));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.MUSIC));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.UNFLIP));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.TABLEFLIP));
        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SHRUG));
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LOGGER.info("AWW LOOK AT THE ADORABLE KITTY'S IN THE MAID OUTFITS!!!");
    }
}