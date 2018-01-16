[Top](README.md)

# JetBrains IntelliJ IDEA on Mac OS X

### Kata: Rename

The default mapping for ⇧F6 in OS X is "move focus to the floating window." The default mapping for ⇧F6 in Intellij IDEA is "Rename". I suggest changing the IntelliJ IDEA mapping for Rename to ⌃F6 (Ctrl + F6), which is really fn⌃F6 (Fn + Ctrl +F6) on the physical Mac keyboard.

There is nothing to be gained by having separate katas to practice renaming files, directories, packages, etc. because the keystrokes are the same.

**Key sequences to practice**

- ⌥→ (Option + Right Arrow) - Move forward through text one token at a time
- ⌥← (Option + Left Arrow) - Move backward through text one token at a time
- fn⌃F6 (Fn + Ctrl + F6) - Rename (remapped as described above)
- ⌘Z (Command + Z) - Undo

**Keystrokes without explanations**

- Open the Java source file, LongConditional.java.
-
- Repeat the following keyboard inputs until the sequence becomes fluid.
```
⌥→ →  →
fn⌃F6
theNumber
⏎
```
And then to revert:

1. Press ⌘Z (Command + Z) repeatedly until all changes have been reversed.

**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. Press ⌥→ (Option + Right Arrow), pressing → (Right Arrow) repeatedly while holding down ⌥ (Option), to skip foward through the text until the caret lands on "intArg".
1. Press fn⌃F6 (Fn + Ctrl + F6) to activate the Rename feature.
1. Type "theNumber".
1. Press ⏎ (Return or Enter) to complete the refactoring.
1. Press ⌘Z (Command + Z) to undo the refactoring.
1. Repeat until bored.

