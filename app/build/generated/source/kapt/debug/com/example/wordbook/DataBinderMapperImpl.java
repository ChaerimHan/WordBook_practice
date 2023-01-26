package com.example.wordbook;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.wordbook.databinding.FragmentEditVocaBindingImpl;
import com.example.wordbook.databinding.FragmentMainBindingImpl;
import com.example.wordbook.databinding.FragmentRegisterVocaBindingImpl;
import com.example.wordbook.databinding.FragmentStudyBindingImpl;
import com.example.wordbook.databinding.FragmentTestBindingImpl;
import com.example.wordbook.databinding.FragmentVocaListBindingImpl;
import com.example.wordbook.databinding.ViewholderVocaBindingImpl;
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
  private static final int LAYOUT_FRAGMENTEDITVOCA = 1;

  private static final int LAYOUT_FRAGMENTMAIN = 2;

  private static final int LAYOUT_FRAGMENTREGISTERVOCA = 3;

  private static final int LAYOUT_FRAGMENTSTUDY = 4;

  private static final int LAYOUT_FRAGMENTTEST = 5;

  private static final int LAYOUT_FRAGMENTVOCALIST = 6;

  private static final int LAYOUT_VIEWHOLDERVOCA = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_edit_voca, LAYOUT_FRAGMENTEDITVOCA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_register_voca, LAYOUT_FRAGMENTREGISTERVOCA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_study, LAYOUT_FRAGMENTSTUDY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_test, LAYOUT_FRAGMENTTEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_voca_list, LAYOUT_FRAGMENTVOCALIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.viewholder_voca, LAYOUT_VIEWHOLDERVOCA);
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
        case  LAYOUT_FRAGMENTEDITVOCA: {
          if ("layout/fragment_edit_voca_0".equals(tag)) {
            return new FragmentEditVocaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_voca is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTERVOCA: {
          if ("layout/fragment_register_voca_0".equals(tag)) {
            return new FragmentRegisterVocaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register_voca is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTUDY: {
          if ("layout/fragment_study_0".equals(tag)) {
            return new FragmentStudyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_study is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTEST: {
          if ("layout/fragment_test_0".equals(tag)) {
            return new FragmentTestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_test is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVOCALIST: {
          if ("layout/fragment_voca_list_0".equals(tag)) {
            return new FragmentVocaListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_voca_list is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWHOLDERVOCA: {
          if ("layout/viewholder_voca_0".equals(tag)) {
            return new ViewholderVocaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for viewholder_voca is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "onClick");
      sKeys.put(2, "viewModel");
      sKeys.put(3, "word");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/fragment_edit_voca_0", com.example.wordbook.R.layout.fragment_edit_voca);
      sKeys.put("layout/fragment_main_0", com.example.wordbook.R.layout.fragment_main);
      sKeys.put("layout/fragment_register_voca_0", com.example.wordbook.R.layout.fragment_register_voca);
      sKeys.put("layout/fragment_study_0", com.example.wordbook.R.layout.fragment_study);
      sKeys.put("layout/fragment_test_0", com.example.wordbook.R.layout.fragment_test);
      sKeys.put("layout/fragment_voca_list_0", com.example.wordbook.R.layout.fragment_voca_list);
      sKeys.put("layout/viewholder_voca_0", com.example.wordbook.R.layout.viewholder_voca);
    }
  }
}
