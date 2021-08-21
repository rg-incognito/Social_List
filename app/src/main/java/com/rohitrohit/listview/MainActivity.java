package com.rohitrohit.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.rec_view);

        ArrayList<String> social = new ArrayList<>();
        social.add("Instagram");
        social.add("Facebook");
        social.add("Whatsapp");
        social.add("Linkedin");
        social.add("Github");
        social.add("Discord");
        social.add("Slack");
        social.add("Slack");
        social.add("Twitter");
        social.add("Red Twitter");


        ArrayList<String> img = new ArrayList<>();
        img.add("https://store-images.s-microsoft.com/image/apps.31997.13510798887167234." +
                "6cd52261-a276-49cf-9b6b-9ef8491fb799.30e70ce4-33c5-43d6-9af1-491fe4679377?mode=scale&q=90&h=300&w=300");
        img.add("https://s3-symbol-logo.tradingview.com/facebook--600.png");
        img.add("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/WhatsApp.svg/1200px-WhatsApp.svg.png");
        img.add("https://media-exp1.licdn.com/dms/image/C4D0BAQGyOWvr4W0Pow/company-" +
                "logo_200_200/0/1590003577120?e=2159024400&v=beta&t=CtsDFVp0TAdwyg73A8F82MohzKpAQy-pUGA13atPG6A");
        img.add("https://pbs.twimg.com/profile_images/1414990564408262661/r6YemvF9_400x400.jpg");
        img.add("https://i.gadgets360cdn.com/large/discord_main_website_1615986172916.jpg?downsize=950:*&output-quality=80");
        img.add("https://www.howtogeek.com/wp-content/uploads/2019/06/slack_logo.png?height=200p&trim=2,2,2,2");
        img.add("https://www.howtogeek.com/wp-content/uploads/2019/06/slack_logo.png?height=200p&trim=2,2,2,2");
        img.add("https://www.creativefreedom.co.uk/wp-content/uploads/2017/06/Twitter-featured.png");
        img.add("data:image/png;base64,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" +
                "LtegR6ZyizH3S2nHJOZaLE0T29BcZ1N6pldi6MTm/QjLgKBQCAQCAQCgUAgEAgEAkGP+Q/GPc7ukXpHEAAAAABJRU5ErkJggg==");


        Adapter adapter =new Adapter(social,img);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,false));

        recyclerView.setAdapter(adapter);





    }
}