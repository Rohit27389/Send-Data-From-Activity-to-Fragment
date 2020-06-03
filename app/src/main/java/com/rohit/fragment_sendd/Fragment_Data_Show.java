package com.rohit.fragment_sendd;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_Data_Show extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String message;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public Fragment_Data_Show() {
    }

    // TODO: Rename and change types and number of parameters
    public static Fragment_Data_Show newInstance(String param1, String param2) {
        Fragment_Data_Show fragment = new Fragment_Data_Show();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment__data__show, container, false);

        Bundle bundleData = getArguments();
        if (bundleData != null) {
            String bundleMessage = bundleData.getString("key");
            TextView textView2 = (TextView) view.findViewById(R.id.text2);
            textView2.setText(bundleMessage);
        }
        TextView textView1 = (TextView) view.findViewById(R.id.text1);
        textView1.setText(message);
        return view;
    }

    public void setData(String message, int age) {
        this.message = message + age;
    }
}
