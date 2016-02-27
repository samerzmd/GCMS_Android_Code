package gcmquickstart.com.samples.android.play.gcm.pushgcmtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NotificationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        String message=getIntent().getStringExtra("message");
        String title=getIntent().getStringExtra("title");
        int person=getIntent().getIntExtra("person",0);
        ImageView personImage= (ImageView) findViewById(R.id.person);
        switch (person){
            case 1:
                personImage.setImageResource(R.drawable.pirateking);
                break;
            case 0:
            default:
                personImage.setImageResource(R.drawable.sam);
                break;
        }

        TextView messageContent= (TextView) findViewById(R.id.message);
        messageContent.setText(message);

        ((Button)findViewById(R.id.dismiss_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        setTitle(title);
    }
}
