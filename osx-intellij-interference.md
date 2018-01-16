[Top](README.md) => [IntelliJ on OS X](ij-osx.md)

# Mac OS X / IntelliJ IDEA keymap interference

When the operating system and an application define the same key mapping, the operating system's mapping wins. Some examples of IntelliJ IDEA key mappings that are the same as OS X mappings are:

#### ⌃↑ (ctrl + up arrow)

- IntelliJ: In editor, move caret to previous method (in a Java source file)
- OS X: Open Mission Control

#### ⌃→ (ctrl + right arrow)

- IntelliJ: Go to next editor tab
- OS X: Go to next workspace

In some cases, there are alternatives you can use in IntelliJ so that you can keep the key binding defined in OS X. For example, you can move between editor tabs in IntelliJ with:

- ⇧⌘] and ⇧⌘[

In other cases, you have to make a choice. If you need the IntelliJ mapping more than you need the OS X mapping, you can disable the OS X mapping:

1. Open System Preferences...
1. Open Keyboard
1. Go to the Shortcuts tab
1. Uncheck the checkboxes next to key mappings you want to disable

## Rename

The default key mapping in IntelliJ to invoke the Rename refactoring is ⇧F6. The default key mapping in OS X for ⇧F6 is "move focus to the floating window." You have to change one or the other if you need to use both features of the two products.

In my case, I changed the Intellij mapping to ⌃F6 (Ctrl + F6).

