package in.org.icaaar_crida.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.org.icaar_crida.R;

import static in.org.icaar_crida.activity.MainActivity.ABOUT_US;
import static in.org.icaar_crida.activity.MainActivity.AKMU;
import static in.org.icaar_crida.activity.MainActivity.Agrometeorology_Databank;
import static in.org.icaar_crida.activity.MainActivity.CLIMATE_CHANGE;
import static in.org.icaar_crida.activity.MainActivity.CONTACT_US;
import static in.org.icaar_crida.activity.MainActivity.Conference_Facilities;
import static in.org.icaar_crida.activity.MainActivity.GLASS_HOUSE;
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


    // TODO: Rename and change types of parameters
    private int mParam1;

    private OnFragmentInteractionListener mListener;

    private TextView mTextViewContent;

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
        mTextViewContent.setMovementMethod(new ScrollingMovementMethod());

        switch (mParam1) {
            case ABOUT_US:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.introduction)));
                break;
            case LOCATION:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.location)));
                break;
            case MANDATE:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.mandate)));
                break;
            case ORGANIZATION:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.organization)));
                break;
            case HUMAN_RESOURCE:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.human_resource)));
                break;
            case ROAD_MAP_FOR_INFRASTRUCTURE:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.road_map_for_future)));
                break;
            case NICRA:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.nicra)));
                break;
            case CONTACT_US:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.contact_address)));
                break;
            case LABORATORIES:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.laboratories)));
                break;

            case GLASS_HOUSE:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.glass_house)));
                break;
            case CLIMATE_CHANGE:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.climate_change)));
                break;
            case Agrometeorology_Databank:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.agrometerology_data_bank)));
                break;
            case Library:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.library)));
                break;
            case AKMU:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.akmu)));
                break;
            case ITMU:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.itmu)));
                break;
            case Research_Farms:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.research_farms)));
                break;
            case Conference_Facilities:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.conference_facilities)));
                break;
            case Museum:
                mTextViewContent.setText(Html.fromHtml(getResources().getString(R.string.museum)));
                break;

        }
        return view;
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
