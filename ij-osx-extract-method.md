[Top](README.md) => [IntelliJ IDEA on Windows/Linux](ij-osx.md)

# JetBrains IntelliJ IDEA on Mac OS X

### Kata: Extract method 1

The _extract method_ refactoring takes a block of inline code and re-casts it as a method in the same class, replacing the inline code with a method call. Even if there is no duplication, it can be useful to extract chunks of code out of a long method to make the code more readable and easier to isolate.

_Extract method_ is often used to reduce duplication by consolidating identical or very similar inline code snippets into a single method. It is also a building block for multi-steps refactorings such as _decompose conditional_ and _compose method_.

### Key sequences to practice

- ⌃⇥ (Ctrl + Tab) - navigate from the project view pane to an editor pane
- ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) - navigate to the top of the file (in editor)
- ⌥→ (Option + Right Arrow) - move forward by token (word)
- ⌥⇧→ (Option + Shift + Right Arrow) - move forward by token (word) selecting as you go
- ⌘C (Command + C) - select current line (when nothing is selected)

- ⌃↓ (Ctrl + Down Arrow) - move through the file method by method
- ⌥→ (Option + Right Arrow) - move through the file token (word) by token
- ↘︎ (End) or fn→ (Fn + Right Arrow) - move the caret to the end of the current line.
- → (Right Arrow) - move the caret one position to the right
- ⌘⌥⇧] (Command + Option + Shift + ]) - select from caret through end of block
- ⇧ and ↓ (Shift) with (Down Arrow) - select lines
- ⌘⌥M (Command + Option + M) - open the "extract method" dialog

**Keystrokes without explanations**

```
⌃⇥
⌘↖︎ (or fn⌘←)
⌘L 32
⌥→
⌥→
⌥→
⌥⇧→
⌥⇧→
⌥⇧→
⌥⇧→
⌥⇧→
⌥⇧→
⌥⇧→
hold ⇧
→
release ⇧
⌘⌥M
Visibility: Public
Name: isABC
Arguments: stringArg
OK
```


**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. If focus is not already in the editor pane for LongConditional.java, press ⌃⇥ (Ctrl + Tab) and select the editor pane for LongConditional.java.
1. Press ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) to place the caret at the top of the file.
1. Press ⌘L (Command + L) to open the "goto line number" dialog. Navigate to line 32. (This should be a line that reads, "if (stringArg.matches("^ABC.\*?")) {").
1. Press ⌥→ (Option + Right Arrow) three times.  The caret should now be at the "s" in "stringArg".
1. Press ⌥⇧→ (Option + Shift + RightArrow) seven times, to select this text: "stringArg.matches("^ABC.*?"".  Note that if you press it one more time, it will select both the closing parentheses, and we only want the first one.
1. Hold ⇧ (Shift) and press → (Right Arrow) once to extend the selection so that the first closing parenthesis is included.
1. Press ⌘⌥M (Command + Option +M) to open the "extract method" dialog.
1. In the "extract method" dialog, select:
- Visibility: Public
- Name: isABC
- Arguments: stringArg

The editor will detect addtional code fragments that match the selection, and will prompt you to review and replace them. Choose "Replace" for each one.

To reverse the changes:

1. Press ⌘Z (Command + Z) repeatedly until the changes have been reversed.






