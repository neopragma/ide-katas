[Top](README.md) => [Code Completion Katas](ij-osx-code-completion.md)

# JetBrains IntelliJ IDEA on Mac OS X

Kata for practicing keyboard shortcuts for smart code completion features. From [the documentation](http://www.jetbrains.com/help/idea/auto-completing-code.html): "Smart code completion filters the suggestions list and shows only the types applicable to the current context."

### Kata: Smart code completion

Key sequences to practice:

- ⌃⇧␣ (Ctrl + Shift + Space) - smart code completion
- ⌘⇧↩︎ (Command + Shift + Return) - complete statement
- ⌥⌘⇧] (Option + Command + Shift + ]) - select from caret to end of code block
- ⌫ (Delete) - delete selected text

Keystrokes without explanations:

- Open the Java source file, CodeCompletionPractice.java.
- Begin editing at the top of method1().
- Repeat the following keyboard inputs until the sequence becomes fluid.
```
Lis
⏎
<Int
→
␣
⏎
⌃⇧␣
⏎
⌃⇧
⏎
⏎
i
⏎
.
⏎
5
⌘⇧⏎
⏎
if (i
⏎
.is
⏎
{
␣
⏎
thro
⏎
n
⏎
R
⏎
"WTF??"
⌘⇧⏎
```
And then to revert:

1. Place the caret at the beginning of the first line of code in method1().
1. Press
```
⌥⌘⇧]
⌫
```


Walkthrough of steps with explanations:

1. Open the Java source file, CodeCompletionPractice.java.
1. Begin editing at the top of method(1).
1. Type
```java
        Lis
```
The editor presents a list of possibilities and narrows the list as you type. Once you have typed "Lis" only one entry remains: List<E>. Press ⏎ (Return or Enter) to select it.

Unfortunately, this leaves you with
```java
        List
```
instead of
```java
        List<
```

4. Type "<Int" so that the source line looks like this:
```java
        List<Int
```
The editor presents a list of possibilities and narrows the list as you type. Once you have typed "Int" only one entry remains: List<Integer>. Press ⏎ (Return or Enter) to select it.

The source line now looks like this:
```java
        List<Integer>
```
with the caret positioned _before_ the closing ">".

5. Press → (Right Arrow) to move the caret past the closing ">".
6. Press ␣ (Space) to insert a space after the closing ">".
7. Press ⌃⇧␣ (Ctrl + Shift + Space) to activate smart code completion. The editor presents a list of somewhat reasonable variable names to follow the List declaration.
8. Press ⏎ (Return or Enter) to select the first suggestion, "integers". The source line now looks like this:
```java
        List<Integer> integers
```
with the caret positioned just after the token, "integers".

9. Type this much of the source line (ending with a space, which you can't see in the sample):
```java
        List<Integer> integers = new
```

10. Press ⌃⇧␣ (Ctrl + Shift + Space). The editor presents a list of suggestions. The highlighted entry is "ArrayList (java.lang)".

11. Press ⏎ (Return or Enter) to select te highlighted suggestion. The source line now looks like this:
```java
        List<Integer> integers = new ArrayList<Integer>();
```

12. Start entering the next line of source code. Type:
```java
        i
```
The editor presents a list of suggestions. The first one is "integers", the name of the local variable declared on the previous source line.

13. Press ⏎ (Return or Enter) to select "integers". The source line now looks like this:
```java
        integers
```

14. Type . (Period or Dot). The editor presents a list of suggestions. The first one is "add(Integer e)".

15. Press ⏎ (Return or Enter) to select "add(Integer e)". The source line now looks like this:
```java
        integers.add()
```
with the caret positioned between the parentheses.

16. Type "5". The source line now looks like this:
```java
        integers.add(5)
```
with the caret positioned after the 5 and before the closing parenthesis.

17. Press ⌘⇧⏎ (Command + Shift + Return) to auto-complete the source statement. The editor skips to the end of the line and adds a semicolon. The source line now looks like this:
```java
        integers.add(5);
```

18. On the next line, type "if (i". The editor will present suggestions as you type. After typing the characters shown, the first suggestion will be "integers", the name of the local variable you declared earlier in the method.

19. Press ⏎ (Return or Enter) to select "integers". The source line now looks like this:
```java
        if (integers)
```
with the caret positioned between "integers" and ")".

20. Type ".is". The editor will present suggestions as you type. After typing the characters shown, the first suggestion will be "isEmpty()".

21. Press ⏎ (Return or Enter) to select "isEmpty()". The source line now looks like this:
```java
        if (integers.isEmpty())
```

22. Type " {⏎" (Space, then "{", then Return). The source statement now looks like this:
```java
        if (integers.isEmpty()) {

        }
```
with the caret appropriately indented on the blank line between the curly braces.

23. Type "thro". The editor will present suggestions as you type. After typing the characters shown, the only suggestion remaining is "throw".

24. Press ⏎ (Return or Enter) to select the suggestion, "throw". The editor completes the token "throw" and adds a blank space after it. The source statement now looks like this:
```java
        if (integers.isEmpty()) {
            throw
        }
```

25. Type "n" and the first suggestion is "new".

26. Press ⏎ (Return or Enter) to select "new". The editor completes the token "new" and adds a blank space after it. The source statement now looks like this:
```java
        if (integers.isEmpty()) {
            throw new
        }
```

27. Type "R" and the first suggestion is "RuntimeException".

28. Press ⏎ (Return or Enter) to select "RuntimeException". The source statement now looks like this:
```java
        if (integers.isEmpty()) {
            throw new RuntimeException()
        }
```
with the caret positioned between the parentheses.

29. Type "WTF??" (in quotes) as the message for the exception. The editor will add the closing quotation mark when you type the first one. The caret will end up between the second "?" and the closing parenthesis.

30. Press ⌘⇧⏎ (Command + Shift + Return) to complete the statement. The editor will skip to the end of the statement and add a semicolon. The code in method1() now looks like this:
```java
    public void method1() {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(5);
        if (integers.isEmpty()) {
            throw new RuntimeException("WTF??");
        }
    }
```

31. Reverse the changes so you can repeat the sequence for practice. Position the caret at the start of the first line of code in method1(). Press ⌥⌘⇧] (Option + Command + Shift + ]) to select text up to the end of the block. Press ⌫ (Delete) to delete the code.
