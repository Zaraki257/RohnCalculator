package com.example.zaraki.calculator.databinding;
import com.example.zaraki.calculator.R;
import com.example.zaraki.calculator.BR;
import android.view.View;
public class ActivityMainBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
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
    }
    // views
    public final android.widget.Button btn0;
    public final android.widget.Button btn1;
    public final android.widget.Button btn2;
    public final android.widget.Button btn3;
    public final android.widget.Button btn4;
    public final android.widget.Button btn5;
    public final android.widget.Button btn6;
    public final android.widget.Button btn7;
    public final android.widget.Button btn8;
    public final android.widget.Button btn9;
    public final android.widget.Button btnAns;
    public final android.widget.Button btnClr;
    public final android.widget.Button btnDiv;
    public final android.widget.Button btnDot;
    public final android.widget.Button btnMin;
    public final android.widget.Button btnMul;
    public final android.widget.Button btnPlus;
    public final android.widget.EditText editText;
    private final android.support.constraint.ConstraintLayout mboundView0;
    public final android.widget.TextView textView;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds);
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
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

    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.zaraki.calculator.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.zaraki.calculator.R.layout.activity_main, null, false), bindingComponent);
    }
    public static ActivityMainBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
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