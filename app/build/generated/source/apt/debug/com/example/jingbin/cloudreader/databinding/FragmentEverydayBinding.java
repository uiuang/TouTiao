package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEverydayBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.xrv_everyday, 1);
        sViewsWithIds.put(R.id.ll_loading, 2);
        sViewsWithIds.put(R.id.iv_loading, 3);
    }
    // views
    @NonNull
    public final android.widget.ImageView ivLoading;
    @NonNull
    public final android.widget.LinearLayout llLoading;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final com.example.xrecyclerview.XRecyclerView xrvEveryday;
    // variables
    @Nullable
    private com.example.jingbin.cloudreader.bean.GankIoDataBean mGankBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEverydayBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.ivLoading = (android.widget.ImageView) bindings[3];
        this.llLoading = (android.widget.LinearLayout) bindings[2];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.xrvEveryday = (com.example.xrecyclerview.XRecyclerView) bindings[1];
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
        if (BR.gankBean == variableId) {
            setGankBean((com.example.jingbin.cloudreader.bean.GankIoDataBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGankBean(@Nullable com.example.jingbin.cloudreader.bean.GankIoDataBean GankBean) {
        this.mGankBean = GankBean;
    }
    @Nullable
    public com.example.jingbin.cloudreader.bean.GankIoDataBean getGankBean() {
        return mGankBean;
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
    public static FragmentEverydayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentEverydayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentEverydayBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.fragment_everyday, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static FragmentEverydayBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentEverydayBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.fragment_everyday, null, false), bindingComponent);
    }
    @NonNull
    public static FragmentEverydayBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentEverydayBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_everyday_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentEverydayBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): gankBean
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}