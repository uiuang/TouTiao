package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HeaderBookDetailBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_book_detail, 8);
    }
    // views
    @NonNull
    public final android.widget.ImageView imgItemBg;
    @NonNull
    public final android.widget.ImageView ivOnePhoto;
    @NonNull
    public final android.widget.LinearLayout llBookDetail;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.widget.TextView tvOneCasts;
    @NonNull
    public final android.widget.TextView tvOneDirectors;
    @NonNull
    public final android.widget.TextView tvOneGenres;
    @NonNull
    public final android.widget.TextView tvOneRatingNumber;
    @NonNull
    public final android.widget.TextView tvOneRatingRate;
    // variables
    @Nullable
    private com.example.jingbin.cloudreader.bean.book.BooksBean mBooksBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HeaderBookDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.imgItemBg = (android.widget.ImageView) bindings[1];
        this.imgItemBg.setTag(null);
        this.ivOnePhoto = (android.widget.ImageView) bindings[2];
        this.ivOnePhoto.setTag(null);
        this.llBookDetail = (android.widget.LinearLayout) bindings[8];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvOneCasts = (android.widget.TextView) bindings[6];
        this.tvOneCasts.setTag(null);
        this.tvOneDirectors = (android.widget.TextView) bindings[3];
        this.tvOneDirectors.setTag(null);
        this.tvOneGenres = (android.widget.TextView) bindings[7];
        this.tvOneGenres.setTag(null);
        this.tvOneRatingNumber = (android.widget.TextView) bindings[5];
        this.tvOneRatingNumber.setTag(null);
        this.tvOneRatingRate = (android.widget.TextView) bindings[4];
        this.tvOneRatingRate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
        if (BR.booksBean == variableId) {
            setBooksBean((com.example.jingbin.cloudreader.bean.book.BooksBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBooksBean(@Nullable com.example.jingbin.cloudreader.bean.book.BooksBean BooksBean) {
        updateRegistration(2, BooksBean);
        this.mBooksBean = BooksBean;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.booksBean);
        super.requestRebind();
    }
    @Nullable
    public com.example.jingbin.cloudreader.bean.book.BooksBean getBooksBean() {
        return mBooksBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBooksBeanRating((com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean) object, fieldId);
            case 1 :
                return onChangeBooksBeanImages((com.example.jingbin.cloudreader.bean.moviechild.ImagesBean) object, fieldId);
            case 2 :
                return onChangeBooksBean((com.example.jingbin.cloudreader.bean.book.BooksBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBooksBeanRating(com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean BooksBeanRating, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.average) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.numRaters) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBooksBeanImages(com.example.jingbin.cloudreader.bean.moviechild.ImagesBean BooksBeanImages, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.medium) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.large) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBooksBean(com.example.jingbin.cloudreader.bean.book.BooksBean BooksBean, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.images) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.author) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.rating) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.pubdate) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.publisher) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        java.util.List<java.lang.String> booksBeanAuthor = null;
        java.lang.String tvOneRatingRateAndroidStringStringRatingBooksBeanRatingAverage = null;
        java.lang.String booksBeanPubdate = null;
        java.lang.String stringFormatUtilFormatGenresBooksBeanAuthor = null;
        java.lang.String booksBeanImagesMedium = null;
        com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean booksBeanRating = null;
        java.lang.String booksBeanRatingNumRatersTvOneRatingNumberAndroidStringStringRatingNum = null;
        java.lang.String tvOneGenresAndroidStringStringPublisherBooksBeanPublisher = null;
        int booksBeanRatingNumRaters = 0;
        java.lang.String booksBeanRatingAverage = null;
        com.example.jingbin.cloudreader.bean.moviechild.ImagesBean booksBeanImages = null;
        com.example.jingbin.cloudreader.bean.book.BooksBean booksBean = mBooksBean;
        java.lang.String booksBeanImagesLarge = null;
        java.lang.String booksBeanPublisher = null;

        if ((dirtyFlags & 0x7ffL) != 0) {


            if ((dirtyFlags & 0x484L) != 0) {

                    if (booksBean != null) {
                        // read booksBean.author
                        booksBeanAuthor = booksBean.getAuthor();
                    }


                    // read StringFormatUtil.formatGenres(booksBean.author)
                    stringFormatUtilFormatGenresBooksBeanAuthor = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatGenres(booksBeanAuthor);
            }
            if ((dirtyFlags & 0x504L) != 0) {

                    if (booksBean != null) {
                        // read booksBean.pubdate
                        booksBeanPubdate = booksBean.getPubdate();
                    }
            }
            if ((dirtyFlags & 0x41dL) != 0) {

                    if (booksBean != null) {
                        // read booksBean.rating
                        booksBeanRating = booksBean.getRating();
                    }
                    updateRegistration(0, booksBeanRating);

                if ((dirtyFlags & 0x415L) != 0) {

                        if (booksBeanRating != null) {
                            // read booksBean.rating.numRaters
                            booksBeanRatingNumRaters = booksBeanRating.getNumRaters();
                        }


                        // read (booksBean.rating.numRaters) + (@android:string/string_rating_num)
                        booksBeanRatingNumRatersTvOneRatingNumberAndroidStringStringRatingNum = (booksBeanRatingNumRaters) + (tvOneRatingNumber.getResources().getString(R.string.string_rating_num));
                }
                if ((dirtyFlags & 0x40dL) != 0) {

                        if (booksBeanRating != null) {
                            // read booksBean.rating.average
                            booksBeanRatingAverage = booksBeanRating.getAverage();
                        }


                        // read (@android:string/string_rating) + (booksBean.rating.average)
                        tvOneRatingRateAndroidStringStringRatingBooksBeanRatingAverage = (tvOneRatingRate.getResources().getString(R.string.string_rating)) + (booksBeanRatingAverage);
                }
            }
            if ((dirtyFlags & 0x466L) != 0) {

                    if (booksBean != null) {
                        // read booksBean.images
                        booksBeanImages = booksBean.getImages();
                    }
                    updateRegistration(1, booksBeanImages);

                if ((dirtyFlags & 0x426L) != 0) {

                        if (booksBeanImages != null) {
                            // read booksBean.images.medium
                            booksBeanImagesMedium = booksBeanImages.getMedium();
                        }
                }
                if ((dirtyFlags & 0x446L) != 0) {

                        if (booksBeanImages != null) {
                            // read booksBean.images.large
                            booksBeanImagesLarge = booksBeanImages.getLarge();
                        }
                }
            }
            if ((dirtyFlags & 0x604L) != 0) {

                    if (booksBean != null) {
                        // read booksBean.publisher
                        booksBeanPublisher = booksBean.getPublisher();
                    }


                    // read (@android:string/string_publisher) + (booksBean.publisher)
                    tvOneGenresAndroidStringStringPublisherBooksBeanPublisher = (tvOneGenres.getResources().getString(R.string.string_publisher)) + (booksBeanPublisher);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x426L) != 0) {
            // api target 1

            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showImgBg(this.imgItemBg, booksBeanImagesMedium);
        }
        if ((dirtyFlags & 0x446L) != 0) {
            // api target 1

            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showBookImg(this.ivOnePhoto, booksBeanImagesLarge);
        }
        if ((dirtyFlags & 0x504L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneCasts, booksBeanPubdate);
        }
        if ((dirtyFlags & 0x484L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneDirectors, stringFormatUtilFormatGenresBooksBeanAuthor);
        }
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneGenres, tvOneGenresAndroidStringStringPublisherBooksBeanPublisher);
        }
        if ((dirtyFlags & 0x415L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneRatingNumber, booksBeanRatingNumRatersTvOneRatingNumberAndroidStringStringRatingNum);
        }
        if ((dirtyFlags & 0x40dL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneRatingRate, tvOneRatingRateAndroidStringStringRatingBooksBeanRatingAverage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static HeaderBookDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HeaderBookDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<HeaderBookDetailBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.header_book_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static HeaderBookDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HeaderBookDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.header_book_detail, null, false), bindingComponent);
    }
    @NonNull
    public static HeaderBookDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HeaderBookDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/header_book_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new HeaderBookDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): booksBean.rating
        flag 1 (0x2L): booksBean.images
        flag 2 (0x3L): booksBean
        flag 3 (0x4L): booksBean.rating.average
        flag 4 (0x5L): booksBean.rating.numRaters
        flag 5 (0x6L): booksBean.images.medium
        flag 6 (0x7L): booksBean.images.large
        flag 7 (0x8L): booksBean.author
        flag 8 (0x9L): booksBean.pubdate
        flag 9 (0xaL): booksBean.publisher
        flag 10 (0xbL): null
    flag mapping end*/
    //end
}