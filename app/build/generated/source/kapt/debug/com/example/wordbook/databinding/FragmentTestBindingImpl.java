package com.example.wordbook.databinding;
import com.example.wordbook.R;
import com.example.wordbook.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTestBindingImpl extends FragmentTestBinding implements com.example.wordbook.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.question_container, 7);
        sViewsWithIds.put(R.id.catname, 8);
        sViewsWithIds.put(R.id.candidate_container, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentTestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.buttonMeans1.setTag(null);
        this.buttonMeans2.setTag(null);
        this.buttonMeans3.setTag(null);
        this.buttonMeans4.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.resultState.setTag(null);
        this.textEnglish.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.example.wordbook.generated.callback.OnClickListener(this, 4);
        mCallback3 = new com.example.wordbook.generated.callback.OnClickListener(this, 2);
        mCallback4 = new com.example.wordbook.generated.callback.OnClickListener(this, 3);
        mCallback2 = new com.example.wordbook.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.wordbook.test.TestViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.wordbook.test.TestViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMResultState((androidx.lifecycle.LiveData<com.example.wordbook.test.TestViewModel.ResultState>) object, fieldId);
            case 1 :
                return onChangeViewModelMTestUnit((androidx.lifecycle.LiveData<com.example.wordbook.test.TestViewModel.TestUnit>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMResultState(androidx.lifecycle.LiveData<com.example.wordbook.test.TestViewModel.ResultState> ViewModelMResultState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMTestUnit(androidx.lifecycle.LiveData<com.example.wordbook.test.TestViewModel.TestUnit> ViewModelMTestUnit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<com.example.wordbook.test.TestViewModel.ResultState> viewModelMResultState = null;
        com.example.wordbook.test.TestViewModel.TestUnit viewModelMTestUnitGetValue = null;
        androidx.lifecycle.LiveData<com.example.wordbook.test.TestViewModel.TestUnit> viewModelMTestUnit = null;
        com.example.wordbook.test.TestViewModel viewModel = mViewModel;
        com.example.wordbook.test.TestViewModel.ResultState viewModelMResultStateGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.MResultState
                        viewModelMResultState = viewModel.getMResultState();
                    }
                    updateLiveDataRegistration(0, viewModelMResultState);


                    if (viewModelMResultState != null) {
                        // read viewModel.MResultState.getValue()
                        viewModelMResultStateGetValue = viewModelMResultState.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.MTestUnit
                        viewModelMTestUnit = viewModel.getMTestUnit();
                    }
                    updateLiveDataRegistration(1, viewModelMTestUnit);


                    if (viewModelMTestUnit != null) {
                        // read viewModel.MTestUnit.getValue()
                        viewModelMTestUnitGetValue = viewModelMTestUnit.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.buttonMeans1.setOnClickListener(mCallback2);
            this.buttonMeans2.setOnClickListener(mCallback3);
            this.buttonMeans3.setOnClickListener(mCallback4);
            this.buttonMeans4.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.wordbook.util.BindingAdaptersKt.setFirstCandidate(this.buttonMeans1, viewModelMTestUnitGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setSecondCandidate(this.buttonMeans2, viewModelMTestUnitGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setThirdCandidate(this.buttonMeans3, viewModelMTestUnitGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setFourthCandidate(this.buttonMeans4, viewModelMTestUnitGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setQuestionEnglish(this.textEnglish, viewModelMTestUnitGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.wordbook.util.BindingAdaptersKt.setResultState(this.resultState, viewModelMResultStateGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.test.TestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onClickCandidate(3);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.test.TestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onClickCandidate(1);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.test.TestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onClickCandidate(2);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.test.TestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onClickCandidate(0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.MResultState
        flag 1 (0x2L): viewModel.MTestUnit
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}