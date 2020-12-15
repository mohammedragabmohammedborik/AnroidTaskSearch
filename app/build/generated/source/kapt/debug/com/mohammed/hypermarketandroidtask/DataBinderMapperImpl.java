package com.mohammed.hypermarketandroidtask;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.mohammed.hypermarketandroidtask.databinding.HomeFragmentBindingImpl;
import com.mohammed.hypermarketandroidtask.databinding.ItemSearchBindingImpl;
import com.mohammed.hypermarketandroidtask.databinding.SearchFragmentBindingImpl;
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
  private static final int LAYOUT_HOMEFRAGMENT = 1;

  private static final int LAYOUT_ITEMSEARCH = 2;

  private static final int LAYOUT_SEARCHFRAGMENT = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mohammed.hypermarketandroidtask.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mohammed.hypermarketandroidtask.R.layout.item_search, LAYOUT_ITEMSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mohammed.hypermarketandroidtask.R.layout.search_fragment, LAYOUT_SEARCHFRAGMENT);
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
        case  LAYOUT_HOMEFRAGMENT: {
          if ("layout/home_fragment_0".equals(tag)) {
            return new HomeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCH: {
          if ("layout/item_search_0".equals(tag)) {
            return new ItemSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_search is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHFRAGMENT: {
          if ("layout/search_fragment_0".equals(tag)) {
            return new SearchFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_fragment is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "product");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/home_fragment_0", com.mohammed.hypermarketandroidtask.R.layout.home_fragment);
      sKeys.put("layout/item_search_0", com.mohammed.hypermarketandroidtask.R.layout.item_search);
      sKeys.put("layout/search_fragment_0", com.mohammed.hypermarketandroidtask.R.layout.search_fragment);
    }
  }
}
