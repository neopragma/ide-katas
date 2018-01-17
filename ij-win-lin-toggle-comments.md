[Top](README.md) => [IntelliJ on Windows/Linux](ij-win-lin.md)

# JetBrains IntelliJ IDEA on Windows/Linux

Kata for practicing keyboard shortcuts for commenting/uncommenting lines of code

### Kata: Insert block comments

**Key sequences to practice**

- (Ctrl + Slash) - comment/uncomment line(s) - toggle
- (Ctrl + Shift + Slash) - comment/uncomment with block comment

**Keystrokes without explanations**

- Open the Java source file, LongConditional.java.
-
- Repeat the following keyboard inputs until the sequence becomes fluid.
```
(position caret after opening curly brace of the class declaration)
(Enter)
(Ctrl + Shift + /)
line1
(Enter)
line2
(Enter
line3
```

And then to revert:

1. Press (Ctrl + Z) repeatedly to undo changes.

**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. Place the caret just after the opening curly brace ({) for the class declaration.
1. Press (Enter) to insert a blank line just above the declaration of method1().
1. Press (Ctrl + Shift + Slash) to insert a block comment at the caret location. The caret will then be positions in between the opening and closing markers of the block comment.
1. Type some text and press (Enter) to start a new line. The editor inserts an asterisk, alining the new comment line with the first comment line. Repeat this if desired to end up with several lines of comments within the block comment.

### Kata: Comment/uncomment lines one by one

** Key sequences to practice**

- (Ctrl + Slash) - Comment/uncomment the line where the caret resides

**Keystrokes without explanations**

```
(Ctrl + /)
(Ctrl + /)
(Ctrl + /)
(Ctrl + /)
(Ctrl + /)
(Ctrl + /)
(Ctrl + /)
```

**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. Place the caret on any source line; it doesn't have to be at the beginning of the line.
1. Press (Ctrl + Slash) multiple times. Notice how the line is commented and the caret moves down one line with each press.

To reverse:

1. Place the caret on the first line you just commented.
1. Press (Ctrl + Slash) repeatedly until the commented lines have all been uncommented.

### Kata: Comment/uncomment a set of selected lines

**Key sequences to practice**

- (Shift + Down Arrow) - select multiple lines, one by one
- (Ctrl + Slash) - Comment/uncomment the selected lines

**Keystrokes without explanation**

```
hold (Shift)
(Down Arrow)
(Down Arrow)
(Down Arrow)
(Down Arrow)
release (Shift)
(Ctrl + /)
hold (Shift)
(Down Arrow)
(Down Arrow)
(Down Arrow)
(Down Arrow)
release (Shift)
(Ctrl + /)
```

**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java
1. Place the caret at the beginning of any source line.
1. Hold (Shift) and press (Down Arrow) repeatedly to select several consecutive lines.
1. Press (Ctrl + Slash) to comment the selected lines.

To reverse:

1. Select the same lines again.
1. Press (Ctrl + Slash) to toggle the comments off.


