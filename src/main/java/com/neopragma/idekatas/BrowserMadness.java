package com.neopragma.idekatas;

/**
 * Example inspired by http://refactoring.com/catalog/extractVariable.
 */
public class BrowserMadness {

    public boolean handleResize(String browser, int resize) {
        if ( ((browser.toUpperCase().contains("MSIE")) &&
                (resize > 0)) ||
             ((browser.toUpperCase().contains("CHROME")) &&
                (resize > 0)) ) {
            return doX();
        } else {
            return doY();
        }
    }

    private boolean doX() {
        return true;
    }

    private boolean doY() {
        return true;
    }
}
