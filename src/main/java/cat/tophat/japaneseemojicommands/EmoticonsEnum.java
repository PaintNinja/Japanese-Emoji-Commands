package cat.tophat.japaneseemojicommands;

public enum EmoticonsEnum {

    HAPPY("happy", "japanese-emoji-commands.emoticon.happy"),
    LOVE("love", "japanese-emoji-commands.emoticon.love"),
    BLUSH("blush", "japanese-emoji-commands.emoticon.blush"),
    SYMPATHY("sympathy", "japanese-emoji-commands.emoticon.sympathy"),
    NOTAMUSED("notamused", "japanese-emoji-commands.emoticon.notamused"),
    ANGRY("angry", "japanese-emoji-commands.emoticon.angry"),
    SAD("sad", "japanese-emoji-commands.emoticon.sad"),
    DEAD("dead", "japanese-emoji-commands.emoticon.dead"),
    SCARED("scared", "japanese-emoji-commands.emoticon.scared"),
    INDIFFERENT("indifferent", "japanese-emoji-commands.emoticon.indifferent"),
    CONFUSED("confused", "japanese-emoji-commands.emoticon.confused"),
    DOUBT("doubt", "japanese-emoji-commands.emoticon.doubt"),
    SURPRISED("surprised", "japanese-emoji-commands.emoticon.surprised"),
    WAVE("wave", "japanese-emoji-commands.emoticon.wave"),
    HUG("hug", "japanese-emoji-commands.emoticon.hug"),
    WINK("wink", "japanese-emoji-commands.emoticon.wink"),
    SORRY("sorry", "japanese-emoji-commands.emoticon.sorry"),
    NOSEBLEED("nosebleed", "japanese-emoji-commands.emoticon.nosebleed"),
    HIDING("hiding", "japanese-emoji-commands.emoticon.hiding"),
    WRITING("writing", "japanese-emoji-commands.emoticon.writing"),
    RUNS("runs", "japanese-emoji-commands.emoticon.runs"),
    SLEEP("sleep", "japanese-emoji-commands.emoticon.sleep"),
    CAT("cat", "japanese-emoji-commands.emoticon.cat"),
    BEAR("bear", "japanese-emoji-commands.emoticon.bear"),
    DOG("dog", "japanese-emoji-commands.emoticon.dog"),
    RABBIT("rabbit", "japanese-emoji-commands.emoticon.rabbit"),
    PIG("pig", "japanese-emoji-commands.emoticon.pig"),
    BIRD("bird", "japanese-emoji-commands.emoticon.bird"),
    FISH("fish", "japanese-emoji-commands.emoticon.fish"),
    SPIDER("spider", "japanese-emoji-commands.emoticon.spider"),
    FRIENDS("friends", "japanese-emoji-commands.emoticon.friends"),
    ENEMIES("enemies", "japanese-emoji-commands.emoticon.enemies"),
    WEAPONS("weapons", "japanese-emoji-commands.emoticon.weapons"),
    MAGIC("magic", "japanese-emoji-commands.emoticon.magic"),
    FOOD("food", "japanese-emoji-commands.emoticon.food"),
    MUSIC("music", "japanese-emoji-commands.emoticon.music"),
    UNFLIP("unflip", "japanese-emoji-commands.emoticon.unflip"),
    TABLEFLIP("tableflip", "japanese-emoji-commands.emoticon.tableflip"),
    SHRUG("shrug", "japanese-emoji-commands.emoticon.shrug");

    private final String name;
    private final String emoticons;

    EmoticonsEnum(String name, String emoticons) {
        this.name = name;
        this.emoticons = emoticons;
    }

    public final String getName() {
        return name;
    }

    public final String getEmoticons() {
        return emoticons;
    }
}
