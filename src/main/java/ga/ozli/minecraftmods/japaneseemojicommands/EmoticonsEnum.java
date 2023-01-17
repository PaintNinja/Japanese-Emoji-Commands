package ga.ozli.minecraftmods.japaneseemojicommands;

import java.util.Locale;

enum EmoticonsEnum {

    HAPPY,
    LOVE,
    BLUSH,
    SYMPATHY,
    NOTAMUSED,
    ANGRY,
    SAD,
    DEAD,
    SCARED,
    INDIFFERENT,
    CONFUSED,
    DOUBT,
    SURPRISED,
    WAVE,
    HUG,
    WINK,
    SORRY,
    NOSEBLEED,
    HIDING,
    WRITING,
    RUNS,
    SLEEP,
    CAT,
    BEAR,
    DOG,
    RABBIT,
    PIG,
    BIRD,
    FISH,
    SPIDER,
    FRIENDS,
    ENEMIES,
    WEAPONS,
    MAGIC,
    FOOD,
    MUSIC,
    UNFLIP,
    TABLEFLIP,
    SHRUG;

    private final String translationKey;

    EmoticonsEnum() {
        this.translationKey = "japaneseemojicommands.emoticon." + this.name().toLowerCase(Locale.ROOT);
    }

    final String getTranslationKey() {
        return translationKey;
    }
}
