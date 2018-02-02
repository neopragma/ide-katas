[Top](README.md) => [IntelliJ IDEA on Mac OS X](ij-osx.md)

# JetBrains IntelliJ IDEA on Mac OS X

### Kata: Extract Constant

The _extract constant_ refactoring converts a literal value into a named constant.

### Key sequences to practice

- ⌃⇥ (Ctrl + Tab) - navigate from the project view pane to an editor pane
- ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) or fn↑ (Fn + Up Arrow) - navigate to the top of the file (in editor)
- ⌥→ (Option + Right Arrow) - move forward by token
- ⌥⇧→ (Option + Shift + Right Arrow) - move forward by token while selecting
- ⌥← (Option + Left Arrow) - move backward by token
- ⌘F (Command +F) - find in file
- ⌘G (Command +G) - repeat the last find operation
- ⎋ (Escape) - dismiss "find" dialog
- ⌘⌥C (Command + Option + C) - open the "extract constant" dialog
- ⏎ (Return/Enter) - complete action

**Keystrokes without explanations**

```
⌃⇥
⌘↖︎ (or fn⌘←)
⌘F
"
⏎
⎋
⇧⌥→
hold ⌘⌥
C
release ⌘⌥
EMPTY_STRING
⇥
⇥
↓
(mouse: select "replace all occurrences" checkbox)
⏎
⌘G
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→ (5 times)
⌘⌥C
⏎
⌘G
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→ (5 times)
⌘⌥C
⏎
⌘G
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→ (13 times)
⌘⌥C
INT_ARG_OUT_OF_RANGE
⏎
⌘G
⇧⌥→
⇧⌥→
⇧⌥→
⇧⌥→ (4 times)
⌘⌥C
⏎

```


**Walkthrough of steps with explanations**

1. Open the Java source file, LongConditional.java.
1. If focus is not already in the editor pane for LongConditional.java, press ⌃⇥ (Ctrl + Tab) and select the editor pane for LongConditional.java.
1. Press ⌘↖︎ (Command + Home) or fn⌘← (Fn + Command + Left Arrow) or fn↑ (Fn + Up Arrow) to navigate to the top of the file (depends on the keyboard).
1. Press ⌘F (Command + F) to open the "find" dialog.
1. Type a quotation mark (") as the text to find.
1. Press ⏎ (Return/Enter) to move the caret to the first occurrence of quotation mark. It should be a hard-coded empty string literal.
1. Press ⎋ (Escape) to dismiss the "find" dialog. At this point, the opening quotation mark will be selected and the caret will be positioned between the two quotation marks of the empty string literal.
1. Press ⇧⌥→ (Shift + Option + Right Arrow) to extend the selection through the closing quotation mark of the hard-coded empty string literal. 
1. Hold ⌘⌥ (Command + Option) and press C twice to open the "extract constant" dialog and the more-detailed dialog. The default name of the constant will be RESULT.
1. Overtype the name of the constant with EMPTY_STRING.
1. Press ⇥ (Tab) twice to advance the caret to the radio group showing access modifiers. 
1. Press ↓ (Down Arrow) once to choose "private."
1. At this point there is a problem. We want to select the checkbox for "replace all occurrences," but there doesn't seem to be a way to reach it via the keyboard. Use the mouse to check the checkbox. 
1. Press ⏎ (Return/Enter) to complete the refactoring.
1. Press ⌘G (Command + G) to repeat the "find" operation.  
1. The next occurrence of quotation mark is now selected and the caret is positioned just after it. It should be a string literal value, "stringArg cannot be null".
1. At this point, the opening quotation mark will be selected and the caret will be positioned just after the quotation mark.
1. Press ⇧⌥→ (Shift + Option + Right Arrow) five times to extend the selection through the closing quotation mark of the string literal. 
1. Press ⌘⌥C (Command + Option + C) to open the "extract constant" dialog. The default name of the constant will be STRING_ARG_CANNOT_BE_NULL.
1. Press ⏎ (Return/Enter) to accept the suggested name and to complete the refactoring. 
1. Press ⌘G (Command + G) to repeat the "find" operation.  
1. The next occurrence of quotation mark is now selected and the caret is positioned just after it. It should be a string literal value, "stringArg cannot be empty".
1. At this point, the opening quotation mark will be selected and the caret will be positioned just after the quotation mark. .
1. Press ⇧⌥→ (Shift + Option + Right Arrow) five times to extend the selection through the closing quotation mark of the string literal. 
1. Press ⌘⌥C (Command + Option + C) to open the "extract constant" dialog. The default name of the constant will be STRING_ARG_CANNOT_BE_EMPTY.
1. Press ⏎ (Return/Enter) to accept the suggested name and to complete the refactoring. 
1. Press ⌘G (Command + G) to repeat the "find" operation.  
1. The next occurrence of quotation mark is now selected and the caret is positioned just after it. It should be a string literal value that starts with, "intArg must be non-negative.".
1. At this point, the opening quotation mark will be selected and the caret will be positioned just after the quotation mark. .
1. Press ⇧⌥→ (Shift + Option + Right Arrow) 13 times to extend the selection through the closing quotation mark of the string literal. 
1. Press ⌘⌥C (Command + Option + C) to open the "extract constant" dialog. The default name of the constant will be INT_ARG_MUST_BE_NON_NEGATIVE_AND_LESS_THAN_20.
1. Overtype the name to INT_ARG_OUT_OF_RANGE.
1. Press ⏎ (Return/Enter) to complete the refactoring. 
1. Press ⌘G (Command + G) to repeat the "find" operation.  
1. The next occurrence of quotation mark is now selected and the caret is positioned just after it. It should be a string literal value, "Error count:"..
1. At this point, the opening quotation mark will be selected and the caret will be positioned just after the quotation mark. .
1. Press ⇧⌥→ (Shift + Option + Right Arrow) 4 times to extend the selection through the closing quotation mark of the string literal. 
1. Press ⌘⌥C (Command + Option + C) to open the "extract constant" dialog. The default name of the constant will be ERROR_COUNT.
1. Press ⏎ (Return/Enter) to accept the suggested name and to complete the refactoring. 

To reverse the changes:

1. Press ⌘Z (Command + Z) repeatedly until the changes have been reversed. Should be 30 times.






