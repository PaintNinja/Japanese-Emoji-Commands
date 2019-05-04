package com.mcmoddev.japaneseemojicommands;

public enum EmoticonsEnum {

    HAPPY("happy", "japaneseemojicommands.emoticon.usage.happy", "japaneseemojicommands.emoticon.happy"),
    LOVE("love", "japaneseemojicommands.emoticon.usage.love", "japaneseemojicommands.emoticon.love"),
    BLUSH("blush", "japaneseemojicommands.emoticon.usage.blush", "japaneseemojicommands.emoticon.blush"),
    SYMPATHY("sympathy", "japaneseemojicommands.emoticon.usage.sympathy", "japaneseemojicommands.emoticon.sympathy"),
    NOTAMUSED("notamused", "japaneseemojicommands.emoticon.usage.notamused", "japaneseemojicommands.emoticon.notamused"),
    ANGRY("angry", "japaneseemojicommands.emoticon.usage.angry", "japaneseemojicommands.emoticon.angry"),
    SAD("sad", "japaneseemojicommands.emoticon.usage.sad", "japaneseemojicommands.emoticon.sad"),
    DEAD("dead", "japaneseemojicommands.emoticon.usage.dead", "japaneseemojicommands.emoticon.dead"),
    SCARED("scared", "japaneseemojicommands.emoticon.usage.scared", "japaneseemojicommands.emoticon.scared"),
    INDIFFERENT("indifferent", "japaneseemojicommands.emoticon.usage.indifferent", "japaneseemojicommands.emoticon.indifferent"),
    CONFUSED("confused", "japaneseemojicommands.emoticon.usage.confused", "japaneseemojicommands.emoticon.confused"),
    DOUBT("doubt", "japaneseemojicommands.emoticon.usage.doubt", "japaneseemojicommands.emoticon.doubt"),
    SURPRISED("surprised", "japaneseemojicommands.emoticon.usage.surprised", "japaneseemojicommands.emoticon.surprised"),
    WAVE("wave", "japaneseemojicommands.emoticon.usage.wave", "japaneseemojicommands.emoticon.wave"),
    HUG("hug", "japaneseemojicommands.emoticon.usage.hug", "japaneseemojicommands.emoticon.hug"),
    WINK("wink", "japaneseemojicommands.emoticon.usage.wink", "japaneseemojicommands.emoticon.wink"),
    SORRY("sorry", "japaneseemojicommands.emoticon.usage.sorry", "japaneseemojicommands.emoticon.sorry"),
    NOSEBLEED("nosebleed", "japaneseemojicommands.emoticon.usage.nosebleed", "japaneseemojicommands.emoticon.nosebleed"),
    HIDING("hiding", "japaneseemojicommands.emoticon.usage.hiding", "japaneseemojicommands.emoticon.hiding"),
    WRITING("writing", "japaneseemojicommands.emoticon.usage.writing", "japaneseemojicommands.emoticon.writing"),
    RUNS("runs", "japaneseemojicommands.emoticon.usage.runs", "japaneseemojicommands.emoticon.runs"),
    SLEEP("sleep", "japaneseemojicommands.emoticon.usage.sleep", "japaneseemojicommands.emoticon.sleep"),
    CAT("cat", "japaneseemojicommands.emoticon.usage.cat", "japaneseemojicommands.emoticon.cat"),
    BEAR("bear", "japaneseemojicommands.emoticon.usage.bear", "japaneseemojicommands.emoticon.bear"),
    DOG("dog", "japaneseemojicommands.emoticon.usage.dog", "japaneseemojicommands.emoticon.dog"),
    RABBIT("rabbit", "japaneseemojicommands.emoticon.usage.rabbit", "japaneseemojicommands.emoticon.rabbit"),
    PIG("pig", "japaneseemojicommands.emoticon.usage.pig", "japaneseemojicommands.emoticon.pig"),
    BIRD("bird", "japaneseemojicommands.emoticon.usage.bird", "japaneseemojicommands.emoticon.bird"),
    FISH("fish", "japaneseemojicommands.emoticon.usage.fish", "japaneseemojicommands.emoticon.fish"),
    SPIDER("spider", "japaneseemojicommands.emoticon.usage.spider", "japaneseemojicommands.emoticon.spider"),
    FRIENDS("friends", "japaneseemojicommands.emoticon.usage.friends", "japaneseemojicommands.emoticon.friends"),
    ENEMIES("enemies", "japaneseemojicommands.emoticon.usage.enemies", "japaneseemojicommands.emoticon.enemies"),
    WEAPONS("weapons", "japaneseemojicommands.emoticon.usage.weapons", "japaneseemojicommands.emoticon.weapons"),
    MAGIC("magic", "japaneseemojicommands.emoticon.usage.magic", "japaneseemojicommands.emoticon.magic"),
    FOOD("food", "japaneseemojicommands.emoticon.usage.food", "japaneseemojicommands.emoticon.food"),
    MUSIC("music", "japaneseemojicommands.emoticon.usage.music", "japaneseemojicommands.emoticon.music"),
    UNFLIP("unflip", "japaneseemojicommands.emoticon.usage.unflip", "japaneseemojicommands.emoticon.unflip"),
    TABLEFLIP("tableflip", "japaneseemojicommands.emoticon.usage.tableflip", "japaneseemojicommands.emoticon.tableflip"),
    SHRUG("shrug", "japaneseemojicommands.emoticon.usage.shrug", "japaneseemojicommands.emoticon.shrug");

    private final String name;
    private final String usage;
    private final String emoticons;

    EmoticonsEnum(String name, String usage, String emoticons) {
        this.name = name;
        this.usage = usage;
        this.emoticons = emoticons;
    }

    public final String getName() {
        return name;
    }

    public final String getUsage() {
        return usage;
    }

    public final String getEmoticons() {
        return emoticons;
    }
}