package contact.valencio.com.carousel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {
    CarouselView mCarouselView;
    //ImageView imageView;
    private int[] sampleImages = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};
    // private int[] sampleImages = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground,R.drawable.ic_stopwatch};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = findViewById(R.id.tb_bar);
        TextView mTitle = findViewById(R.id.tv_toolbar);
        CarouselView mCarouselView = findViewById(R.id.cv_img);


        mCarouselView.setPageCount(sampleImages.length);
        mCarouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}