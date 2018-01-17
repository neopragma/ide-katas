[Top](README.md) => [IntelliJ on Windows/Linux](ij-win-lin.md)

# JetBrains IntelliJ IDEA on Windows/Linux

### Kata: Expand and collapse a code block

A funny thing about this function is that it seems to collapse an entire method rather than just the block where the caret is located. Even if you select a specific block of code, such as an if/else block, it still collapses the entire method where the selection resides. This may be useful when working with legacy code that has many methods per class. It is probably not very helpful in a well-designed code base.

**Key sequences to practice**

- (Ctrl + NumPadMinus) - Collapse code block
- (Ctrl + NumPadPlus) - Expand code block

**Steps with explanations**

1. Open the Java source file, LongConditional.java.
1. Place the caret anywhere inside a method.
1. Press (Ctrl + NumPadMinus) to collapse the method.
1. Press (Ctrl + NumPadPlus) to expand the method.

