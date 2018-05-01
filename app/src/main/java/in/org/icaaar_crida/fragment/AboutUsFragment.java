package in.org.icaaar_crida.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import in.org.icaar_crida.R;

import static in.org.icaar_crida.activity.MainActivity.ABOUT_US;
import static in.org.icaar_crida.activity.MainActivity.AKMU;
import static in.org.icaar_crida.activity.MainActivity.Achievements;
import static in.org.icaar_crida.activity.MainActivity.Agrometeorology_Databank;
import static in.org.icaar_crida.activity.MainActivity.CLIMATE_CHANGE;
import static in.org.icaar_crida.activity.MainActivity.CONTACT_US;
import static in.org.icaar_crida.activity.MainActivity.Conference_Facilities;
import static in.org.icaar_crida.activity.MainActivity.GLASS_HOUSE;
import static in.org.icaar_crida.activity.MainActivity.Guest;
import static in.org.icaar_crida.activity.MainActivity.HUMAN_RESOURCE;
import static in.org.icaar_crida.activity.MainActivity.ITMU;
import static in.org.icaar_crida.activity.MainActivity.LABORATORIES;
import static in.org.icaar_crida.activity.MainActivity.LOCATION;
import static in.org.icaar_crida.activity.MainActivity.Library;
import static in.org.icaar_crida.activity.MainActivity.MANDATE;
import static in.org.icaar_crida.activity.MainActivity.Museum;
import static in.org.icaar_crida.activity.MainActivity.NICRA;
import static in.org.icaar_crida.activity.MainActivity.ORGANIZATION;
import static in.org.icaar_crida.activity.MainActivity.ROAD_MAP_FOR_INFRASTRUCTURE;
import static in.org.icaar_crida.activity.MainActivity.Research_Farms;
import static in.org.icaar_crida.activity.MainActivity.Training_Consultancies;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AboutUsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AboutUsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutUsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public static final String ARG_MENU_TYPE = "menu_type";
    private static final String ARG_PARAM2 = "param2";
    String style = " <body style=\"text-align:justify;color:black;background-color:#F8E3BD;font-size:120%;\">";

    // TODO: Rename and change types of parameters
    private int mParam1;

    private OnFragmentInteractionListener mListener;

    private TextView mTextViewContent;
    private WebView mWebView;
    private ImageView mImageViewOne, mImageViewTwo,mImageViewThree,mImageViewFour;

    public AboutUsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param menuItem Parameter 1.
     * @return A new instance of fragment AboutUsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AboutUsFragment newInstance(int menuItem) {
        AboutUsFragment fragment = new AboutUsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_MENU_TYPE, menuItem);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_MENU_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);
        mTextViewContent = view.findViewById(R.id.tv_content);
        mWebView = view.findViewById(R.id.webview);
        mImageViewOne = view.findViewById(R.id.image);
        mImageViewTwo = view.findViewById(R.id.image2);
        mImageViewThree = view.findViewById(R.id.image3);
        mImageViewFour = view.findViewById(R.id.image4);
//        mTextViewContent.setMovementMethod(new ScrollingMovementMethod());
        mTextViewContent.setVisibility(View.GONE);

        switch (mParam1) {

            case ABOUT_US:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.introduction)));
                loadContent(R.string.introduction);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mImageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.img_introduction));
                    }
                }, 1000);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case LOCATION:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.location)));
                loadContent(R.string.location);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case MANDATE:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.mandate)));
                loadContent(R.string.mandate);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case ORGANIZATION:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.organization)));
                loadContent(R.string.organization);
                mImageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.img_organization));
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case HUMAN_RESOURCE:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.human_resource)));
                loadContent(R.string.human_resource);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case ROAD_MAP_FOR_INFRASTRUCTURE:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.road_map_for_future)));
                loadContent(R.string.road_map_for_future);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case NICRA:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.nicra)));
                loadContent(R.string.nicra);
                mImageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.img_nicra));
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case CONTACT_US:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.contact_address)));
                loadContent(R.string.contact_address);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case LABORATORIES:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.laboratories)));
                loadContent(R.string.laboratories);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setImageDrawable(getResources().getDrawable(R.drawable.img_lab));
                break;

            case GLASS_HOUSE:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.glass_house)));
                loadContent(R.string.glass_house);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case CLIMATE_CHANGE:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.climate_change)));
                loadContent(R.string.climate_change);
                mImageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.img_climatechange));
                mImageViewTwo.setVisibility(View.GONE);

                break;
            case Agrometeorology_Databank:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.agrometerology_data_bank)));
                loadContent(R.string.agrometerology_data_bank);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case Library:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.library)));
                loadContent(R.string.library);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case AKMU:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.akmu)));
                loadContent(R.string.akmu);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case ITMU:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.itmu)));
                loadContent(R.string.itmu);
                mImageViewOne.setVisibility(View.GONE);
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case Research_Farms:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.research_farms)));
                loadContent(R.string.research_farms);
                mImageViewOne.setVisibility(View.VISIBLE);
                mImageViewTwo.setVisibility(View.VISIBLE);
                mImageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.img_research_form_1));
                mImageViewTwo.setImageDrawable(getResources().getDrawable(R.drawable.img_research_form_2));
                break;
            case Conference_Facilities:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.conference_facilities)));
                loadContent(R.string.conference_facilities);
                mImageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.imf_conference));
                mImageViewTwo.setVisibility(View.GONE);
                break;

            case Guest:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.guest)));
                loadContent(R.string.guest);
                mImageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.img_guest_house));
                mImageViewTwo.setVisibility(View.GONE);
                break;
            case Museum:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.museum)));
                loadContent(R.string.museum);
                mImageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.img_museum));
                mImageViewTwo.setVisibility(View.GONE);
                break;

            case Achievements:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.achievements)));
                loadContent(R.string.achievements);
                mImageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.img_achievements_one));
                mImageViewTwo.setImageDrawable(getResources().getDrawable(R.drawable.img_achievements_two));
                mImageViewThree.setImageDrawable(getResources().getDrawable(R.drawable.img_achievements_three));
                mImageViewFour.setImageDrawable(getResources().getDrawable(R.drawable.img_achievements_four));
                break;

            case Training_Consultancies:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.training_consultancies)));
                loadContent(R.string.training_consultancies);
                mImageViewOne.setImageDrawable(getResources().getDrawable(R.drawable.img_training));
                mImageViewTwo.setVisibility(View.GONE);
                break;

        }
        return view;
    }

    private void loadContent(int content) {
        if (mWebView != null)
            mWebView.loadData(style + getString(content) + "</body>", "text/html; charset=utf-8", "utf-8");

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
