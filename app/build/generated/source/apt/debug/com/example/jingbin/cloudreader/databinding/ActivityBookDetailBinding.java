package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBookDetailBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.widget.LinearLayout activityBookDetail;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    public final android.widget.TextView tvBookSummary;
    // variables
    @Nullable
    private com.example.jingbin.cloudreader.bean.book.BookDetailBean mBookDetailBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBookDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.activityBookDetail = (android.widget.LinearLayout) bindings[0];
        this.activityBookDetail.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.tvBookSummary = (android.widget.TextView) bindings[1];
        this.tvBookSummary.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.bookDetailBean == variableId) {
            setBookDetailBean((com.example.jingbin.cloudreader.bean.book.BookDetailBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBookDetailBean(@Nullable com.example.jingbin.cloudreader.bean.book.BookDetailBean BookDetailBean) {
        updateRegistration(0, BookDetailBean);
        this.mBookDetailBean = BookDetailBean;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bookDetailBean);
        super.requestRebind();
    }
    @Nullable
    public com.example.jingbin.cloudreader.bean.book.BookDetailBean getBookDetailBean() {
        return mBookDetailBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBookDetailBean((com.example.jingbin.cloudreader.bean.book.BookDetailBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBookDetailBean(com.example.jingbin.cloudreader.bean.book.BookDetailBean BookDetailBean, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.summary) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.author_intro) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.catalog) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String bookDetailBeanCatalog = null;
        java.lang.String bookDetailBeanSummary = null;
        java.lang.String bookDetailBeanAuthorIntro = null;
        com.example.jingbin.cloudreader.bean.book.BookDetailBean bookDetailBean = mBookDetailBean;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (bookDetailBean != null) {
                        // read bookDetailBean.catalog
                        bookDetailBeanCatalog = bookDetailBean.getCatalog();
                    }
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (bookDetailBean != null) {
                        // read bookDetailBean.summary
                        bookDetailBeanSummary = bookDetailBean.getSummary();
                    }
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (bookDetailBean != null) {
                        // read bookDetailBean.author_intro
                        bookDetailBeanAuthorIntro = bookDetailBean.getAuthor_intro();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, bookDetailBeanAuthorIntro);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, bookDetailBeanCatalog);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvBookSummary, bookDetailBeanSummary);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityBookDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityBookDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityBookDetailBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_book_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityBookDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityBookDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_book_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityBookDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityBookDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_book_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityBookDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): bookDetailBean
        flag 1 (0x2L): bookDetailBean.summary
        flag 2 (0x3L): bookDetailBean.author_intro
        flag 3 (0x4L): bookDetailBean.catalog
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}