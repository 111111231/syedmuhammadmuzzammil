package com.smm.muzzammil.makeuseful.GridView;
/**
 * Created by Syed Muhammad Muzzammil on 10/18/16.
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.smm.muzzammil.makeuseful.R;
import com.smm.muzzammil.makeuseful.Utils.Helper;

public class GridViewAdapter extends BaseAdapter{
    private Context mContext;
    private final String[] string;
    private final int[] Imageid;

    public GridViewAdapter(Context c,String[] string,int[] Imageid ) {
        mContext = c;
        this.Imageid = Imageid;
        this.string = string;
    }

    @Override
    public int getCount() {
        return string.length;
    }

    @Override
    public Object getItem(int p) {
        return null;
    }

    @Override
    public long getItemId(int p) {
        return 0;
    }
    @Override
    public View getView(final int p, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.gridview_custom_layout, null);
            TextView textView = (TextView) grid.findViewById(R.id.gridview_text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.gridview_image);
            textView.setText(string[p]);
            imageView.setBackground((Drawable)new BitmapDrawable(Helper.getRoundedCornerBitmap(BitmapFactory.decodeResource(mContext.getResources(), Imageid[p]))));

        } else {
            grid = (View) convertView;
        }

        return grid;
    }

}
