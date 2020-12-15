package com.mohammed.hypermarketandroidtask.starterpackage.anim;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/starterpackage/anim/FadeTransition;", "Landroid/transition/Transition;", "startAlpha", "", "endAlpha", "(FF)V", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "captureEndValues", "", "transitionValues", "Landroid/transition/TransitionValues;", "captureStartValues", "captureValues", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "endValues", "Companion", "app_debug"})
public final class FadeTransition extends android.transition.Transition {
    private float startAlpha = 0.0F;
    private float endAlpha = 1.0F;
    private static final java.lang.String PROP_NAME_ALPHA = "android:custom:alpha";
    public static final com.mohammed.hypermarketandroidtask.starterpackage.anim.FadeTransition.Companion Companion = null;
    
    private final void captureValues(android.transition.TransitionValues transitionValues) {
    }
    
    @java.lang.Override()
    public void captureStartValues(@org.jetbrains.annotations.NotNull()
    android.transition.TransitionValues transitionValues) {
    }
    
    @java.lang.Override()
    public void captureEndValues(@org.jetbrains.annotations.NotNull()
    android.transition.TransitionValues transitionValues) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.animation.Animator createAnimator(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup sceneRoot, @org.jetbrains.annotations.NotNull()
    android.transition.TransitionValues startValues, @org.jetbrains.annotations.NotNull()
    android.transition.TransitionValues endValues) {
        return null;
    }
    
    public FadeTransition(float startAlpha, float endAlpha) {
        super();
    }
    
    public FadeTransition(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/starterpackage/anim/FadeTransition$Companion;", "", "()V", "PROP_NAME_ALPHA", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}