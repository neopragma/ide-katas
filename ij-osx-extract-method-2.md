[Top](README.md) => [IntelliJ IDEA on Mac OS X](ij-osx.md)

# JetBrains IntelliJ IDEA on Mac OS X

### Kata: Extract method 2

In this _kata_, we select several lines and extract them into a method. The automated _extract method_ refactoring in IntelliJ IDEA does not generate exactly the result we want, and we must edit the new method manually to complete the refactoring.

### Key sequences to practice

- ⌃⇥ (Ctrl + Tab) - navigate from the project view pane to an editor pane
- ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) - navigate to the top of the file (in editor)
- ⌥→ (Option + Right Arrow) - move forward by token
- ⌥⇧→ (Option + Shift + Right Arrow) - move forward by token while selecting
- ⌥← (Option + Left Arrow) - move backward by token
- → (Right Arrow) - move the caret one position to the right
- ⌘⌥⇧] (Command + Option + Shift + ]) - select from caret through end of block
- ⇧ and ↓ (Shift) with (Down Arrow) - select lines
- ⌘⌥M (Command + Option + M) - open the "extract method" dialog
- fnF2 (Fn + F2) - go to the next error in the file
- ⌘⏎ (Command + Return/Enter) - "smart" line split (preserves formatting)
- ⌘⌫ (Command + Delete/Backspace) - delete the current line (with nothing selected)
- ⌃↓ (Ctrl + Up Arrow) - Move backward to the previous method

**Keystrokes without explanations**

```
⌃⇥
⌘↖︎ (or fn⌘←)
⌘L 12
hold ⇧
↓ (repeat through line 29)
release ⇧
⌘⌥M
Visibility: Public
Name: validateArguments
Arguments: stringArg
OK
fnF2
⌥→
⌥→
⌘⏎
⌘⌫
⌥←
"
fnF2
⌘⌫
fnF2
⌘⌫
fnF2
⌥⇧→
⌥⇧→
⌥⇧→
!result.equals("")
fnF2
⌘⌫
⌃↑
⌥⇧←
void
fnF2
⌘⌫
fn⇧F2
⌥⇧→
⌥⇧→
⌫
```


**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. If focus is not already in the editor pane for LongConditional.java, press ⌃⇥ (Ctrl + Tab) and select the editor pane for LongConditional.java.
1. Press ⌘L (Command +L) to open the "go to line number" dialog and navigate to line 12.
1. Hold ⇧ (Shift) and press ↓ (Down Arrow) until lines 12 through 29 inclusive are selected.
1. Press ⌘⌥M (Command + Option +M) to open the "extract method" dialog.
1. In the "extract method" dialog, select:
- Visibility: Public
- Name: validateArguments
- Arguments: stringArg, intArg

7. Choose OK. The generated method has syntax errors.
1. Press fnF2 (Fn + F2) to go to the next error in the file. That should take you to line 58, which should look like this:
```java
        int errorCount = ; String result = ;
```
with the caret positioned just after the first equals sign (=).

9. We don't need the variable _errorCount_ at all. Press ⌥→ (Option + Right Arrow) twice to advance the caret up to the token, "String".
10. Press ⌘⏎ (Command + Return/Enter) to do a "smart" line split. The caret remains on the first line, which we now want to delete.
11. Press ⌘⌫ (Command + Delete/Backspace) to delete the current line. The caret is left at the end of the line reading, "String result = ;".
12. Press ⌥← (Option + Left Arrow) to move the caret before the semicolon.
13. Initialize the variable _result_ to an empty string, so it looks like this:
```java
        String result = "";
```

14. Now we can delete the lines that refer to _errorCount_. Press fnF2 (Fn + F2) to move focus to the next error. Press ⌘⌫ (Command + Delete) to delete that line. Do this sequence of keystrokes twice to delete the lines where _errorCount_ is incremented.
15. Press fnF2 (Fn + F2) one more time to position the caret at the beginning of the token, "errorCount" on line 69, which should read
```java
        if (errorCount > 0) {
```

16. Press ⌥⇧→ (Option + Shift + Right Arrow) three times to select the text inside the parentheses. The selected text should be
```java
errorCount > 0
```

17. Overtype the selection with the text, "!result.equals("")", resulting in:
```java
        if (!result.equals("")) {
```

18. Now we will delete the remaining line that contains a reference to _errorCount_. Press fnF2 (Fn + F2) to move the caret to the next error, and ⌘⌫ (Command + Delete/Backspace) to delete that line.

19. The method should not return anything. Press ⌃↑ (Ctrl + Up Arrow) to move the caret to the method declaration.
20. Press ⌥⇧← (Option + Shift + Left Arrow) to move the caret ahead to the token "String" (method return type) and select it.
21. Overtype the selection with "void", so the line now looks like this:
```java
    private void validateArguments(String stringArg, int intArg) {
```

at this point, the _return_ statement is marked as an error.

22. Press fnF2 (Fn + F2) to advance the caret to the next error.
23. Press ⌘⌫ (Command + Delete/Backspace) to delete the line containing the _return_ statement.
24. By changing this method to return _void_, we introduced an error on the line that calls the method. Press fn⇧F2 (Fn + Shift + F2) to move the caret to the previous error. This is the line that calls the _validateArguments_ method.
25. Press ⌥⇧→ (Option + Shift + Right Arrow) twice to select the text, "result = ".
26. Press ⌫ (Delete/Backspace) to delete the selection. The line should now look like this:
```java
        validateArguments(stringArg, intArg);
```


To reverse the changes:

1. Press ⌘Z (Command + Z) repeatedly until the changes have been reversed. Should be 30 times.






