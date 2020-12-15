package com.mohammed.hypermarketandroidtask.databinding;
import com.mohammed.hypermarketandroidtask.R;
import com.mohammed.hypermarketandroidtask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSearchBindingImpl extends ItemSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline13, 3);
        sViewsWithIds.put(R.id.imageView26, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (cn.gavinliu.android.lib.shapedimageview.ShapedImageView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.productName.setTag(null);
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
        if (BR.product == variableId) {
            setProduct((com.mohammed.hypermarketandroidtask.datalayer.Product) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable com.mohammed.hypermarketandroidtask.datalayer.Product Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.product);
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
        com.mohammed.hypermarketandroidtask.datalayer.Product product = mProduct;
        java.lang.String productImagePath = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (product != null) {
                    // read product.image_path
                    productImagePath = product.getImage_path();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.mohammed.hypermarketandroidtask.BindingUtileKt.setContentSection(this.image, productImagePath);
            com.mohammed.hypermarketandroidtask.BindingUtileKt.setPateintnameWaitningList(this.productName, product);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}