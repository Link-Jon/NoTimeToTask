---------------
8/7/24 - Log 0

...
...
(i am in pain)
Okay... so, i have a problem, which i shall describe here.
I wanted a todo list mod of some sort. This mod, as previously made by tiffit (https://github.com/tiffit/TODOList) seems perfect!
With, two exceptions.
1. As of writing this, it is 8/7/2024. Current MC release is 21, Java is 21
2. I needed a fabric mod.

And thus. The joy begins.

However...
There are plenty of changes that i want to make and two open issues from the previous mod that need fixing.
Such as, a comment on curseforge mentioned, the character limit for a task is rather short.
... ironically i actually havent even used the mod yet, and im sure i will see other changes when i do.

Also.
I had attempted making a mod from scratch, but...
There were many problems with this

1. Chatgpt. Period. And truthfully this is only a negative thing for one reason only. It really, really doesnt know the current syntax. At all.
Example, it used 'net.minecraft.text.textTranslatable', even though that hasnt been a thing since 1.18 fabric.
Another, is it is STILL giving me THIS code...

screen.addDrawableChild(new ButtonWidget(x, y, 20, 20, 
Text.translatable("button.nttt.open"), button -> 
{MinecraftClient.getInstance().setScreen(new TaskScreen());}, 
ButtonWidget.EMPTY));

...actually looking at it, its HIGHLY like VSCode's intelisense isnt working correctly. sigh. Intelij gives different errors.
UGghgghghgh
