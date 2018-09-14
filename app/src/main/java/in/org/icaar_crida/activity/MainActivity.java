package in.org.icaar_crida.activity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import in.org.icaaar_crida.fragment.AboutUsFragment;
import in.org.icaar_crida.R;


public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener, AboutUsFragment.OnFragmentInteractionListener {

    public static final int ABOUT_US = 1;
    public static final int LOCATION = 2;
    public static final int MANDATE = 3;
    public static final int ORGANIZATION = 4;
    public static final int HUMAN_RESOURCE = 5;
    public static final int INFRASTRUCTURE = 6;
    public static final int ROAD_MAP_FOR_INFRASTRUCTURE = 7;
    public static final int NICRA = 8;
    public static final int CONTACT_US = 9;
    public static final int LABORATORIES = 10;
    public static final int GLASS_HOUSE = 11;
    public static final int CLIMATE_CHANGE = 12;
    public static final int Agrometeorology_Databank = 13;
    public static final int Library = 14;
    public static final int AKMU = 15;
    public static final int ITMU = 16;
    public static final int Research_Farms = 17;
    public static final int Conference_Facilities = 18;
    public static final int Guest = 19;
    public static final int Museum = 20;
    public static final int Achievements = 21;
    public static final int Training_Consultancies = 22;
    public static final int TEAM = 23;
    public static final int COPY_RIGHT = 24;
    public static final int DISCLAIMER = 25;
    public static final int PRIVACY_STATEMENT = 26;

    FrameLayout frameLayout;
    ImageButton mImageButton;
    ImageButton mImageButtonHome;
    Handler mHandler;
    TextView mTvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
//        toolbar.setTitle("");
        mHandler = new Handler();
        frameLayout = findViewById(R.id.frame);
        mImageButton = findViewById(R.id.ib_menu);
        mTvTitle = findViewById(R.id.tv_title);
        mImageButtonHome = findViewById(R.id.ib_home);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMenu(view);
            }
        });
        loadFragment(AboutUsFragment.newInstance(ABOUT_US), getString(R.string.title_about_us));
        mTvTitle.setText(R.string.title_about_us);
        mImageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(AboutUsFragment.newInstance(ABOUT_US), getString(R.string.title_about_us));
                mTvTitle.setText(R.string.title_about_us);

            }
        });

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

  /*  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    public void showMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_main);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.aboutus:
                loadFragment(AboutUsFragment.newInstance(ABOUT_US), getString(R.string.title_about_us));
                mTvTitle.setText(R.string.title_about_us);

                break;
            case R.id.location:
                loadFragment(AboutUsFragment.newInstance(LOCATION), getString(R.string.title_location));
                mTvTitle.setText(R.string.title_location);

                break;
            case R.id.mandate:
                loadFragment(AboutUsFragment.newInstance(MANDATE), getString(R.string.title_mandate));
                mTvTitle.setText(R.string.title_mandate);

                break;
            case R.id.organization:
                loadFragment(AboutUsFragment.newInstance(ORGANIZATION), getString(R.string.organization));
                mTvTitle.setText(R.string.title_organization);

                break;
            case R.id.human_resource:
                loadFragment(AboutUsFragment.newInstance(HUMAN_RESOURCE), getString(R.string.human_resource));
                mTvTitle.setText(R.string.title_human_resource);
                break;
                case R.id.achievements:
                loadFragment(AboutUsFragment.newInstance(Achievements), getString(R.string.achievements));
                mTvTitle.setText(R.string.title_achievements);

                break;

                case R.id.training_consultancies:
                loadFragment(AboutUsFragment.newInstance(Training_Consultancies), getString(R.string.training_consultancies));
                mTvTitle.setText(R.string.title_training_consultancies);

                break;
            case R.id.road_map_future:
                loadFragment(AboutUsFragment.newInstance(ROAD_MAP_FOR_INFRASTRUCTURE), getString(R.string.title_road_map_for_future));
                mTvTitle.setText(R.string.title_infrastructure);

                break;
            case R.id.nicra:
                loadFragment(AboutUsFragment.newInstance(NICRA), getString(R.string.title_nicra));
                mTvTitle.setText(R.string.title_nicra);

                break;
            case R.id.contact_us:
                loadFragment(AboutUsFragment.newInstance(CONTACT_US), getString(R.string.title_contact_us));
                mTvTitle.setText(R.string.title_contact_us);

                break;
            case R.id.team:
                loadFragment(AboutUsFragment.newInstance(TEAM), getString(R.string.title_team));
                mTvTitle.setText(R.string.title_team);

                break;
            case R.id.copyright:
                loadFragment(AboutUsFragment.newInstance(COPY_RIGHT), getString(R.string.title_copy_right));
                mTvTitle.setText(R.string.title_copy_right);

                break;
            case R.id.disclaimer:
                loadFragment(AboutUsFragment.newInstance(DISCLAIMER), getString(R.string.title_disclaimer));
                mTvTitle.setText(R.string.title_disclaimer);

                break;
            case R.id.priv_statement:
                loadFragment(AboutUsFragment.newInstance(PRIVACY_STATEMENT), getString(R.string.title_statement));
                mTvTitle.setText(R.string.title_statement);

                break;

            //Sub Menus
            case R.id.laboratories:
                loadFragment(AboutUsFragment.newInstance(LABORATORIES), getString(R.string.title_laboraturies));
                mTvTitle.setText(R.string.title_laboraturies);
                break;

            case R.id.glass_house:
                loadFragment(AboutUsFragment.newInstance(GLASS_HOUSE), getString(R.string.title_glass_house));
                mTvTitle.setText(R.string.title_glass_house);
                break;

            case R.id.climate_change:
                loadFragment(AboutUsFragment.newInstance(CLIMATE_CHANGE), getString(R.string.title_climate_change_research_facilities));
                mTvTitle.setText(R.string.title_climate_change_research_facilities);
                break;

            case R.id.agrometeorology_databank:
                loadFragment(AboutUsFragment.newInstance(Agrometeorology_Databank), getString(R.string.title_agrometeorology_databank));
                mTvTitle.setText(R.string.title_agrometeorology_databank);
                break;
            case R.id.library:
                loadFragment(AboutUsFragment.newInstance(Library), getString(R.string.title_library));
                mTvTitle.setText(R.string.title_library);
                break;
            case R.id.akmu:
                loadFragment(AboutUsFragment.newInstance(AKMU), getString(R.string.title_AKMU));
                mTvTitle.setText(R.string.title_AKMU);
                break;
            case R.id.itmu:
                loadFragment(AboutUsFragment.newInstance(ITMU), getString(R.string.title_ITMU));
                mTvTitle.setText(R.string.title_ITMU);
                break;

            case R.id.research_farms:
                loadFragment(AboutUsFragment.newInstance(Research_Farms), getString(R.string.title_research_farms));
                mTvTitle.setText(R.string.title_research_farms);
                break;

            case R.id.conference_facilities:
                loadFragment(AboutUsFragment.newInstance(Conference_Facilities), getString(R.string.title_conference_facilities));
                mTvTitle.setText(R.string.title_conference_facilities);
                break;

                case R.id.guest:
                loadFragment(AboutUsFragment.newInstance(Guest), getString(R.string.title_guest));
                mTvTitle.setText(R.string.title_guest);
                break;

            case R.id.museum:
                loadFragment(AboutUsFragment.newInstance(Museum), getString(R.string.title_museum));
                mTvTitle.setText(R.string.title_museum);
                break;

        }
        return false;
    }

    /**
     * Load / replace the fragment to frame container
     *
     * @param fragment
     */
    private void loadFragment(final Fragment fragment, final String tag) {
//        mCurrentFragmentTag = TAG;
        Runnable mPendingRunnable = new Runnable() {
            @Override
            public void run() {
                // update the main content by replacing fragments
                /*Bundle bundel = new Bundle();
                bundel.putInt(ARG_MENU_TYPE ,);
                fragment.setArguments(bundel);*/
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
              /*  fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                        android.R.anim.fade_out);*/
                fragmentTransaction.replace(R.id.frame, fragment, tag);
                fragmentTransaction.commitAllowingStateLoss();
            }
        };
        // If mPendingRunnable is not null, then add to the message queue
        if (mPendingRunnable != null) {
            mHandler.post(mPendingRunnable);
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
