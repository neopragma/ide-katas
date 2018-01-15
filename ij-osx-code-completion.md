[Top](README.md)

# JetBrains IntelliJ IDEA on Mac OS X

Kata for practicing keyboard shortcuts for code completion features

- [Kata: Basic code completion](ij-osx-basic-code-completion.md)
- [Kata: Smart code completion](ij-osx-smart-code-completion.md)

### Kata: Basic code completion

Key sequences to practice:

- ⌃␣ (Ctrl + Space) - basic code completion
- ⌘⇧↩︎ (Command + Shift + Return) - complete statement

Walkthrough of steps with explanations:

1. Open the Java source file, CodeCompletionPractice.java.
1. Begin editing at the top of method1().
1. Type the following code:
```java
        double randomNumber = M
```
4. The editor presents a list of possible completions. The first one is "Math (java.lang)". Press ↩︎ (Return or Enter) to select that item. The code now reads:
```java
        double randomNumber = Math
```
and the caret is positioned immediatly after the token, "Math".

5. Type . (Period or Dot). The editor presents a list of possible completions.
6. Type "ran," so that the source line looks like this:
```java
        double randomNumber = Math.ran
```
7. The editor reduces the number of possible completions as you type. Only one option remains after you've typed "ran". Press ↩︎ (Return or Enter) to select it. The source line now looks like this:
```java
        double randomNumber = Math.random()
```
8. Press ⌘⇧↩︎ (Command + Shift + Return) to complete the statement. The editor appends a semicolon, leaving the source line like this:
```java
        double randomNumber = Math.random();
```
_Note:_ You might wonder why you should press three keys instead of just typing in the semicolon yourself. The statement completion feature can fill in much more than just a semicolon in different situations. It's a good habit to use it routinely.
9. On the next line in the source file, type the following:
```java
        double result = ra
```
10. The editor presents a list of possible completions and reduces the list as you type. At this point, only one suggestion remains. Press ↩︎ return to select it. The code in method1() now looks like this:
```java
    public void method1() {
        double randomNumber = Math.random();
        double result = randomNumber
    }
```
11. Press ⌘⇧↩︎ (Command + Shift + Return) to complete the statement. The editor appends a semicolon, leaving the source line like this:
```java
        double result = randomNumber;
```
12. On the next line, type
```java
        S
```
13. The editor presents a list of possible completions, of which the first one is "System (java.lang)". Press ↩︎ (Return or Enter) to select it. The source line now looks like this:
```java
        System
```
and the caret is positioned immediately after the token, "System".

14. Enter . (Period or Dot) and the editor presents a list of possible completions, of which the first one is "out". Press ↩︎ (Return or Enter) to select it. The source line now looks like this:
```java
        System.out
```
and the caret is positioned immediately after the token, "out".

15. Type . (Period or Dot) and the editor presents a list of possible completions, of which the first one is "println (int x)". Don't worry about the argument type. Press ↩︎ (Return or Enter) to select the item.
16. Start to fill in the argument to the println() method:
```java
        System.out.println("Result: " + re
```
17. The editor presents a list of possible completions and reduces the list as you type. At this point, only one option remains: "result". Press ↩︎ return to select it. The code in method1() now looks like this:


### Kata: Smart code completion

Key sequences to practice:

- ⌃⇧␣ (Ctrl + Shift + Space) - smart code completion
- ⌘⇧↩︎ (Command + Shift + Return) - complete statement
- ⌘P (Command + P) - parameter info within method call arguments

Steps:

1.
1.





