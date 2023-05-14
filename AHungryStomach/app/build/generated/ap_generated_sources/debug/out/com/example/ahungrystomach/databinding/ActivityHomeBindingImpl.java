package com.example.ahungrystomach.databinding;
import com.example.ahungrystomach.R;
import com.example.ahungrystomach.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingImpl extends ActivityHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvhi, 1);
        sViewsWithIds.put(R.id.tv, 2);
        sViewsWithIds.put(R.id.imavatar, 3);
        sViewsWithIds.put(R.id.edtSearch, 4);
        sViewsWithIds.put(R.id.container_lottie, 5);
        sViewsWithIds.put(R.id.lottie, 6);
        sViewsWithIds.put(R.id.tvCategories, 7);
        sViewsWithIds.put(R.id.rc_category, 8);
        sViewsWithIds.put(R.id.tvPopular, 9);
        sViewsWithIds.put(R.id.rc_popular, 10);
        sViewsWithIds.put(R.id.bottombar, 11);
        sViewsWithIds.put(R.id.appbar, 12);
        sViewsWithIds.put(R.id.floatingbtn, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.bottomappbar.BottomAppBar) bindings[12]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[13]
            , (android.widget.ImageView) bindings[3]
            , (com.airbnb.lottie.LottieAnimationView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}