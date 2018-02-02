[Top](README.md) => [IntelliJ IDEA on Mac OS X](ij-osx.md)

# JetBrains IntelliJ IDEA on Mac OS X

### Kata: Extract Field

The _extract variable_ refactoring assigns an expression to a variable, typically to improve readability.

### Key sequences to practice

- ⌃⇥ (Ctrl + Tab) - navigate from the project view pane to an editor pane
- ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) or fn↑ (Fn + Up Arrow) - navigate to the top of the file (in editor)
- ⌥→ (Option + Right Arrow) - move forward by token while selecting
- ⌥⇧→ (Option + Shift + Right Arrow) - move forward by token
- ⌘L (Command + L) - go to line number
- ⌘F (Command + F) - find in file
- ⌘G (Command + G) - repeat the last find operation
- ⎋ (Escape) - dismiss "find" dialog
- ⌘⌥V (Command + Option + V) - open the "extract variable" dialog
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
→
→
release ⌥
⌘V
↓
↓
isInternetExplorer
⏎
⌥⏎
⏎
↓
↓
↓
hold ⌥
→
→
→
release ⌥
⌘V
↓
↓
isChrome
⏎
⌥⏎
⏎
⌘X
↑
↑
↑
↑
⌘V
```

**Walkthrough of steps with explanations**

1. Open the Java source file, BrowserMadness.java.
1. If focus is not already in the editor pane for LongConditional.java, press ⌃⇥ (Ctrl + Tab) and select the editor pane for LongConditional.java.
1. Press ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) or fn↑ (Fn + Up Arrow) to navigate to the top of the file (depends on the keyboard).
1. Press ⌘L (Command + L) to open the "go to line number" dialog.
1. Enter line number 9.
1. Press ⏎ (Return/Enter) to move the caret to the specified line number.
1. Hold ⌥ (Option) and press → (Right Arrow) four times to advance to the token, _browser_.
1. Press ⌘V to open the "extract variable" dialog.
1. Press ↓ (Down Arrow) twice to select the expression that includes the _contains_ method call.
1. Overtype the default variable name, _msie_, with _isInternetExplorer_.
1. Press ⏎ (Return/Enter) to complete the refactoring.
1. Press ⌥⏎ (Option + Return/Enter) to open the intentions drop-down.
1. Press ⏎ (Return/Enter) to accept the suggestion to "extract if".
1. Press ↓ (Down Arrow) to move to the next line that contains an expression to be extracted. 
1. Hold ⌥ (Option) and press → (Right Arrow) three times to position the caret at the token, _browser_.
1. Press ⌘V (Command + V) to open the "extract variable" dialog.
1. Press ↓ (Down Arrow) twice to select the expression that includes the _contains_ method call.
1. Overtype the default variable name, _msie_, with _isChrome_.
1. Press ⏎ (Return/Enter) to complete the refactoring.
1. Press ⌘X to cut the line containing the extracted variable.
1. Press ↑ (Up Arrow) to position the caret at the start of the line just below the first extracted variable declaration.
1. Press ⌘V to paste the cut line at that position in the file. 


To reverse the changes:

1. Press ⌘Z (Command + Z) repeatedly until the changes have been reversed. Should be 30 times.






