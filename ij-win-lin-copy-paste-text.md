[Top](README.md) => [IntelliJ on Windows/Linux](ij-win-lin.md)

# JetBrains IntelliJ IDEA on Windows/Linux

Kata for practicing keyboard shortcuts for common editing operations

### Kata: Copying and pasting text (version 1)

**Key sequences to practice**

- (Ctrl + G) - move caret to a particular line number in the file
- (Ctrl + End)  - move caret to the end of the file
- (Ctrl + X) - cut selection and place on clipboard
- (Ctrl + C) - copy selection and place on clipboard
- (Ctrl + V) - paste last selection from clipboard to current caret position
- (Ctrl + Shift + V) - paste from selected clipboard buffer
- (Ctrl + D) - duplicate line where caret resides (or selected lines)
- (Ctrl + Delete) - delete line where caret resides

**Keystrokes without explanations**

- Open the text file, rain-in-spain.txt.
- Repeat the following keyboard inputs until the sequence becomes fluid.
```
(Ctrl + G) 2
hold (Shift)
(Down Arrow)
(Down Arrow)
release (Shift)
(Ctrl + X)
(Ctrl + End)
(Enter)
(Ctrl + V)
(Ctrl + G) 2
hold (Shift)
(Down Arrow)
(Down Arrow)
(Down Arrow)
release (Shift)
(Ctrl + C)
(Ctrl + End)
(Enter)
(Ctrl + V)
(Enter)
(Ctrl + Shift + V)
(Down Arrow)
(Enter)
```

And then to revert:

1. Press (Ctrl + Z) repeatedly to undo changes.

**Walkthrough of steps with explanations**

1. Open the text file, rain-in-spain.txt.
1. Press (Ctrl + G) to open the "go to line number" dialog, and go to line number 2.
1. Select lines 2-3 inclusive.
1. Press (Ctrl + X) to cut the lines and put them in a clipboard buffer.
1. Press (Ctrl + End) to move the caret to the end of the file.
1. Press (Enter) to start a new line.
1. Press (Ctrl + V) to insert the lines from the clipboard buffer at the current caret location.
1. Press (Ctrl + G) to open the "go to line number" dialog, and go to line number 2.
1. Select lines 2-4 inclusive.
1. Press (Ctrl + C) to copy the lines to a clipboard buffer.
1. Press (Ctrl + End) to move the caret to the end of the file.
1. Press (Enter) to start a new line.
1. Press (Ctrl + V) to insert the lines from the clipboard buffer at the current caret location.
1. Press (Ctrl + End) oto move the caret to the end of the file.
1. Press (Enter) to start a new line.
1. Press (Ctrl + Shift + V) to open the list of clipboard buffers.
1. Select the buffer containing the "quick brown fox" lines.

And then to revert:

- Press (Ctrl + Z) repeatedly to undo changes.


### Kata: Copying and pasting text (version 2)

**Key sequences to practice**

- (Ctrl + Home)  - move caret to the beginning of the file
- (Ctrl + End) - move caret to the end of the file
- (Ctrl + X) - cut selection and place on clipboard
- (Ctrl + C) - copy selection and place on clipboard
- (Ctrl + V) - paste last selection from clipboard to current caret position
- (Ctrl + Shift + V) - paste from selected clipboard buffer
- (Ctrl + D) - duplicate line where caret resides (or selected lines)
- (Ctrl + Delete) - delete line where caret resides

**Keystrokes without explanations**

- Open the text file, rain-in-spain.txt.
- Repeat the following keyboard inputs until the sequence becomes fluid.
```
(Ctrl + Home)
(Down Arrow)
hold (Shift)
(Down Arrow)
(Down Arrow)
(Ctrl + X)
(Ctrl + End)
(Enter)
(Ctrl + V)
(Ctrl + Home)
(Down Arrow)
hold (Shift)
(Down Arrow)
(Down Arrow)
(Down Arrow)
release (Shift)
(Ctrl + C)
(Ctrl + End)
(Enter)
(Ctrl + V)
(Enter)
(Ctrl + Shift + V)
(Down Arrow)
(Enter)
```

And then to revert:

1. Press (Ctrl + Z) repeatedly to undo changes.

**Walkthrough of steps with explanations**

1. Open the text file, rain-in-spain.txt.
1. Select lines 2-3 inclusive.
1. Press (Ctrl + X) to cut the lines and put them in a clipboard buffer.
1. Press (Ctrl + End) to move the caret to the end of the file.
1. Press (Enter) to start a new line.
1. Press (Ctrl + V) to insert the lines from the clipboard buffer at the current caret location.
1. Select lines 2-4 inclusive.
1. Press (Ctrl + C) to copy the lines to a clipboard buffer.
1. Press (Ctrl + End)  to move the caret to the end of the file.
1. Press (Enter) to start a new line.
1. Press (Ctrl + V) to insert the lines from the clipboard buffer at the current caret location.
1. Press (Ctrl + End) to move the caret to the end of the file.
1. Press (Enter) to start a new line.
1. Press (Ctrl + Shift + V) to open the list of clipboard buffers.
1. Select the buffer containing the "quick brown fox" lines.

And then to revert:

- Press (Ctrl + Z repeatedly to undo changes.



