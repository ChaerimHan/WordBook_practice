package com.example.wordbook.databinding;
import com.example.wordbook.R;
import com.example.wordbook.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStudyBindingImpl extends FragmentStudyBinding implements com.example.wordbook.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.english_container, 6);
        sViewsWithIds.put(R.id.mean_container, 7);
        sViewsWithIds.put(R.id.buttons, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.Button mboundView3;
    @NonNull
    private final android.widget.Button mboundView4;
    @NonNull
    private final android.widget.Button mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStudyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentStudyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.textView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.example.wordbook.generated.callback.OnClickListener(this, 3);
        mCallback9 = new com.example.wordbook.generated.callback.OnClickListener(this, 2);
        mCallback8 = new com.example.wordbook.generated.callback.OnClickListener(this, 1);
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
            setViewModel((com.example.wordbook.study.StudyViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.wordbook.study.StudyViewModel ViewModel) {
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
                return onChangeViewModelWord((androidx.lifecycle.LiveData<com.example.wordbook.database.Word>) object, fieldId);
            case 1 :
                return onChangeViewModelStudyType((androidx.lifecycle.LiveData<com.example.wordbook.study.StudyViewModel.StudyType>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelWord(androidx.lifecycle.LiveData<com.example.wordbook.database.Word> ViewModelWord, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStudyType(androidx.lifecycle.LiveData<com.example.wordbook.study.StudyViewModel.StudyType> ViewModelStudyType, int fieldId) {
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
        androidx.lifecycle.LiveData<com.example.wordbook.database.Word> viewModelWord = null;
        com.example.wordbook.study.StudyViewModel.StudyType viewModelStudyTypeGetValue = null;
        com.example.wordbook.study.StudyViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<com.example.wordbook.study.StudyViewModel.StudyType> viewModelStudyType = null;
        com.example.wordbook.database.Word viewModelWordGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.word
                        viewModelWord = viewModel.getWord();
                    }
                    updateLiveDataRegistration(0, viewModelWord);


                    if (viewModelWord != null) {
                        // read viewModel.word.getValue()
                        viewModelWordGetValue = viewModelWord.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.studyType
                        viewModelStudyType = viewModel.getStudyType();
                    }
                    updateLiveDataRegistration(1, viewModelStudyType);


                    if (viewModelStudyType != null) {
                        // read viewModel.studyType.getValue()
                        viewModelStudyTypeGetValue = viewModelStudyType.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.wordbook.util.BindingAdaptersKt.setMeans(this.mboundView2, viewModelWordGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setEnglish(this.textView, viewModelWordGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.wordbook.util.BindingAdaptersKt.setStudyMeansVisibility(this.mboundView2, viewModelStudyTypeGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setStudyTypeButtonText(this.mboundView4, viewModelStudyTypeGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setStudyEnglishVisibility(this.textView, viewModelStudyTypeGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback8);
            this.mboundView4.setOnClickListener(mCallback9);
            this.mboundView5.setOnClickListener(mCallback10);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.study.StudyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.loadNextWord();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.study.StudyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setNextStudyType();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.study.StudyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.loadPreviousWord();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.word
        flag 1 (0x2L): viewModel.studyType
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}