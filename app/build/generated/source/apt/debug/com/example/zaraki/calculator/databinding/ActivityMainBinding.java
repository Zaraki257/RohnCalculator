package com.example.zaraki.calculator.databinding;
import com.example.zaraki.calculator.R;
import com.example.zaraki.calculator.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btnAns, 1);
        sViewsWithIds.put(R.id.btn3, 2);
        sViewsWithIds.put(R.id.btn6, 3);
        sViewsWithIds.put(R.id.btn9, 4);
        sViewsWithIds.put(R.id.btn0, 5);
        sViewsWithIds.put(R.id.btn2, 6);
        sViewsWithIds.put(R.id.btn5, 7);
        sViewsWithIds.put(R.id.btn8, 8);
        sViewsWithIds.put(R.id.editText, 9);
        sViewsWithIds.put(R.id.textView, 10);
        sViewsWithIds.put(R.id.btnDot, 11);
        sViewsWithIds.put(R.id.btn1, 12);
        sViewsWithIds.put(R.id.btn4, 13);
        sViewsWithIds.put(R.id.btn7, 14);
        sViewsWithIds.put(R.id.btnMin, 15);
        sViewsWithIds.put(R.id.btnPlus, 16);
        sViewsWithIds.put(R.id.btnClr, 17);
        sViewsWithIds.put(R.id.btnMul, 18);
        sViewsWithIds.put(R.id.btnDiv, 19);
        sViewsWithIds.put(R.id.barrier2, 20);
        sViewsWithIds.put(R.id.barrier3, 21);
        sViewsWithIds.put(R.id.barrier4, 22);
        sViewsWithIds.put(R.id.barrier5, 23);
    }
    // views
    @NonNull
    public final android.support.constraint.Barrier barrier2;
    @NonNull
    public final android.support.constraint.Barrier barrier3;
    @NonNull
    public final android.support.constraint.Barrier barrier4;
    @NonNull
    public final android.support.constraint.Barrier barrier5;
    @NonNull
    public final android.widget.Button btn0;
    @NonNull
    public final android.widget.Button btn1;
    @NonNull
    public final android.widget.Button btn2;
    @NonNull
    public final android.widget.Button btn3;
    @NonNull
    public final android.widget.Button btn4;
    @NonNull
    public final android.widget.Button btn5;
    @NonNull
    public final android.widget.Button btn6;
    @NonNull
    public final android.widget.Button btn7;
    @NonNull
    public final android.widget.Button btn8;
    @NonNull
    public final android.widget.Button btn9;
    @NonNull
    public final android.widget.Button btnAns;
    @NonNull
    public final android.widget.Button btnClr;
    @NonNull
    public final android.widget.Button btnDiv;
    @NonNull
    public final android.widget.Button btnDot;
    @NonNull
    public final android.widget.Button btnMin;
    @NonNull
    public final android.widget.Button btnMul;
    @NonNull
    public final android.widget.Button btnPlus;
    @NonNull
    public final android.widget.EditText editText;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.TextView textView;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds);
        this.barrier2 = (android.support.constraint.Barrier) bindings[20];
        this.barrier3 = (android.support.constraint.Barrier) bindings[21];
        this.barrier4 = (android.support.constraint.Barrier) bindings[22];
        this.barrier5 = (android.support.constraint.Barrier) bindings[23];
        this.btn0 = (android.widget.Button) bindings[5];
        this.btn1 = (android.widget.Button) bindings[12];
        this.btn2 = (android.widget.Button) bindings[6];
        this.btn3 = (android.widget.Button) bindings[2];
        this.btn4 = (android.widget.Button) bindings[13];
        this.btn5 = (android.widget.Button) bindings[7];
        this.btn6 = (android.widget.Button) bindings[3];
        this.btn7 = (android.widget.Button) bindings[14];
        this.btn8 = (android.widget.Button) bindings[8];
        this.btn9 = (android.widget.Button) bindings[4];
        this.btnAns = (android.widget.Button) bindings[1];
        this.btnClr = (android.widget.Button) bindings[17];
        this.btnDiv = (android.widget.Button) bindings[19];
        this.btnDot = (android.widget.Button) bindings[11];
        this.btnMin = (android.widget.Button) bindings[15];
        this.btnMul = (android.widget.Button) bindings[18];
        this.btnPlus = (android.widget.Button) bindings[16];
        this.editText = (android.widget.EditText) bindings[9];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView = (android.widget.TextView) bindings[10];
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

    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.zaraki.calculator.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.zaraki.calculator.R.layout.activity_main, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}