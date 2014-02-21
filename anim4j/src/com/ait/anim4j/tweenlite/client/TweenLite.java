package com.ait.anim4j.tweenlite.client;

import com.ait.anim4j.core.client.Animation;
import com.ait.anim4j.core.client.Function;
import com.ait.anim4j.core.client.TweenLiteConfig;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * TweenLite is an extremely fast, lightweight, and flexible animation tool that
 * serves as the foundation of the GreenSock Animation Platform (GSAP). A
 * TweenLite instance handles tweening one or more properties of any object (or
 * array of objects) over time. TweenLite can be used on its own to accomplish
 * most animation chores with minimal file size or it can be use in conjuction
 * with advanced sequencing tools like TimelineLite or TimelineMax to make
 * complex tasks much simpler
 * 
 */
public class TweenLite extends Animation {

    private static TweenLite INSTANCE;

    protected TweenLite(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static TweenLite get() {
        if (INSTANCE == null) {
            INSTANCE = new TweenLite();
        }
        return INSTANCE;
    }

    /**
     * Method for creating a TweenLite instance that animates to the specified
     * destination values (from the current values).
     * 
     * @param target
     *            , Target object whose properties this tween affects.
     * @param duration
     *            ,Duration in seconds
     * @param config
     *            , An object defining the end value for each property that
     *            should be tweened as well as any special properties like
     *            onComplete, ease, etc.
     * @return self (makes chaining easier)
     */
    public TweenLite to(Widget target, double duration, TweenLiteConfig config) {
        return to(target.getElement(), duration, config);
    }

    /**
     * Method for creating a TweenLite instance that animates to the specified
     * destination values (from the current values).
     * 
     * @param target
     *            , Target object whose properties this tween affects.
     * @param duration
     *            ,Duration in seconds
     * @param config
     *            , An object defining the end value for each property that
     *            should be tweened as well as any special properties like
     *            onComplete, ease, etc.
     * @return self (makes chaining easier)
     */
    public native TweenLite to(Element target, double duration, TweenLiteConfig config)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.to(target, duration,
				config.@com.ait.anim4j.core.client.JsObject::getJsObj()());
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public TweenLite to(TweenLiteConfig config, double duration, Widget... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Widget el : targets) {
            elements.push(el.getElement());
        }
        return _to(elements, duration, config);
    }

    public TweenLite to(TweenLiteConfig config, double duration, Element... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Element el : targets) {
            elements.push(el);
        }
        return _to(elements, duration, config);
    }

    private native TweenLite _to(JavaScriptObject target, double duration, TweenLiteConfig config)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.to(target, duration,
				config.@com.ait.anim4j.core.client.JsObject::getJsObj()());
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenLite instance that animates to the specified
     * destination values (from the current values).
     * 
     * @param target
     *            , id of Target object whose properties this tween affects.
     * @param duration
     *            ,Duration in seconds
     * @param config
     *            , An object defining the end value for each property that
     *            should be tweened as well as any special properties like
     *            onComplete, ease, etc.
     * @return self (makes chaining easier)
     */
    public native TweenLite to(String target, double duration, TweenLiteConfig config)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.to(target, duration,
				config.@com.ait.anim4j.core.client.JsObject::getJsObj()());
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides a simple way to call a function after a set amount of time (or
     * frames).
     */
    public native TweenLite delayCall(double delay, Function callback)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.to(delay, function() {
			callback.@com.ait.anim4j.core.client.Function::execute()();
		});
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides a simple way to call a function after a set amount of time (or
     * frames).
     */
    public native TweenLite delayCall(double delay, Function callback, boolean useFrames)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.to(delay, function() {
			callback.@com.ait.anim4j.core.client.Function::execute()();
		}, null, null, useFrames);
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides An easy way to change the default overwrite mode.
     */
    public static native void setDefaultOverwrite(String value)/*-{
		$wnd.TweenLite.defaultOverwrite = value;
    }-*/;

    /**
     * Method for creating a TweenLite instance that tweens backwards - you
     * define the BEGINNING values and the current values are used as the
     * destination values which is great for doing things like animating objects
     * onto the screen because you can set them up initially the way you want
     * them to look at the end of the tween and then animate in from elsewhere.
     */
    public TweenLite from(Widget target, double duration, TweenLiteConfig config) {
        return from(target.getElement(), duration, config);
    }

    /**
     * Method for creating a TweenLite instance that tweens backwards - you
     * define the BEGINNING values and the current values are used as the
     * destination values which is great for doing things like animating objects
     * onto the screen because you can set them up initially the way you want
     * them to look at the end of the tween and then animate in from elsewhere.
     */
    public native TweenLite from(Element target, double duration, TweenLiteConfig config)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.from(target, duration,
				config.@com.ait.anim4j.core.client.JsObject::getJsObj()());
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public TweenLite from(TweenLiteConfig config, double duration, Widget... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Widget el : targets) {
            elements.push(el.getElement());
        }
        return _from(elements, duration, config);
    }

    public TweenLite from(TweenLiteConfig config, double duration, Element... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Element el : targets) {
            elements.push(el);
        }
        return _from(elements, duration, config);
    }

    private native TweenLite _from(JavaScriptObject target, double duration, TweenLiteConfig config)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.from(target, duration,
				config.@com.ait.anim4j.core.client.JsObject::getJsObj()());
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenLite instance that tweens backwards - you
     * define the BEGINNING values and the current values are used as the
     * destination values which is great for doing things like animating objects
     * onto the screen because you can set them up initially the way you want
     * them to look at the end of the tween and then animate in from elsewhere.
     */
    public native TweenLite from(String target, double duration, TweenLiteConfig config)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.from(target, duration,
				config.@com.ait.anim4j.core.client.JsObject::getJsObj()());
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenLite instance that allows you to define both
     * the starting and ending values (as opposed to to() and from() tweens
     * which are based on the target's current values at one end or the other).
     */
    public native TweenLite fromTo(String target, double duration, TweenLiteConfig fromConfig, TweenLiteConfig toConfig)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.fromTo(target, duration,
				fromConfig.@com.ait.anim4j.core.client.JsObject::getJsObj()(),
				toConfig.@com.ait.anim4j.core.client.JsObject::getJsObj()());
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenLite instance that allows you to define both
     * the starting and ending values (as opposed to to() and from() tweens
     * which are based on the target's current values at one end or the other).
     */
    public native TweenLite fromTo(Element target, double duration, TweenLiteConfig fromConfig, TweenLiteConfig toConfig)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.fromTo(target, duration,
				fromConfig.@com.ait.anim4j.core.client.JsObject::getJsObj()(),
				toConfig.@com.ait.anim4j.core.client.JsObject::getJsObj()());
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenLite instance that allows you to define both
     * the starting and ending values (as opposed to to() and from() tweens
     * which are based on the target's current values at one end or the other).
     */
    public TweenLite fromTo(Widget target, double duration, TweenLiteConfig fromConfig, TweenLiteConfig toConfig) {
        return fromTo(target.getElement(), duration, fromConfig, toConfig);

    }

    private native TweenLite _fromTo(JavaScriptObject target, double duration, TweenLiteConfig fromConfig,
                    TweenLiteConfig toConfig)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		var obj = peer.fromTo(target, duration,
				fromConfig.@com.ait.anim4j.core.client.JsObject::getJsObj()(),
				toConfig.@com.ait.anim4j.core.client.JsObject::getJsObj()());
		return @com.ait.anim4j.tweenlite.client.TweenLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public TweenLite fromTo(TweenLiteConfig fromConfig, TweenLiteConfig endConfig, double duration, Widget... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Widget el : targets) {
            elements.push(el.getElement());
        }
        return _fromTo(elements, duration, fromConfig, endConfig);
    }

    public TweenLite fromTo(TweenLiteConfig fromConfig, TweenLiteConfig toConfig, double duration, Element... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Element el : targets) {
            elements.push(el);
        }
        return _fromTo(elements, duration, fromConfig, toConfig);
    }

    public native void killDelayedCallsTo(Function callback)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		peer.killDelayedCallsTo(function() {
			callback.@com.ait.anim4j.core.client.Function::execute()();
		});
    }-*/;

    public native void killTweensOf(String target)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		peer.killTweensOf(target);
    }-*/;

    public native void killTweensOf(String target, TweenLiteConfig config)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		peer.killTweensOf(target,
				config.@com.ait.anim4j.core.client.JsObject::getJsObj()());
    }-*/;

    public native void killTweensOf(Element target)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		peer.killTweensOf(target);
    }-*/;

    public native void killTweensOf(Element target, TweenLiteConfig config)/*-{
		var peer = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		peer.killTweensOf(target,
				config.@com.ait.anim4j.core.client.JsObject::getJsObj()());
    }-*/;

    public void killTweensOf(Widget target) {
        this.killTweensOf(target.getElement());
    }

    public void killTweensOf(Widget target, TweenLiteConfig config) {
        this.killTweensOf(target.getElement(), config);
    }

    private TweenLite() {
        jsObj = createNativePeer();
    }

    private native JavaScriptObject createNativePeer()/*-{
		return $wnd.TweenLite;
    }-*/;

}
