package com.emedinaa.peruvianmusic.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.emedinaa.peruvianmusic.R;
import com.emedinaa.peruvianmusic.model.Dance;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * { PageFragment.OnPageListener} interface
 * to handle interaction events.
 * Use the {@link PageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PageFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_TITLE = "title";
    private static final String ARG_DESC = "desc";
    private static final String ARG_IMAGE_PATH = "image_path";

    private String title, description,imagePath;

    private OnPageListener mListener;

    private TextView tviTitle, tviDesc;
    private ImageView iviDance;

    public PageFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static PageFragment newInstance(Dance dance) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, dance.getName());
        args.putString(ARG_DESC, dance.getDescription());
        args.putString(ARG_IMAGE_PATH, dance.getImg());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(ARG_TITLE);
            description = getArguments().getString(ARG_DESC);
            imagePath = getArguments().getString(ARG_IMAGE_PATH);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_page, container, false);
        ui(view);
        return view;
    }

    private void ui(View view) {
        tviTitle= (TextView) view.findViewById(R.id.tviTitle);
        tviDesc= (TextView) view.findViewById(R.id.tviDesc);
        iviDance= (ImageView) view.findViewById(R.id.iviDance);

        Glide.with(iviDance.getContext()).load(imagePath).into(iviDance);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tviTitle.setText(title);
        tviDesc.setText(description);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnPageListener) {
            mListener = (OnPageListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
