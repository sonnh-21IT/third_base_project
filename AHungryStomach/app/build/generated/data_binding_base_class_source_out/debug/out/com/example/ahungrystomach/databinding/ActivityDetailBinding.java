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
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.ahungrystomach.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final BottomAppBar appbarBot;

  @NonNull
  public final CollapsingToolbarLayout collapingToolbar;

  @NonNull
  public final ImageView img;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvAdd;

  @NonNull
  public final TextView tvAddcartPrice;

  @NonNull
  public final TextView tvAmount;

  @NonNull
  public final TextView tvArea;

  @NonNull
  public final TextView tvCategories;

  @NonNull
  public final TextView tvInstrucions;

  @NonNull
  public final TextView tvInstrucionsStr;

  @NonNull
  public final TextView tvSub;

  protected ActivityDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appbar, BottomAppBar appbarBot, CollapsingToolbarLayout collapingToolbar,
      ImageView img, LinearLayout linearLayout, Toolbar toolbar, TextView tvAdd,
      TextView tvAddcartPrice, TextView tvAmount, TextView tvArea, TextView tvCategories,
      TextView tvInstrucions, TextView tvInstrucionsStr, TextView tvSub) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.appbarBot = appbarBot;
    this.collapingToolbar = collapingToolbar;
    this.img = img;
    this.linearLayout = linearLayout;
    this.toolbar = toolbar;
    this.tvAdd = tvAdd;
    this.tvAddcartPrice = tvAddcartPrice;
    this.tvAmount = tvAmount;
    this.tvArea = tvArea;
    this.tvCategories = tvCategories;
    this.tvInstrucions = tvInstrucions;
    this.tvInstrucionsStr = tvInstrucionsStr;
    this.tvSub = tvSub;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailBinding>inflateInternal(inflater, R.layout.activity_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailBinding>inflateInternal(inflater, R.layout.activity_detail, null, false, component);
  }

  public static ActivityDetailBinding bind(@NonNull View view) {
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
  public static ActivityDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDetailBinding)bind(component, view, R.layout.activity_detail);
  }
}
