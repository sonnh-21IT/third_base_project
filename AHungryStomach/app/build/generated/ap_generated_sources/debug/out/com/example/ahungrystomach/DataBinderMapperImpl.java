package com.example.ahungrystomach;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.ahungrystomach.databinding.ActivityCartBindingImpl;
import com.example.ahungrystomach.databinding.ActivityCategoryBindingImpl;
import com.example.ahungrystomach.databinding.ActivityCheckOutBindingImpl;
import com.example.ahungrystomach.databinding.ActivityDetailBindingImpl;
import com.example.ahungrystomach.databinding.ActivityHomeBindingImpl;
import com.example.ahungrystomach.databinding.ActivitySearchBindingImpl;
import com.example.ahungrystomach.databinding.ActivitySplashBindingImpl;
import com.example.ahungrystomach.databinding.ItemCartBindingImpl;
import com.example.ahungrystomach.databinding.ItemCategoryBindingImpl;
import com.example.ahungrystomach.databinding.ItemCheckoutBindingImpl;
import com.example.ahungrystomach.databinding.ItemMealBindingImpl;
import com.example.ahungrystomach.databinding.ItemPopularBindingImpl;
import com.example.ahungrystomach.databinding.ItemSearchBindingImpl;
import com.example.ahungrystomach.databinding.ItemSearchedBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCART = 1;

  private static final int LAYOUT_ACTIVITYCATEGORY = 2;

  private static final int LAYOUT_ACTIVITYCHECKOUT = 3;

  private static final int LAYOUT_ACTIVITYDETAIL = 4;

  private static final int LAYOUT_ACTIVITYHOME = 5;

  private static final int LAYOUT_ACTIVITYSEARCH = 6;

  private static final int LAYOUT_ACTIVITYSPLASH = 7;

  private static final int LAYOUT_ITEMCART = 8;

  private static final int LAYOUT_ITEMCATEGORY = 9;

  private static final int LAYOUT_ITEMCHECKOUT = 10;

  private static final int LAYOUT_ITEMMEAL = 11;

  private static final int LAYOUT_ITEMPOPULAR = 12;

  private static final int LAYOUT_ITEMSEARCH = 13;

  private static final int LAYOUT_ITEMSEARCHED = 14;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(14);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.activity_cart, LAYOUT_ACTIVITYCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.activity_category, LAYOUT_ACTIVITYCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.activity_check_out, LAYOUT_ACTIVITYCHECKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.activity_detail, LAYOUT_ACTIVITYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.activity_search, LAYOUT_ACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.item_cart, LAYOUT_ITEMCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.item_checkout, LAYOUT_ITEMCHECKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.item_meal, LAYOUT_ITEMMEAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.item_popular, LAYOUT_ITEMPOPULAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.item_search, LAYOUT_ITEMSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahungrystomach.R.layout.item_searched, LAYOUT_ITEMSEARCHED);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCART: {
          if ("layout/activity_cart_0".equals(tag)) {
            return new ActivityCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCATEGORY: {
          if ("layout/activity_category_0".equals(tag)) {
            return new ActivityCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCHECKOUT: {
          if ("layout/activity_check_out_0".equals(tag)) {
            return new ActivityCheckOutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_check_out is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDETAIL: {
          if ("layout/activity_detail_0".equals(tag)) {
            return new ActivityDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCH: {
          if ("layout/activity_search_0".equals(tag)) {
            return new ActivitySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCART: {
          if ("layout/item_cart_0".equals(tag)) {
            return new ItemCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORY: {
          if ("layout/item_category_0".equals(tag)) {
            return new ItemCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHECKOUT: {
          if ("layout/item_checkout_0".equals(tag)) {
            return new ItemCheckoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_checkout is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMEAL: {
          if ("layout/item_meal_0".equals(tag)) {
            return new ItemMealBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_meal is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPOPULAR: {
          if ("layout/item_popular_0".equals(tag)) {
            return new ItemPopularBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_popular is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCH: {
          if ("layout/item_search_0".equals(tag)) {
            return new ItemSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCHED: {
          if ("layout/item_searched_0".equals(tag)) {
            return new ItemSearchedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_searched is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "category_name");
      sKeys.put(2, "meal");
      sKeys.put(3, "mealitem");
      sKeys.put(4, "popular");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(14);

    static {
      sKeys.put("layout/activity_cart_0", com.example.ahungrystomach.R.layout.activity_cart);
      sKeys.put("layout/activity_category_0", com.example.ahungrystomach.R.layout.activity_category);
      sKeys.put("layout/activity_check_out_0", com.example.ahungrystomach.R.layout.activity_check_out);
      sKeys.put("layout/activity_detail_0", com.example.ahungrystomach.R.layout.activity_detail);
      sKeys.put("layout/activity_home_0", com.example.ahungrystomach.R.layout.activity_home);
      sKeys.put("layout/activity_search_0", com.example.ahungrystomach.R.layout.activity_search);
      sKeys.put("layout/activity_splash_0", com.example.ahungrystomach.R.layout.activity_splash);
      sKeys.put("layout/item_cart_0", com.example.ahungrystomach.R.layout.item_cart);
      sKeys.put("layout/item_category_0", com.example.ahungrystomach.R.layout.item_category);
      sKeys.put("layout/item_checkout_0", com.example.ahungrystomach.R.layout.item_checkout);
      sKeys.put("layout/item_meal_0", com.example.ahungrystomach.R.layout.item_meal);
      sKeys.put("layout/item_popular_0", com.example.ahungrystomach.R.layout.item_popular);
      sKeys.put("layout/item_search_0", com.example.ahungrystomach.R.layout.item_search);
      sKeys.put("layout/item_searched_0", com.example.ahungrystomach.R.layout.item_searched);
    }
  }
}
