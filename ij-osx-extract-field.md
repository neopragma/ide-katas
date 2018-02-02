[Top](README.md) => [IntelliJ IDEA on Mac OS X](ij-osx.md)

# JetBrains IntelliJ IDEA on Mac OS X

### Kata: Extract Field

The _extract constant_ refactoring converts a local variable into an instance variable.

### Key sequences to practice

- ⌃⇥ (Ctrl + Tab) - navigate from the project view pane to an editor pane
- ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) or fn↑ (Fn + Up Arrow) - navigate to the top of the file (in editor)
- ⌥→ (Option + Right Arrow) - move forward by token while selecting
- ⌥⇧→ (Option + Shift + Right Arrow) - move forward by token
- ⌘L (Command + L) - go to line number
- ⌘F (Command + F) - find in file
- ⌘G (Command + G) - repeat the last find operation
- ⎋ (Escape) - dismiss "find" dialog
- ⌘⌥C (Command + Option + C) - open the "extract constant" dialog
- ⏎ (Return/Enter) - complete action

**Keystrokes without explanations**

```
⌃⇥
⌘↖︎ (or fn⌘←)
⌘L
11
⏎
hold ⌥
→
→
release ⌥
hold ⇧⌥
→
release ⇧⌥
⌘⌥F
⏎
↓

```

**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. If focus is not already in the editor pane for LongConditional.java, press ⌃⇥ (Ctrl + Tab) and select the editor pane for LongConditional.java.
1. Press ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) or fn↑ (Fn + Up Arrow) to navigate to the top of the file (depends on the keyboard).
1. Press ⌘L (Command + L) to open the "go to line number" dialog.
1. Enter line number 11.
1. Press ⏎ (Return/Enter) to move the caret to the specified line number.
1. Hold ⌥ (Option) and press → (Right Arrow) twice to advance to the token, _errorCount_.
1. Hold ⇧⌥ (Shift + Option) and press → (Right Arrow) once to select the token, _errorCount_.
1. Press ⌘⌥F (Command + Option + F) to open the "extract field" dialog.
1. Press ⏎ (Return/Enter) to accept the defaults and complete the refactoring. 
1. Press ↓ (Down Arrow) and the caret should land on the token, _result_, on the line below.
1. Press ⌘⌥F (Command + Option + F) to open the "extract field" dialog.
1. Press ⏎ (Return/Enter) to accept the defaults and complete the refactoring. 


To reverse the changes:

1. Press ⌘Z (Command + Z) repeatedly until the changes have been reversed. Should be 30 times.






