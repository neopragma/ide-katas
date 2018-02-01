[Top](README.md) => [IntelliJ IDEA on Mac OS X](ij-osx.md)

# JetBrains IntelliJ IDEA on Mac OS X

### Kata: Decompose Conditional

The _decompose conditional_ refactoring is used to simplify a long series of if/else blocks and/or switch blocks. This usually improves readability, and often has the side benefit of making duplicate code more obvious, when duplication hides in the repetitious blocks of code.

### Key sequences to practice

- ⌃⇥ (Ctrl + Tab) - navigate from the project view pane to an editor pane
- ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) - navigate to the top of the file (in editor)
- ⇧ and ↓ (Shift) with (Down Arrow) - select lines
- ⌘⌥M (Command + Option + M) - open the "extract method" dialog

**Keystrokes without explanations**

```
⌃⇥
⌘↖︎ (or fn⌘←)
⌘L 10
hold ⇧
↓    <= 20 times
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
release ⇧
⌘⌥M
⇥
validateArguments
⏎
⌘L 12
hold ⇧
↓    <= 19 times
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
↓
release ⇧
⌘⌥M
⏎
←
⏎
⏎
⌘L 21
hold ⇧
↓    <= 19 times
↓
↓
↓
↓
↓
↓
↓
release ⇧
⌘⌥M
⇥
valueForRange
⏎
hold ⌃
⇥
release ⌃
⏎
```

Reverse the changes:

```
⌘Z (Command + Z) repeatedly.
```


**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. If focus is not already in the editor pane for LongConditional.java, press ⌃⇥ (Ctrl + Tab) and select the editor pane for LongConditional.java.
1. Press ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) to place the caret at the top of the file.
1. Press ⌘L (Command + L) to open the "goto line number" dialog. Navigate to line 10. (This should be a line that reads, "int errorCount = 0;").
1. Hold ⇧(Shift) and press ↓(Down Arrow) 20 times to select the if/else block that starts on line 10 (through line 29).
1. Press ⌘⌥M (Command + Option +M) to open the "extract method" dialog.
1. In the "extract method" dialog, select:
- Visibility: leave as _private_
- Name: change to _validateArguments_
- Arguments: leave as presented
1. Press ⏎ (Return/Enter) to apply the refactoring.
1. Press ⌘L (Command + L) to open the "goto line number" dialog. Navigate to line 12. (This should be a line that reads, "if (intArg >= 0 && intArg < 10) {").
1. Hold ⇧(Shift) and press ↓(Down Arrow) 19 times to select the if/else block that starts on line 12 (through line 30).
1. Press ⌘⌥M (Command + Option +M) to open the "extract method" dialog.
1. In the "extract method" dialog, select:
- Visibility: leave as _private_
- Name: leave as presented
- Arguments: leave as presented
1. Press ⏎ (Return/Enter) to apply the refactoring.
1. IntelliJ displays a dialog for "No exact method duplicates were found" and offers the option to keep the original signature or accept the changed signature. Press ← (Left Arrow) to highlight _keep original signature_ and press ⏎ (Return/Enter) to select that option. 
1. IntelliJ displays a dialog offering to replace the near-duplicate code. Press ⏎ (Return/Enter) to accept the suggestion. 
1. At this point there is near-duplicate code inside the extracted _getString()_ method. 
1. Press ⌘L (Command + L) to open the "goto line number" dialog. Navigate to line 21. (This should be a line that reads, "if (intArg >= 0 && intArg < 10) {").
1. Hold ⇧(Shift) and press ↓(Down Arrow) 7 times to select the if/else block that starts on line 21 (through line 27).
1. Press ⌘⌥M (Command + Option +M) to open the "extract method" dialog.
1. In the "extract method" dialog, select:
- Visibility: leave as _private_
- Name: change to _valueForRange_
- Arguments: leave as presented
1. Press ⏎ (Return/Enter) to apply the refactoring.
1. IntelliJ displays a drop-down message entitled "Process Duplicates," with the message "IDEA has detected 1 code fragment," etc.
1. The default selection is "No." Press ⌃⇥ (Ctrl + Tab) to move the cursor to "Yes."
1. Press ⏎ (Return/Enter) to accept the suggestion. 

To reverse the changes:

1. Press ⌘Z (Command + Z) repeatedly until the changes have been reversed.






