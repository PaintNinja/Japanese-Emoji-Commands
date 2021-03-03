package cat.tophat.japaneseemojicommands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(JapaneseEmojiCommands.MODID)
public class JapaneseEmojiCommands {

    private static final CommandDispatcher<CommandSource> COMMANDS_DISPATCHER = new CommandDispatcher();

    public static final String NAME = "Japanese Emoji Commands";
    public static final String MODID = "japaneseemojicommands";
    public static final Logger LOGGER = LogManager.getLogger(NAME);


    public JapaneseEmojiCommands(){
        LOGGER.info("Spawning in the kitty's...");
        LOGGER.info("Getting the kitty's dressed up...");

        LiteralArgumentBuilder<CommandSource> command = Commands.literal("emoji");
        for(EmoticonsEnum value : EmoticonsEnum.values())
            command.then(Commands.literal(value.getName()).executes(ctx -> {
                if(ctx.getSource().getEntity() instanceof ClientPlayerEntity){
                    ClientPlayerEntity player = (ClientPlayerEntity) ctx.getSource().getEntity();
                    player.sendChatMessage(new TranslationTextComponent(value.getEmoticons()).getString());
                }
                return 1;
            }));

        COMMANDS_DISPATCHER.register(command);
    }

    public static CommandDispatcher<CommandSource> getCommandsDispatcher() {
        return COMMANDS_DISPATCHER;
    }

//    @Mod.EventHandler
//    public void Init(FMLInitializationEvent event) {
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.ANGRY));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.LOVE));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.HAPPY));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.BLUSH));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SYMPATHY));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.NOTAMUSED));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SAD));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.DEAD));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SCARED));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.INDIFFERENT));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.CONFUSED));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.DOUBT));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SURPRISED));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.WAVE));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.HUG));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.WINK));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SORRY));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.NOSEBLEED));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.HIDING));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.WRITING));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.RUNS));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SLEEP));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.CAT));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.BEAR));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.DOG));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.RABBIT));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.PIG));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.BIRD));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.FISH));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SPIDER));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.FRIENDS));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.ENEMIES));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.WEAPONS));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.MAGIC));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.FOOD));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.MUSIC));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.UNFLIP));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.TABLEFLIP));
//        ClientCommandHandler.instance.registerCommand(new BaseCommand(EmoticonsEnum.SHRUG));
//    }
}