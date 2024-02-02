ModsDotGroovy.make {
    modLoader = 'javafml'
    loaderVersion = "[46,)"

    license = 'MIT'
    issueTrackerUrl = 'https://github.com/PaintNinja/japanese-emoji-commands/issues'

    mod {
        modId = 'japaneseemojicommands'
        version = "${this.buildProperties.mod_version}"

        displayName = 'Japanese Emoji Commands'
        description = "A simple mod that let's use Kaomoji (Japanese emoji) in Minecraft."
        authors = ['KiriCattus', 'Paint_Ninja']

        displayUrl = 'https://www.curseforge.com/minecraft/mc-mods/japanese-emoji-commands?projectID=277068'

        displayTest = 'IGNORE_ALL_VERSION'

        dependencies {
            forge {
                versionRange = ">=46"
                side = DependencySide.CLIENT
            }
            minecraft {
                versionRange = "[1.20,)"
                side = DependencySide.CLIENT
            }
        }
    }
}
