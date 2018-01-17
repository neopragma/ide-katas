[Top](README.md) => [IntelliJ on Windows/Linux](ij-win-lin.md)

# JetBrains IntelliJ IDEA on Windows/Linux

Kata for practicing keyboard shortcuts for common editing operations

### Kata: Go to last edit location

**Key sequences to practice**

- (F2) - go to the next error in the file
- (Shift + F2) - go to the previous error in the file

**Walkthrough of steps with explanations**

1. Open the Java source file, CodeCompletionPractice.java.
1. Enter some Java source code that contains syntax error, for example like this:
```java
    public void method1() {
        int a = 4;
        int b = 6;
        String x = "hey"
        int c = 7;
        int d = "alpha";
        if (myMethod()) {
            System.out.prinnn;
        }
    }
}
```
1. Press (F2) repeatedly and watch the caret move forward through the file to each error.
1. Press (Shift + F2) repeatedly and watch the caret move backward through the file to each error.

And then to revert:

1. Press (Ctrl + Z) repeatedly to undo changes in each file.
