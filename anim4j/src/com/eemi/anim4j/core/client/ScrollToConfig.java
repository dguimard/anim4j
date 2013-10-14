package com.eemi.anim4j.core.client;

/**
 * Configuration object for the scrollTo Plugin. The ScrollConfig module must be
 * inheritered if using TweenLite
 */
public class ScrollToConfig extends JsObject {

    public ScrollToConfig() {
        jsObj = JsoHelper.createObject();
    }

    public void setX(double value) {
        JsoHelper.setAttribute(jsObj, "x", value);
    }

    public void setX(String value) {
        JsoHelper.setAttribute(jsObj, "x", value);
    }

    public void setY(double value) {
        JsoHelper.setAttribute(jsObj, "y", value);
    }

    public void setY(String value) {
        JsoHelper.setAttribute(jsObj, "y", value);
    }

}
