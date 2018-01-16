[Top](README.md) => [Code Completion Katas](ij-osx-code-completion.md)

# JetBrains IntelliJ IDEA on Mac OS X

Kata for practicing keyboard shortcuts for basic code completion features

### Kata: Insert block comments

**Key sequences to practice**

- ⌘/ (Command + Slash) - comment/uncomment line(s) - toggle
- ⌘⌥/ (Command + Option + Slash) - comment/uncomment with block comment

**Keystrokes without explanations**

- Open the Java source file, LongConditional.java.
-
- Repeat the following keyboard inputs until the sequence becomes fluid.
```
(position caret after opening curly brace of the class declaration)
⏎
⌘⌥/
line1
⏎
line2
⏎
line3
```

And then to revert:

1. Press ⌘Z repeatedly to undo changes.

**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. Place the caret just after the opening curly brace ({) for the class declaration.
1. Press ⏎ (Return or Enter) to insert a blank line just above the declaration of method1().
1. Press ⌘⌥/ (Command + Option + Slash) to insert a block comment at the caret location. The caret will then be positions in between the opening and closing markers of the block comment.
1. Type some text and press ⏎ (Return or Enter) to start a new line. The editor inserts an asterisk, alining the new comment line with the first comment line. Repeat this if desired to end up with several lines of comments within the block comment.

### Kata: Comment/uncomment lines one by one

** Key sequences to practice**

- ⌘/ (Command + Slash) - Comment/uncomment the line where the caret resides

**Keystrokes without explanations**

```
⌘/
⌘/
⌘/
⌘/
⌘/
⌘/
⌘/
⌘/
```

**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. Place the caret on any source line; it doesn't have to be at the beginning of the line.
1. Press ⌘/ (Command + Slash) multiple times. Notice how the line is commented and the caret moves down one line with each press.

To reverse:

1. Place the caret on the first line you just commented.
1. Press ⌘/ (Command + Slash) repeatedly until the commented lines have all been uncommented.

### Kata: Comment/uncomment a set of selected lines

**Key sequences to practice**

- ⇧↓ (Shift + Down Arrow) - select multiple lines, one by one
- ⌘/ (Command + Slash) - Comment/uncomment the selected lines

**Keystrokes without explanation**

```
⇧↓ ↓ ↓ ↓
⌘/
⇧↓ ↓ ↓ ↓
⌘/
```

**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java
1. Place the caret at the beginning of any source line.
1. Press ⇧↓ (Shift + Down Arrow) to select several consecutive lines.
1. Press ⌘/ (Command + Slash) to comment the selected lines.

To reverse:

1. Select the same lines again.
1. Press ⌘/ (Command + Slash) to toggle the comments off.


