package com.example.mds

import android.content.Context;
import android.preference.TwoStatePreference;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by giri on 20/8/17.
 */

public class FeedbackAdapter extends ArrayAdapter<Feedback> {
    static ArrayList<String> names = new ArrayList<String>();
    static ArrayList<String> types = new ArrayList<String>();
    static ArrayList<String> desc = new ArrayList<String>();

    public FeedbackAdapter(Context context, ArrayList<Feedback> feedbacks){
        super(context,0,feedbacks);
        names.add("Sukkhi Jhumki Earrings");
        names.add("Sukkhi Dazzling Gold Plated Bangle");
        names.add("Sukkhi Wedding Jewellery Ear Cuff");
        names.add("MDS Fashions Silk Thread 3D ");
        names.add("Mango Yellow Bend Pipe Necklace");
        names.add("MDS Fashions Antique Flower Necklace");
        names.add("MDS Silk Thread with Golden Bails Necklace");
        names.add("MDS Fashions Silk Thread Necklace");
        names.add("MDS Fashions Wooden 8 mm Wood Beads");

        desc.add("This sukkhi modern gold plated earring for women is made of alloy, women love jewellery; specially traditional jewellery adore a women, they wear it on different occasion, they have special importance on ring ceremony, wedding and festive time, they can also wear it on regular basics, make your moment memorable with this range, this jewel set features a unique one of a kind traditional embellish with antic finish.");
        desc.add("This Sukkhi Dazzling Gold Plated Bangle For Women is made of Alloy. Women love jewellery; specially traditional jewellery adore a women. They wear it on different occasion. They have special importance on ring ceremony, wedding and festive time.");
        desc.add("This necklace available in different colours like Peacock Blue, Magenta, Green, Peacock Green, Light Rose with GOLDEN SILK THREAD BEADS WITH GOLDEN BEND PIPE with DOUBLE DONUT 3D DOLLAR & beautiful earring set.");
        desc.add("3D Chandabelli Dollar");
        desc.add("This necklace available in different colours like Peacock Blue, Magenta, Green, Peacock Green, Light Rose with GOLDEN SILK THREAD BEADS WITH GOLDEN BEND PIPE with DOUBLE DONUT 3D DOLLAR & beautiful earring set. This necklace made up of 6 coloured silk thread beads with white pearl and stone ball & golden chain with matching coloured kundan stone.");
        desc.add("This necklace available in different colours like Peacock Blue, Magenta, Green, Peacock Green, Light Rose with ANTIQUE GOLDAN FLOWER & beautiful ANIQUE FLOWER earring set. This necklace made up of 21 coloured silk thread beads with adjustable back rope with attractive golden chain. JHUMKA EARRING set made by 23mm base diameter with matching design to the necklace.");
        desc.add("This necklace available in different colours like Peacock Blue, Magenta, Green, Peacock Green, Light Rose with ANTIQUE GOLDAN BAILS & beautiful earring set. This necklace made up of 21 coloured silk thread beads with adjustable back rope with attractive golden chain. JHUMKA EARRING set made by 23mm base diameter with matching design to the necklace.");
        desc.add("This necklace available in different colours like Peacock Blue, Magenta, Green, Peacock Green, Light Rose with HIGH QUALITY WHITE PEARL & beautiful WHITE PEARL earring set. This necklace made up of 25 coloured silk thread beads with adjustable back rope with attractive golden chain. WHITE PEARL set with matching design to the necklace.");
        desc.add("MDS Fashions Wooden 8 mm Wood Beads for Making Silk Thread Jewellery");

        types.add("Earring");
        types.add("Bangle");
        types.add("Earring");
        types.add("Necklace");
        types.add("Necklace");
        types.add("Necklace");
        types.add("Necklace");
        types.add("Necklace");
        types.add("Beads");

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview = convertView;
        if(listview==null){
            listview = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_listview, parent, false);
        }

        Feedback currentFeedback = getItem(position);

        TextView name = (TextView)listview.findViewById(R.id.name);
        name.setText(names.get(position%9));

        TextView timestamp = (TextView)listview.findViewById(R.id.timestamp);
        timestamp.setText(types.get(position%9));

        TextView description = (TextView)listview.findViewById(R.id.description);
        description.setText(desc.get(position%9));

        ImageView image = (ImageView) listview.findViewById(R.id.logo);

        String []Stall = getContext().getResources().getStringArray(R.array.piechart);

        Log.d("Equal",currentFeedback.getStallname()+" b");
        Log.d("Equal",Stall[0]);

        String check = currentFeedback.getStallname();
        Log.d("check",check);

        switch(position%9){
            case 0: image.setImageResource(R.drawable.ear1);break;
            case 1: image.setImageResource(R.drawable.bangle);break;
            case 2: image.setImageResource(R.drawable.ear2);break;
            case 3: image.setImageResource(R.drawable.ear3);break;
            case 4: image.setImageResource(R.drawable.neck1);break;
            case 5: image.setImageResource(R.drawable.neck2);break;
            case 6: image.setImageResource(R.drawable.neck3);break;
            case 7: image.setImageResource(R.drawable.neck4);break;
            case 8: image.setImageResource(R.drawable.bead);break;
            default: image.setImageResource(R.drawable.bead);
        }


        return listview;
    }
}
