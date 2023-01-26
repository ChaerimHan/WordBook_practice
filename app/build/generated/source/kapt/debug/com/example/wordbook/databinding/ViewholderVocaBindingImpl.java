package com.example.wordbook.databinding;
import com.example.wordbook.R;
import com.example.wordbook.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewholderVocaBindingImpl extends ViewholderVocaBinding implements com.example.wordbook.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewholderVocaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ViewholderVocaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.english.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.means.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.wordbook.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.onClick == variableId) {
            setOnClick((com.example.wordbook.vocalist.VocaListAdapter.VocaClickListener) variable);
        }
        else if (BR.word == variableId) {
            setWord((com.example.wordbook.database.Word) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOnClick(@Nullable com.example.wordbook.vocalist.VocaListAdapter.VocaClickListener OnClick) {
        this.mOnClick = OnClick;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.onClick);
        super.requestRebind();
    }
    public void setWord(@Nullable com.example.wordbook.database.Word Word) {
        this.mWord = Word;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.word);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.wordbook.vocalist.VocaListAdapter.VocaClickListener onClick = mOnClick;
        com.example.wordbook.database.Word word = mWord;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.example.wordbook.util.BindingAdaptersKt.setEnglish(this.english, word);
            com.example.wordbook.util.BindingAdaptersKt.setMeans(this.means, word);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // onClick != null
        boolean onClickJavaLangObjectNull = false;
        // onClick
        com.example.wordbook.vocalist.VocaListAdapter.VocaClickListener onClick = mOnClick;
        // word
        com.example.wordbook.database.Word word = mWord;



        onClickJavaLangObjectNull = (onClick) != (null);
        if (onClickJavaLangObjectNull) {



            onClick.onVocaClick(word);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): onClick
        flag 1 (0x2L): word
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}