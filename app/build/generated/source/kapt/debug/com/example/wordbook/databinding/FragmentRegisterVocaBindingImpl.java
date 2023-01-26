package com.example.wordbook.databinding;
import com.example.wordbook.R;
import com.example.wordbook.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterVocaBindingImpl extends FragmentRegisterVocaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.english, 3);
        sViewsWithIds.put(R.id.means, 4);
        sViewsWithIds.put(R.id.confirm, 5);
        sViewsWithIds.put(R.id.imageView2, 6);
        sViewsWithIds.put(R.id.cat_text, 7);
        sViewsWithIds.put(R.id.radioGroup, 8);
        sViewsWithIds.put(R.id.toeflButton, 9);
        sViewsWithIds.put(R.id.toeicButton, 10);
        sViewsWithIds.put(R.id.suneungButton, 11);
        sViewsWithIds.put(R.id.gongsiButton, 12);
        sViewsWithIds.put(R.id.etcButton, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterVocaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterVocaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[7]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.RadioButton) bindings[12]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.RadioGroup) bindings[8]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.RadioButton) bindings[9]
            , (android.widget.RadioButton) bindings[10]
            );
        this.englishInput.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.meansInput.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.word == variableId) {
            setWord((com.example.wordbook.database.Word) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWord(@Nullable com.example.wordbook.database.Word Word) {
        this.mWord = Word;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
        java.lang.String wordEnglish = null;
        java.lang.String wordMeans = null;
        com.example.wordbook.database.Word word = mWord;

        if ((dirtyFlags & 0x3L) != 0) {



                if (word != null) {
                    // read word.english
                    wordEnglish = word.getEnglish();
                    // read word.means
                    wordMeans = word.getMeans();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.englishInput, wordEnglish);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.meansInput, wordMeans);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): word
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}