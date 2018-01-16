[Top](README.md) => [IntelliJ on OS X](ij-osx.md)

# JetBrains IntelliJ IDEA on Mac OS X

Kata for practicing keyboard shortcuts for common editing operations

### Kata: Copying and pasting text

**Key sequences to practice**

- ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) - move caret to the beginning of the file
- ⌘↘︎ (Command + End) or fn⌘→ (Fn + Command + Right Arrow) - move caret to the end of the file
- ⌘X (Command + X) - cut selection and place on clipboard
- ⌘C (Command + C) - copy selection and place on clipboard
- ⌘V (Command + V) - paste last selection from clipboard to current caret position
- ⌘⇧V (Command + Shift + V) - paste from selected clipboard buffer
- ⌘D (Command + D) - duplicate line where caret resides (or selected lines)
- ⌘⌫ (Command + Delete) - delete line where caret resides

**Keystrokes without explanations**

- Open the text file, rain-in-spain.txt.
- Repeat the following keyboard inputs until the sequence becomes fluid.
```
⌘↖︎
↓
⇧↓
↓
⌘X
⌘↘︎
⏎
⌘V
⌘↖︎
↓
⇧↓
↓
↓
⌘C
⌘↘︎
⏎
⌘V
⏎
⌘⇧V
↓
⏎
```

And then to revert:

1. Press ⌘Z repeatedly to undo changes.

**Walkthrough of steps with explanations**

1. Open the text file, rain-in-spain.txt.
1. Select lines 2-3 inclusive.
1. Press ⌘X (Command + X) to cut the lines and put them in a clipboard buffer.
1. Press ⌘↘︎ (Command + End) or fn⌘→ (Fn + Command + Right Arrow) to move the caret to the end of the file.
1. Press ⏎ (Return or Enter) to start a new line.
1. Press ⌘V (Command + V) to insert the lines from the clipboard buffer at the current caret location.
1. Select lines 2-4 inclusive.
1. Press ⌘C (Command + C) to copy the lines to a clipboard buffer.
1. Press ⌘↘︎ (Command + End) or fn⌘→ (Fn + Command + Right Arrow) to move the caret to the end of the file.
1. Press ⏎ (Return or Enter) to start a new line.
1. Press ⌘V (Command + V) to insert the lines from the clipboard buffer at the current caret location.
1. Press ⌘↘︎ (Command + End) or fn⌘→ (Fn + Command + Right Arrow) to move the caret to the end of the file.
1. Press ⏎ (Return or Enter) to start a new line.
1. Press ⌘⇧V (Command + Shift + V) to open the list of clipboard buffers.
1. Select the buffer containing the "quick brown fox" lines.

And then to revert:

- Press ⌘Z repeatedly to undo changes.

