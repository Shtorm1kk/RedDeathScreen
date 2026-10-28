Red Death Screen — Fabric 1.21.11

Behavior:
- When the local player dies and Minecraft opens its normal death screen, it is replaced by a solid dark-red screen.
- Escape, keyboard input, and mouse clicks cannot close it.
- No buttons or text are shown.

Build requirements:
- Java 21
- Internet access on the build machine (Gradle downloads Fabric Loom, Minecraft and Yarn dependencies)

Build:
1. Install Gradle 8.14+ or generate a Gradle wrapper for this project.
2. Open a terminal in this folder.
3. Run: gradle build
4. The mod jar will be in build/libs/.

Install the resulting jar into .minecraft/mods. Fabric Loader 0.18.1+ is required.

Note: The current ChatGPT build environment has no network access and no Gradle installation, so I could not compile/test the jar here. This archive contains the complete source project, not a ready-to-install jar.
