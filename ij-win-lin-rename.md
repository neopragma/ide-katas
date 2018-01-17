[Top](README.md) => [IntelliJ on Windows/Linux](ij-win-lin.md)

# JetBrains IntelliJ IDEA on Windows/Linux

### Kata: Rename

There is nothing to be gained by having separate _kata_ to practice renaming files, directories, packages, etc. because the keystrokes are the same.

**Key sequences to practice**

- (Ctrl + Right Arrow) - Move forward through text one token at a time
- (Ctrl + Left Arrow) - Move backward through text one token at a time
- (Shift + F6) - Rename (remapped as described above)
- (Ctrl + Z) - Undo

**Keystrokes without explanations**

- Open the Java source file, LongConditional.java.
-
- Repeat the following keyboard inputs until the sequence becomes fluid.
```
hold (Ctrl)
(Right Arrow)
(Right Arrow)
(Right Arrow)
release (Ctrl)
(Shift + F6)
theNumber
(Enter)
```
And then to revert:

1. Press (Ctrl + Z) repeatedly until all changes have been reversed.

**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. Hold (Ctrl) and press (Right Arrow) repeatedly to skip foward through the text until the caret lands on "intArg".
1. Press (Shift + F6) to activate the Rename feature.
1. Type "theNumber".
1. Press (Enter) to complete the refactoring.
1. Press (Ctrl + Z) to undo the refactoring.
1. Repeat until bored.

