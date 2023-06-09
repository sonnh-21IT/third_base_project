// Generated by data binding compiler. Do not edit!
package com.example.ahungrystomach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ahungrystomach.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCartBinding extends ViewDataBinding {
  @NonNull
  public final CardView actionbar;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final LinearLayout cart;

  @NonNull
  public final RecyclerView rcCart;

  @NonNull
  public final CardView titleBar;

  @NonNull
  public final TextView total;

  @NonNull
  public final LinearLayout totalBar;

  @NonNull
  public final TextView tv;

  @NonNull
  public final TextView tvAmount;

  @NonNull
  public final TextView tvCheckout;

  @NonNull
  public final TextView tvEmpty;

  @NonNull
  public final TextView tvHome;

  @NonNull
  public final ConstraintLayout viewCart;

  protected ActivityCartBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView actionbar, ImageView btnBack, LinearLayout cart, RecyclerView rcCart,
      CardView titleBar, TextView total, LinearLayout totalBar, TextView tv, TextView tvAmount,
      TextView tvCheckout, TextView tvEmpty, TextView tvHome, ConstraintLayout viewCart) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionbar = actionbar;
    this.btnBack = btnBack;
    this.cart = cart;
    this.rcCart = rcCart;
    this.titleBar = titleBar;
    this.total = total;
    this.totalBar = totalBar;
    this.tv = tv;
    this.tvAmount = tvAmount;
    this.tvCheckout = tvCheckout;
    this.tvEmpty = tvEmpty;
    this.tvHome = tvHome;
    this.viewCart = viewCart;
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_cart, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCartBinding>inflateInternal(inflater, R.layout.activity_cart, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_cart, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCartBinding>inflateInternal(inflater, R.layout.activity_cart, null, false, component);
  }

  public static ActivityCartBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityCartBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCartBinding)bind(component, view, R.layout.activity_cart);
  }
}
