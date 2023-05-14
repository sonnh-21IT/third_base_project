package com.example.ahungrystomach.databinding;
import com.example.ahungrystomach.R;
import com.example.ahungrystomach.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCheckOutBindingImpl extends ActivityCheckOutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.actionbar, 1);
        sViewsWithIds.put(R.id.btn_back, 2);
        sViewsWithIds.put(R.id.title_bar, 3);
        sViewsWithIds.put(R.id.rc_item, 4);
        sViewsWithIds.put(R.id.title_billing, 5);
        sViewsWithIds.put(R.id.edt_phone, 6);
        sViewsWithIds.put(R.id.edt_name, 7);
        sViewsWithIds.put(R.id.nf_error_name_phone, 8);
        sViewsWithIds.put(R.id.edt_distric, 9);
        sViewsWithIds.put(R.id.nf_error_distric, 10);
        sViewsWithIds.put(R.id.edt_city, 11);
        sViewsWithIds.put(R.id.nf_error_city, 12);
        sViewsWithIds.put(R.id.edt_commune, 13);
        sViewsWithIds.put(R.id.nf_error_commune, 14);
        sViewsWithIds.put(R.id.edt_location, 15);
        sViewsWithIds.put(R.id.nf_error_location, 16);
        sViewsWithIds.put(R.id.pay_method, 17);
        sViewsWithIds.put(R.id.tv_pay, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCheckOutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityCheckOutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[15]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[6]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[8]
            , (android.widget.CheckBox) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[18]
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