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
